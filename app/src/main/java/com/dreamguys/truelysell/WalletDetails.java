package com.dreamguys.truelysell;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.dreamguys.truelysell.datamodel.WalletDetailResponse;
import com.dreamguys.truelysell.network.ApiClient;
import com.dreamguys.truelysell.network.ApiInterface;
import com.dreamguys.truelysell.utils.AppConstants;
import com.dreamguys.truelysell.utils.AppUtils;
import com.dreamguys.truelysell.utils.PreferenceStorage;
import com.dreamguys.truelysell.utils.ProgressDlg;
import com.dreamguys.truelysell.utils.RetrofitHandler;
import com.google.android.material.textfield.TextInputEditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;

public class WalletDetails extends AppCompatActivity implements RetrofitHandler.RetrofitResHandler {
    ApiInterface apiInterface;

    String ID;

    @BindView(R.id.tiet_creditWallet)
    TextInputEditText tiet_creditWallet;
    @BindView(R.id.tiet_debit_wallet)
    TextInputEditText tiet_debit_wallet;
    @BindView(R.id.tiet_location)
    TextInputEditText tiet_location;
    @BindView(R.id.tiet_date)
    TextInputEditText tiet_date;
    @BindView(R.id.tiet_reason)
    TextView tv_txt_reason;
    @BindView(R.id.tiet_service)
    TextInputEditText tiet_service;
    @BindView(R.id.tiet_Amount)
    TextInputEditText tiet_Amount;
    @BindView(R.id.tiet_paid)
    TextInputEditText tiet_paid;
    @BindView(R.id.tiet_tot_amt)
    TextInputEditText tiet_tot_amt;
    @BindView(R.id.tiet_feeamt)
    TextInputEditText tiet_feeamt;
    @BindView(R.id.tiet_netamt)
    TextInputEditText tiet_netamt;
    @BindView(R.id.tiet_amt_refund)
    TextInputEditText tiet_amt_refund;
    @BindView(R.id.llLocation)
    LinearLayout llLocation;
    @BindView(R.id.llDate)
    LinearLayout llDate;
    @BindView(R.id.llService)
    LinearLayout llService;
    @BindView(R.id.vLoc)
    View vLoc;
    @BindView(R.id.vDate)
    View vDate;
    @BindView(R.id.view_subscription)
    View viewSubscription;
    String currency;
    @BindView(R.id.tietProvider)
    TextInputEditText tietProvider;
    @BindView(R.id.llProvider)
    LinearLayout llProvider;
    @BindView(R.id.viewProvider)
    View viewProvider;
    @BindView(R.id.tietUserName)
    TextInputEditText tietUserName;
    @BindView(R.id.llUser)
    LinearLayout llUser;
    @BindView(R.id.viewUsername)
    View viewUsername;

    String timeuniversal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet_details);
        ButterKnife.bind(this);
        ID = getIntent().getStringExtra("ID");
        currency = getIntent().getStringExtra("currency");

        findViewById(R.id.tb_walletDetails).setOnClickListener(view -> finish());
        getwalletDetails();


    }

    private void getwalletDetails() {

        if (AppUtils.isNetworkAvailable(this)) {
            ProgressDlg.showProgressDialog(this, null, null);
            apiInterface = ApiClient.getClient().create(ApiInterface.class);
            Call<WalletDetailResponse> walletResp = apiInterface.getViewWalletHistory(PreferenceStorage.getKey(AppConstants.USER_TOKEN), ID);
            RetrofitHandler.executeRetrofit(this, walletResp, AppConstants.WALLETDETAILSS,
                    this, false);
        }

    }

    @Override
    public void onSuccess(Object myRes, boolean isLoadMore, String responseType) {

        switch (responseType) {
            case AppConstants.WALLETDETAILSS:
                WalletDetailResponse walletDetailResponse = (WalletDetailResponse) myRes;

                if (TextUtils.isEmpty(walletDetailResponse.getData().getCredit_wallet()) || walletDetailResponse.getData().getCredit_wallet() == null) {
                    tiet_creditWallet.setText("");
                } else {
                    tiet_creditWallet.setText(currency + " " + walletDetailResponse.getData().getCredit_wallet());

                }
                tiet_debit_wallet.setText(currency + " " + walletDetailResponse.getData().getDebit_wallet());
                tv_txt_reason.setText(walletDetailResponse.getData().getReason());
                tiet_Amount.setText(currency + " " + walletDetailResponse.getData().getAmount());
                tiet_paid.setText(walletDetailResponse.getData().getPaid_status());
                tiet_tot_amt.setText(currency + " " + walletDetailResponse.getData().getTotal_amt());
                tiet_feeamt.setText(currency + " " + walletDetailResponse.getData().getFee_amt());
                tiet_netamt.setText(currency + " " + walletDetailResponse.getData().getNet_amt());
                tiet_amt_refund.setText(currency + " " + walletDetailResponse.getData().getAmount_refund());


                if (walletDetailResponse.getData().getLocation() != null &&
                        !walletDetailResponse.getData().getLocation().isEmpty())
                    tiet_location.setText(walletDetailResponse.getData().getLocation());
                else {
                    llLocation.setVisibility(View.GONE);
                    vLoc.setVisibility(View.GONE);
                }

                String str = walletDetailResponse.getData().getCreated_at();
                String[] splited = str.split("\\s+");

                if(PreferenceStorage.getKey(AppConstants.TIMEFORMAT).equals("12hrs")){
                    String chngtime1 = parseDateToddMMyyyy(splited[1]);
                    timeuniversal = chngtime1;
                } else {
                    timeuniversal = splited[1];
                }


                Toast.makeText(this, splited[1], Toast.LENGTH_SHORT).show();

                if (walletDetailResponse.getData().getCreated_at() != null &&
                        !walletDetailResponse.getData().getCreated_at().isEmpty()) {
//                    tiet_date.setText(splited[0]);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    Date date = null;
                    try {
                        date = simpleDateFormat.parse(walletDetailResponse.getData().getCreated_at());
                        tiet_date.setText(new SimpleDateFormat(PreferenceStorage.getKey(AppConstants.DATEFORMAT)).format(date) + " " + timeuniversal);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    llDate.setVisibility(View.GONE);
                    vDate.setVisibility(View.GONE);
                }

                if (walletDetailResponse.getData().getService_title() != null &&
                        !walletDetailResponse.getData().getService_title().isEmpty())
                    tiet_service.setText(walletDetailResponse.getData().getService_title());
                else {
                    llService.setVisibility(View.GONE);
                    viewSubscription.setVisibility(View.GONE);
                }

                if (walletDetailResponse.getData().getProvidername() != null &&
                        !walletDetailResponse.getData().getProvidername().isEmpty())
                    tietProvider.setText(walletDetailResponse.getData().getProvidername());
                else {
                    llProvider.setVisibility(View.GONE);
                    viewProvider.setVisibility(View.GONE);
                }

                if (walletDetailResponse.getData().getUsername() != null &&
                        !walletDetailResponse.getData().getUsername().isEmpty())
                    tietUserName.setText(walletDetailResponse.getData().getUsername());
                else {
                    llUser.setVisibility(View.GONE);
                    viewUsername.setVisibility(View.GONE);
                }

                break;
        }
    }

    @Override
    public void onResponseFailure(Object myRes, boolean isLoadMore, String responseType) {

    }

    @Override
    public void onRequestFailure(Object myRes, boolean isLoadMore, String responseType) {

    }

    public String parseDateToddMMyyyy(String time) {
        String inputPattern = "HH:mm:ss";
        String outputPattern = "h:mm a";
        SimpleDateFormat inputFormat = new SimpleDateFormat(inputPattern);
        SimpleDateFormat outputFormat = new SimpleDateFormat(outputPattern);

        Date date = null;
        String str = null;

        try {
            date = inputFormat.parse(time);
            str = outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return str;
    }
}