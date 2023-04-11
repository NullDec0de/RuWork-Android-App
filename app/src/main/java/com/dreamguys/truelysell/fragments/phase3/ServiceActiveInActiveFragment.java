package com.dreamguys.truelysell.fragments.phase3;

import android.app.AlertDialog;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.dreamguys.truelysell.MyProviderServicesActivitynew;
import com.dreamguys.truelysell.R;
import com.dreamguys.truelysell.adapters.MyServicesAdapter;
import com.dreamguys.truelysell.datamodel.CommonLangModel;
import com.dreamguys.truelysell.datamodel.DAOUpdateMyServiceStatus;
import com.dreamguys.truelysell.datamodel.EmptyData;
import com.dreamguys.truelysell.datamodel.LanguageResponse;
import com.dreamguys.truelysell.datamodel.Phase3.DAOMyServices;
import com.dreamguys.truelysell.network.ApiClient;
import com.dreamguys.truelysell.network.ApiInterface;
import com.dreamguys.truelysell.utils.AppConstants;
import com.dreamguys.truelysell.utils.AppUtils;
import com.dreamguys.truelysell.utils.PreferenceStorage;
import com.dreamguys.truelysell.utils.ProgressDlg;
import com.dreamguys.truelysell.utils.RetrofitHandler;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;

public class ServiceActiveInActiveFragment extends Fragment implements
        RetrofitHandler.RetrofitResHandler {

    Unbinder unbinder;
    LinearLayoutManager linearLayoutManager;
    @BindView(R.id.rv_myservices)
    RecyclerView rvMyServices;
    @BindView(R.id.tv_no_records_found)
    TextView tvNoRecordsFound;
    @BindView(R.id.iv_filter)
    ImageView ivFilter;
    String type;
    @BindView(R.id.iv_popular_services)
    ImageView ivPopularServices;
    @BindView(R.id.txt_my_providers)
    TextView txtMyProviders;
    LanguageResponse.Data.Language.HomeScreen homeStringsList;
    public LanguageResponse.Data.Language.BookingService bookingServiceScreenList;
    public LanguageResponse.Data.Language.CommonStrings commonStringList;
    MyProviderServicesActivitynew mActivity;


    public ServiceActiveInActiveFragment(MyProviderServicesActivitynew mActivity, String type) {
        this.mActivity = mActivity;
        this.type = type;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View mVIew = inflater.inflate(R.layout.fragment_my_services, container, false);
        unbinder = ButterKnife.bind(this, mVIew);
        return mVIew;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        uiInit();
    }

    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            getMyServicesList(type);
        }
    }

    private void uiInit() {
        try {
            String homeDataStr = PreferenceStorage.getKey(CommonLangModel.HomeString);
            homeStringsList = new Gson().fromJson(homeDataStr, LanguageResponse.Data.
                    Language.HomeScreen.class);

            String bookingStr = PreferenceStorage.getKey(CommonLangModel.BookingService);
            bookingServiceScreenList = new Gson().fromJson(bookingStr, LanguageResponse.Data.
                    Language.BookingService.class);

            String commonStr = PreferenceStorage.getKey(CommonLangModel.CommonString);
            commonStringList = new Gson().fromJson(commonStr, LanguageResponse.Data.Language.
                    CommonStrings.class);
        } catch (Exception e) {
            homeStringsList = new LanguageResponse().new Data().new Language().new HomeScreen();
            bookingServiceScreenList = new LanguageResponse().new Data().new Language().new
                    BookingService();
            commonStringList = new LanguageResponse().new Data().new Language().new CommonStrings();
        }

        ivFilter.setVisibility(View.GONE);

        if (AppUtils.isThemeChanged(mActivity)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                // secondary theme color hide
                ivPopularServices.setBackgroundTintList(ColorStateList.valueOf(AppUtils.getPrimaryAppTheme(mActivity)));
            }
        }
        txtMyProviders.setText(AppUtils.cleanLangStr(mActivity,
                homeStringsList.getLblMyServices().getName(), R.string.txt_my_providers));
        tvNoRecordsFound.setText(AppUtils.cleanLangStr(mActivity,
                homeStringsList.getLblNoService().getName(), R.string.no_services_available));

    }

    public void getMyServicesList(String type) {
        if (AppUtils.isNetworkAvailable(mActivity)) {
            ProgressDlg.showProgressDialog(mActivity, null, null);
            ApiInterface apiService =
                    ApiClient.getClientNoHeader().create(ApiInterface.class);
            try {
                Call<DAOMyServices> classificationCall = apiService.getMyServices(PreferenceStorage.
                        getKey(AppConstants.USER_TOKEN), type, "1000000000" , "1");
                RetrofitHandler.executeRetrofit(mActivity, classificationCall,
                        AppConstants.MYSERVICES,
                        this, false);
            } catch (Exception e) {
                ProgressDlg.dismissProgressDialog();
                e.printStackTrace();
            }

        } else {
            AppUtils.showToast(mActivity, getString(R.string.txt_enable_internet));
        }
    }

    public void updateMyServiceStatus(String status, String serviceID) {
        if (AppUtils.isNetworkAvailable(mActivity)) {
            ProgressDlg.showProgressDialog(mActivity, null, null);
            ApiInterface apiService =
                    ApiClient.getClientNoHeader().create(ApiInterface.class);
            try {
                Call<DAOUpdateMyServiceStatus> classificationCall = apiService.
                        postUpdateMyserviceStatus(PreferenceStorage.getKey(AppConstants.USER_TOKEN),
                                status, serviceID);
                RetrofitHandler.executeRetrofit(mActivity, classificationCall,
                        AppConstants.UPDATEMYSERVICESTATUS, this, false);
            } catch (Exception e) {
                ProgressDlg.dismissProgressDialog();
                e.printStackTrace();
            }

        } else {
            AppUtils.showToast(mActivity, getString(R.string.txt_enable_internet));
        }
    }

    public void postDeleteService(String serviceID) {
        if (AppUtils.isNetworkAvailable(mActivity)) {
            ProgressDlg.showProgressDialog(mActivity, null, null);
            ApiInterface apiService =
                    ApiClient.getClientNoHeader().create(ApiInterface.class);
            try {
                Call<EmptyData> classificationCall = apiService.postDeleteService(PreferenceStorage.
                        getKey(AppConstants.USER_TOKEN), serviceID);
                RetrofitHandler.executeRetrofit(mActivity, classificationCall,
                        AppConstants.DELETESERVICE, this, false);
            } catch (Exception e) {
                ProgressDlg.dismissProgressDialog();
                e.printStackTrace();
            }
        } else {
            AppUtils.showToast(mActivity, getString(R.string.txt_enable_internet));
        }
    }

    public void showAlertDialog(String status, String serviceID, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);
        builder.setMessage(msg)
                .setCancelable(false)
                .setPositiveButton(AppUtils.cleanLangStr(mActivity, commonStringList.getBtnYes().
                        getName(), R.string.txt_yes), (dialog, id) -> {
                    updateMyServiceStatus(status, serviceID);
                    dialog.dismiss();
                })
                .setNegativeButton(AppUtils.cleanLangStr(mActivity, commonStringList.getBtnNo().
                        getName(), R.string.txt_no), (dialog, id) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    public void onSuccess(Object myRes, boolean isLoadMore, String responseType) {

        switch (responseType) {
            case AppConstants.MYSERVICES:
                DAOMyServices daoMyServices = (DAOMyServices) myRes;
                if (daoMyServices.getData() != null && daoMyServices.getData().getServices().size() > 0) {
                    rvMyServices.setVisibility(View.VISIBLE);
                    tvNoRecordsFound.setVisibility(View.GONE);
                    linearLayoutManager = new LinearLayoutManager(mActivity, LinearLayoutManager.
                            VERTICAL, false);
                    rvMyServices.setLayoutManager(linearLayoutManager);
                    rvMyServices.setAdapter(new MyServicesAdapter(mActivity, daoMyServices.getData().getServices(),
                            ServiceActiveInActiveFragment.this,
                            bookingServiceScreenList));
                } else {
                    rvMyServices.setVisibility(View.GONE);
                    tvNoRecordsFound.setVisibility(View.VISIBLE);
                }
                break;
            case AppConstants.DELETESERVICE:
                EmptyData emptyData = (EmptyData) myRes;
                Toast.makeText(mActivity, emptyData.getResponseHeader().getResponseMessage(),
                        Toast.LENGTH_SHORT).show();
                getMyServicesList(type);
                break;
            case AppConstants.UPDATEMYSERVICESTATUS:
                DAOUpdateMyServiceStatus emptyData1 = (DAOUpdateMyServiceStatus) myRes;
                Toast.makeText(mActivity, emptyData1.getResponseHeader().getResponseMessage(),
                        Toast.LENGTH_SHORT).show();
                getMyServicesList(type);
                break;
        }
    }

    @Override
    public void onResponseFailure(Object myRes, boolean isLoadMore, String responseType) {
        if (AppConstants.UPDATEMYSERVICESTATUS.equals(responseType)) {
            DAOUpdateMyServiceStatus emptyData1 = (DAOUpdateMyServiceStatus) myRes;
            Toast.makeText(mActivity, emptyData1.getResponseHeader().getResponseMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onRequestFailure(Object myRes, boolean isLoadMore, String responseType) {

    }
}
