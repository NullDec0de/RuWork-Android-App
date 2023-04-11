package com.dreamguys.truelysell;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.dreamguys.truelysell.adapters.FavoriteListAdapter;
import com.dreamguys.truelysell.datamodel.BaseResponse;
import com.dreamguys.truelysell.datamodel.EmptyData;
import com.dreamguys.truelysell.datamodel.FavoriteListResponse;
import com.dreamguys.truelysell.interfaces.OnLoadMoreListener;
import com.dreamguys.truelysell.network.ApiClient;
import com.dreamguys.truelysell.network.ApiInterface;
import com.dreamguys.truelysell.utils.AppConstants;
import com.dreamguys.truelysell.utils.AppUtils;
import com.dreamguys.truelysell.utils.PreferenceStorage;
import com.dreamguys.truelysell.utils.ProgressDlg;
import com.dreamguys.truelysell.utils.RetrofitHandler;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;

public class FavoriteListActivity extends BaseActivity implements RetrofitHandler.RetrofitResHandler {

    @BindView(R.id.favRecycler)
    RecyclerView favRecycler;
    FavoriteListAdapter adapter;
    @BindView(R.id.tv_no_data)
    TextView tvNoData;
    @BindView(R.id.refreshFav)

    SwipeRefreshLayout refreshFav;

    public boolean isInitiated = false;

    FavoriteListAdapter favadapter;

    public boolean isLoading = false;

    LinearLayoutManager mLayoutManager;


    int providerNextPage = 1, providerPageNo;

    int listCount = 10;
    int page = 1;


    int pastVisiblesItems, visibleItemCount, totalItemCount;

    private boolean loading = true;

    FavoriteListResponse daoDoctorSearchList = new FavoriteListResponse();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_list);
        ButterKnife.bind(this);

        uiInit();
    }

    private void uiInit() {
        setToolBarTitle("Favorites");
        ivSearch.setVisibility(View.GONE);
        ivUserlogin.setVisibility(View.GONE);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        favRecycler.setLayoutManager(mLayoutManager);
        favadapter = new FavoriteListAdapter(FavoriteListActivity.this, new ArrayList<FavoriteListResponse.Data.Userfavorite>());
        favRecycler.setAdapter(favadapter);

        refreshFav.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshFav.setRefreshing(true);
                callFavList("10", "1");
            }
        });

        favRecycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                if (dy > 0) { //check for scroll down
                    visibleItemCount = mLayoutManager.getChildCount();
                    totalItemCount = mLayoutManager.getItemCount();
                    pastVisiblesItems = mLayoutManager.findFirstVisibleItemPosition();
                    page = page+1   ;

                    if (loading) {
                        if ((visibleItemCount + pastVisiblesItems) >= totalItemCount) {
                            loading = false;

                            callFavList(String.valueOf(listCount), String.valueOf(page));

                            Log.v("lassst", "Last Item Wow !");
                            // Do pagination.. i.e. fetch new data

                            loading = false;
                        }
                    }
                }
            }
        });


        callFavList(String.valueOf(listCount), String.valueOf(page));
    }

    private void callFavList(String page_count, String Page) {
        if (AppUtils.isNetworkAvailable(FavoriteListActivity.this)) {
            ProgressDlg.showProgressDialog(FavoriteListActivity.this, null, null);
            ApiInterface apiService =
                    ApiClient.getClientNoHeader().create(ApiInterface.class);
            try {
                String token = AppConstants.DEFAULTTOKEN;
                if (PreferenceStorage.getKey(AppConstants.USER_TOKEN) != null) {
                    token = PreferenceStorage.getKey(AppConstants.USER_TOKEN);
                }
                Call<FavoriteListResponse> classificationCall = apiService.getFavoriteListpag(token, page_count, Page);
                RetrofitHandler.executeRetrofit(FavoriteListActivity.this, classificationCall,
                        AppConstants.FAVORITELIST,
                        this, false);
            } catch (Exception e) {
                ProgressDlg.dismissProgressDialog();
                e.printStackTrace();
            }

        } else {
            AppUtils.showToast(FavoriteListActivity.this, getString(R.string.txt_enable_internet));
        }
    }


    @Override
    public void onSuccess(Object myRes, boolean isLoadMore, String responseType) {
        switch (responseType) {
            case AppConstants.FAVORITELIST:
                daoDoctorSearchList = (FavoriteListResponse) myRes;
                if (isLoadMore) {
                    //Remove loading item
                    favadapter.items.remove(favadapter.items.size() - 1);
                    favadapter.notifyItemRemoved(favadapter.items.size() - 1);

                }

                isInitiated = true;
                isLoading = false;

                if (daoDoctorSearchList.getData().getUserfavorites() != null && !daoDoctorSearchList.getData().getUserfavorites().isEmpty()) {
//                    favRecycler.setVisibility(View.VISIBLE);
                    refreshFav.setVisibility(View.VISIBLE);
                    tvNoData.setVisibility(View.GONE);

                    providerPageNo = Integer.parseInt(daoDoctorSearchList.getData().getcurrentPage());
                    providerNextPage = daoDoctorSearchList.getData().getnextPage();

                    if (!isLoadMore || providerPageNo == 1) {
                        favadapter.items = new ArrayList<>();
                        favRecycler.setVisibility(View.VISIBLE);
                        tvNoData.setVisibility(View.GONE);
                    }

                    favadapter.updateRecyclerView(FavoriteListActivity.this, daoDoctorSearchList.getData().getUserfavorites());


                    refreshFav.setRefreshing(false);
                } else {
                    favRecycler.setVisibility(View.GONE);
                    refreshFav.setVisibility(View.GONE);
                    tvNoData.setVisibility(View.VISIBLE);


                }
                break;

            case AppConstants.FAVORITE:
                BaseResponse res = (BaseResponse) myRes;
                Toast.makeText(FavoriteListActivity.this,
                        res.getResponseHeader().getResponseMessage(), Toast.LENGTH_SHORT).show();
                callFavList(String.valueOf(listCount), String.valueOf(page));
                break;
        }

    }

    @Override
    public void onResponseFailure(Object myRes, boolean isLoadMore, String responseType) {
        ProgressDlg.dismissProgressDialog();
        favRecycler.setVisibility(View.GONE);
        refreshFav.setVisibility(View.GONE);
        tvNoData.setVisibility(View.VISIBLE);
        refreshFav.setRefreshing(false);
    }



    @Override
    public void onRequestFailure(Object myRes, boolean isLoadMore, String responseType) {
        ProgressDlg.dismissProgressDialog();
        favRecycler.setVisibility(View.GONE);
        refreshFav.setVisibility(View.GONE);
        tvNoData.setVisibility(View.VISIBLE);
        refreshFav.setRefreshing(false);
    }


    public void callFav(String serviceId, String type) {
        if (AppUtils.isNetworkAvailable(FavoriteListActivity.this)) {
            ProgressDlg.showProgressDialog(FavoriteListActivity.this, null, null);
            ApiInterface apiService =
                    ApiClient.getClientNoHeader().create(ApiInterface.class);
            try {
                String token = AppConstants.DEFAULTTOKEN;
                if (PreferenceStorage.getKey(AppConstants.USER_TOKEN) != null) {
                    token = PreferenceStorage.getKey(AppConstants.USER_TOKEN);
                }
                Call<EmptyData> classificationCall = apiService.callFavorite(token, serviceId, type);
                RetrofitHandler.executeRetrofit(FavoriteListActivity.this, classificationCall, AppConstants.FAVORITE,
                        this, false);
            } catch (Exception e) {
                ProgressDlg.dismissProgressDialog();
                e.printStackTrace();
            }

        } else {
            AppUtils.showToast(FavoriteListActivity.this, getString(R.string.txt_enable_internet));
        }
    }
}
