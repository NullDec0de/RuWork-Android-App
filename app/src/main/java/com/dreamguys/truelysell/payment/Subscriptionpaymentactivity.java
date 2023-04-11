package com.dreamguys.truelysell.payment;

import static com.dreamguys.truelysell.utils.AppConstants.isFromWhichCard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.braintreepayments.api.BraintreeFragment;
import com.braintreepayments.api.PayPal;
import com.braintreepayments.api.interfaces.PaymentMethodNonceCreatedListener;
import com.braintreepayments.api.models.PayPalAccountNonce;
import com.braintreepayments.api.models.PayPalRequest;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.braintreepayments.cardform.view.CardForm;
import com.dreamguys.truelysell.R;
import com.dreamguys.truelysell.SubscriptionThankYouActivity;
import com.dreamguys.truelysell.WebViewActivity;
import com.dreamguys.truelysell.datamodel.BaseResponse;
import com.dreamguys.truelysell.datamodel.CommonLangModel;
import com.dreamguys.truelysell.datamodel.LanguageResponse;
import com.dreamguys.truelysell.datamodel.POSTCurrencyConversion;
import com.dreamguys.truelysell.datamodel.Phase3.DAOUserProfile;
import com.dreamguys.truelysell.datamodel.StripeDetailsModel;
import com.dreamguys.truelysell.datamodel.SubscriptionPaymentResponse;
import com.dreamguys.truelysell.datamodel.SubscriptionSuccessModel;
import com.dreamguys.truelysell.network.ApiClient;
import com.dreamguys.truelysell.network.ApiInterface;
import com.dreamguys.truelysell.utils.AppConstants;
import com.dreamguys.truelysell.utils.AppUtils;
import com.dreamguys.truelysell.utils.PreferenceStorage;
import com.dreamguys.truelysell.utils.ProgressDlg;
import com.dreamguys.truelysell.utils.RetrofitHandler;
import com.dreamguys.truelysell.utils.Utils;
import com.dreamguys.truelysell.wallet.CardListActivity;
import com.google.gson.Gson;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import com.stripe.android.BuildConfig;
import com.stripe.android.Stripe;
import com.stripe.android.TokenCallback;
import com.stripe.android.model.Card;
import com.stripe.android.model.Token;

import org.json.JSONObject;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Subscriptionpaymentactivity extends AppCompatActivity implements RetrofitHandler.RetrofitResHandler, PaymentMethodNonceCreatedListener, PaymentResultListener  {

    CardForm cardForm;
    RadioButton radioButtonDebitCreditCard;
    RadioButton paypal, paystack, paySolutions, moyassar;
    RadioButton razorPay;
    RadioGroup radioGroupAddNewCards;
    Button buy;
    String paymentType ="";
    String price, subsId, subsName, fromPage, public_key = "", secret_key = "", transaction_id= "";
    public LanguageResponse.Data.Language.WalletScreen walletScreenList;
    BraintreeFragment mBraintreeFragment = null;
    String publicKey = "", secretKey = "", str_expiry_date = "", braintreeKey = "", razorPayAPIKey = "", Currencycodee ="", paystackrefkey="", customeremail="", merchantid = "";
    ProgressDlg progressDlg;
    Double newcurrency = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_sub_new);
        String walletStr = PreferenceStorage.getKey(CommonLangModel.WalletScreen);
        walletScreenList = new Gson().fromJson(walletStr, LanguageResponse.Data.Language.WalletScreen.class);

        buy = findViewById(R.id.btnBuy);


        cardForm = findViewById(R.id.card_form);
        radioButtonDebitCreditCard = findViewById(R.id.rb_debit_credit_cards);
        radioGroupAddNewCards = findViewById(R.id.rg_card_details);
        progressDlg.showProgressDialog(this, null, null);
        paypal = findViewById(R.id.paypal);
        paystack = findViewById(R.id.paystack);
        moyassar = findViewById(R.id.moyassar);
        paySolutions = findViewById(R.id.paysolutions);


        price = getIntent().getStringExtra(AppConstants.StripePrice);
        subsId = getIntent().getStringExtra(AppConstants.StripeSubId);
        subsName = getIntent().getStringExtra(AppConstants.StripeSubName);
        Currencycodee = getIntent().getStringExtra(AppConstants.CURRENCYCODE);

        fromPage = getIntent().getStringExtra("FromPage");


        cardForm.cardRequired(true)
                .expirationRequired(true)
                .cvvRequired(true)
                .setup(this);

        getBraintreedetails();

        cardForm.setVisibility(View.GONE);

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectpay();
            }
        });

        radioGroupAddNewCards.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                /*int checkId = radioGroupAddNewCards.getCheckedRadioButtonId();
                if (checkId == radioButtonDebitCreditCard.getId()) {
                    isFromWhichCard = 0;
                    linearLayoutAddNewCardPanel.setVisibility(View.VISIBLE);
                }*/

                if (checkedId == radioButtonDebitCreditCard.getId()) {
                    isFromWhichCard = 0;
                    paymentType = "1";
                    cardForm.setVisibility(View.VISIBLE);
                } else if (checkedId == paypal.getId()) {
                    paymentType = "2";
                    cardForm.setVisibility(View.GONE);
                } else if (checkedId == razorPay.getId()) {
                    paymentType = "3";
                    cardForm.setVisibility(View.GONE);
                }
            }
        });

    }





    public void selectpay(){
        if (paymentType.equals("1")){
            submitCard();
        } else if(paymentType.equals("2")){
            paypalpayment();
        }else if(paymentType.equals("3")) {
            startPayment();

        }else if(paymentType.equals("4")){
            StartPaystack();
        }else if(paymentType.equals("5")){
            startPaysolutions();
        }


    }


    public void startPayment() {
        final Activity activity = this;
        final Checkout co = new Checkout();
        co.setKeyID(razorPayAPIKey.trim());
        try {
            JSONObject options = new JSONObject();
            options.put("image", "https://s3.amazonaws.com/rzp-mobile/images/rzp.png");
            options.put("currency", PreferenceStorage.getKey(AppConstants.CURRENCYCODE));
            options.put("amount", String.valueOf(Double.parseDouble(price) * 100));
            co.open(activity, options);
        } catch (Exception e) {
            Toast.makeText(activity, "Error in payment: " + e.getMessage(), Toast.LENGTH_SHORT)
                    .show();
            e.printStackTrace();
        }
    }

    public void startPaysolutions() {
        if (price.isEmpty()) {
            Toast.makeText(this, AppUtils.cleanLangStr(this,
                    walletScreenList.getLblEnterAmtToProceed().getName(), R.string.txt_enter_amount), Toast.LENGTH_SHORT).show();
            return;
        }

        if (Double.parseDouble(price) < 1) {
            Toast.makeText(this, AppUtils.cleanLangStr(this,
                    walletScreenList.getLblEnterLessThanOne().getName(), R.string.txt_amount_greater), Toast.LENGTH_SHORT).show();
            return;
        }

        Intent i = new Intent(Subscriptionpaymentactivity.this, WebViewActivity.class);
        i.putExtra(AppConstants.TbTitle, AppUtils.cleanLangStr(Subscriptionpaymentactivity.this,
                "Paysolutions", R.string.txt_make_a_suggestion));
        String urrrl = "https://truelysell.dreamguystech.com/home/paysolutionapi?" + "refno="+  PreferenceStorage.getKey(AppConstants.PAYSTACKREF) + "&" + "merchantid="  + merchantid + "&" + "customeremail=" + customeremail +"&" +"productdetail=subscription_" + subsId + "&" +"total=" + price.toString();
        i.putExtra(AppConstants.URL, urrrl);
        startActivity(i);
    }




    private void currencyconversion() {

        if (AppUtils.isNetworkAvailable(this)) {
            progressDlg.showProgressDialog(this, null, null);
            HashMap<String, String> data = new HashMap<>();
            data.put("amount", price);
            data.put("conversion_currency", "NGN");
            data.put("user_currency_code", Currencycodee);
            data.put("paytype", "paystack");

            ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
            apiInterface.postCurrencyconversion(data, PreferenceStorage.getKey(AppConstants.USER_TOKEN)).enqueue(new Callback<POSTCurrencyConversion>() {
                @Override
                public void onResponse(Call<POSTCurrencyConversion> call, Response<POSTCurrencyConversion> response) {
                    ProgressDlg.dismissProgressDialog();
                    if (response.body().getResponse().getResponseCode().equals("200")) {

                        ProgressDlg.dismissProgressDialog();

                        Utils.toastMessage(Subscriptionpaymentactivity.this, response.body().getResponse().getResponseMessage());

                        newcurrency = response.body().getData().getCurrencyAmount();

                        Intent intent = new Intent(Subscriptionpaymentactivity.this, PayStackActivity.class);
                        intent.putExtra(AppConstants.CASH_AMOUNT, newcurrency.toString());
                        intent.putExtra(AppConstants.ORIGINAL_AMOUNT, price);
                        intent.putExtra(AppConstants.ORDERID, paystackrefkey);
                        intent.putExtra(AppConstants.USER_EMAIL, customeremail);
                        intent.putExtra(AppConstants.SUBSID, subsId);
                        intent.putExtra(AppConstants.FROM, "SUBS");
                        startActivity(intent);

//                        updateUI();


                    } else {
                        Toast.makeText(Subscriptionpaymentactivity.this, response.body().getResponse().getResponseMessage(), Toast.LENGTH_LONG).show();
//                        Utils.toastMessage(PayStackActivity.this, response.body().getMessage());
                    }
                }

                @Override
                public void onFailure(Call<POSTCurrencyConversion> call, Throwable t) {
                    Log.i("TAG", t.getMessage());
                    ProgressDlg.dismissProgressDialog();
                    finish();
                    Toast.makeText(Subscriptionpaymentactivity.this, "Paystack not working}", Toast.LENGTH_LONG).show();
                }
            });
        } else {
            ProgressDlg.dismissProgressDialog();
            Toast.makeText(Subscriptionpaymentactivity.this, "Enable Internet", Toast.LENGTH_LONG).show();
        }

    }


    public void submitCard() {
        // TODO: replace with your own test key
        /*final String publishableApiKey = BuildConfig.DEBUG ?
                "pk_test_6pRNASCoBOKtIshFeQd4XMUh" :
                getString(R.string.com_stripe_publishable_key);*/


        if (!cardForm.getCardNumber().isEmpty() && !cardForm.getExpirationMonth().isEmpty() && !cardForm.getExpirationYear().isEmpty()
                && !cardForm.getCvv().isEmpty()) {
            ProgressDlg.showProgressDialog(Subscriptionpaymentactivity.this, null, null);
            getStripeDetails();





        } else {
            AppUtils.showToast(Subscriptionpaymentactivity.this, getString(R.string.err_payment));
        }
    }


    private void generateCardPayment() {
        final String publishableApiKey = BuildConfig.DEBUG ?
                "" :
                public_key;

        Card card = new Card(cardForm.getCardNumber(),
                Integer.parseInt(cardForm.getExpirationMonth()),
                Integer.parseInt(cardForm.getExpirationYear()),
                cardForm.getCvv());
        card.setCurrency(AppConstants.DefaultCurrency);

        Stripe stripe = new Stripe();
        stripe.createToken(card, publishableApiKey, new TokenCallback() {
            public void onSuccess(Token token) {
                // TODO: Send Token information to your backend to initiate a charge
                com.stripe.Stripe.apiKey = secret_key;
                /*Toast.makeText(
                        getApplicationContext(),
                        "Token created: " + token.getId(),
                        Toast.LENGTH_LONG).show();*/
                //    new SubscriptionTask().execute(token.getId());
                getTransactionId(token.getId());
            }

            public void onError(Exception error) {
                ProgressDlg.dismissProgressDialog();
                Log.d("Stripe", error.getLocalizedMessage());
            }
        });
    }


   public void paypalpayment(){

        if (price.isEmpty()) {
            Toast.makeText(this, AppUtils.cleanLangStr(this,
                    walletScreenList.getLblEnterAmtToProceed().getName(), R.string.txt_enter_amount), Toast.LENGTH_SHORT).show();
            return;
        }

        if (Double.parseDouble(price) < 1) {
            Toast.makeText(this, AppUtils.cleanLangStr(this,
                    walletScreenList.getLblEnterLessThanOne().getName(), R.string.txt_amount_greater), Toast.LENGTH_SHORT).show();
            return;
        }
        // onBraintreeSubmit(getString(R.string.test_client_token));
//                        onBrainTreeSubmit();
        try {
            mBraintreeFragment = BraintreeFragment.newInstance(this, braintreeKey);
            PayPalRequest request = new PayPalRequest(price)
                    .currencyCode(PreferenceStorage.getKey(AppConstants.CURRENCYCODE))
                    .intent(PayPalRequest.INTENT_AUTHORIZE);
            PayPal.requestOneTimePayment(mBraintreeFragment, request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private void getTransactionId(String id) {
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<SubscriptionPaymentResponse> subscriptionSuccessModelCall = apiInterface.
                subscriptionPayment(PreferenceStorage.getKey(AppConstants.USER_TOKEN), id, price,
                        subsId, "Purchased from Truely Sell");
        RetrofitHandler.executeRetrofit(Subscriptionpaymentactivity.this, subscriptionSuccessModelCall,
                AppConstants.SUBSCRIPTIONPAYMENT, Subscriptionpaymentactivity.this, false);

    }


    public void getStripeDetails() {

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<StripeDetailsModel> subscriptionSuccessModelCall = apiInterface.getStripeDetails(PreferenceStorage.getKey(AppConstants.USER_TOKEN));
        RetrofitHandler.executeRetrofit(Subscriptionpaymentactivity.this, subscriptionSuccessModelCall, AppConstants.STRIPEDETAILS, Subscriptionpaymentactivity.this, false);

    }


    public void getBraintreedetails() {


        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);

        Call<StripeDetailsModel> subscriptionSuccessModelCall = apiInterface.getStripeDetails(PreferenceStorage.getKey(AppConstants.USER_TOKEN));
        RetrofitHandler.executeRetrofit(Subscriptionpaymentactivity.this, subscriptionSuccessModelCall, AppConstants.BRAINTREEDETAILS, Subscriptionpaymentactivity.this, false);

    }

    public void Postsubsuccess(String trnsid, String paymenttType) {

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<SubscriptionSuccessModel> subscriptionSuccessModelCall = apiInterface.postSuccessSubscription(subsId, trnsid, "", paymenttType, PreferenceStorage.getKey(AppConstants.USER_TOKEN), PreferenceStorage.getKey(AppConstants.MY_LANGUAGE));
        RetrofitHandler.executeRetrofit(Subscriptionpaymentactivity.this, subscriptionSuccessModelCall, AppConstants.SUBSCRIPTIONSUCCESS, Subscriptionpaymentactivity.this, false);


    }


    @Override
    public void onSuccess(Object myRes, boolean isLoadMore, String responseType) {
        if (myRes instanceof SubscriptionSuccessModel) {
            ProgressDlg.dismissProgressDialog();
            SubscriptionSuccessModel subscriptionSuccessModel = (SubscriptionSuccessModel) myRes;
            Intent callStipeSuccessAct = new Intent(Subscriptionpaymentactivity.this, SubscriptionThankYouActivity.class);
            callStipeSuccessAct.putExtra("FromPage", fromPage);
            AppUtils.appStartIntent(Subscriptionpaymentactivity.this, callStipeSuccessAct);
            PreferenceStorage.setKey(AppConstants.USER_SUBS_TYPE, Integer.parseInt(subscriptionSuccessModel.getData().getSubscriberId()));
            PreferenceStorage.setKey(AppConstants.ISSUBSCRIBED, subscriptionSuccessModel.getData().getIs_subscribed());
            finish();
        } else if (myRes instanceof StripeDetailsModel) {
            StripeDetailsModel stripeDetailsModel = (StripeDetailsModel) myRes;
            secret_key = stripeDetailsModel.getData().getSecretKey();
            public_key = stripeDetailsModel.getData().getPublishableKey();
            braintreeKey = stripeDetailsModel.getData().getBraintreeKey();
            razorPayAPIKey = stripeDetailsModel.getData().getRazorpayApikey();
            customeremail = stripeDetailsModel.getData().getEmail();
            paystackrefkey = String.valueOf(stripeDetailsModel.getData().getPaystackRefKey());
            merchantid = stripeDetailsModel.getData().getMerchant_Id();
            if(!paymentType.equals("")){
                if(paymentType.equals("1")){
                    generateCardPayment();
                }
            }
        } else if (responseType.equalsIgnoreCase(AppConstants.SUBSCRIPTIONPAYMENT)) {
            SubscriptionPaymentResponse response = (SubscriptionPaymentResponse) myRes;
            transaction_id = response.getData().getTransactionId();
            ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
            Call<SubscriptionSuccessModel> subscriptionSuccessModelCall = apiInterface.postSuccessSubscription(subsId, transaction_id, "", "", PreferenceStorage.getKey(AppConstants.USER_TOKEN), PreferenceStorage.getKey(AppConstants.MY_LANGUAGE));
            RetrofitHandler.executeRetrofit(Subscriptionpaymentactivity.this, subscriptionSuccessModelCall, AppConstants.SUBSCRIPTIONSUCCESS, Subscriptionpaymentactivity.this, false);
        }else if (responseType.equalsIgnoreCase(AppConstants.BRAINTREEDETAILS)) {
            StripeDetailsModel stripeDetailsModel = (StripeDetailsModel) myRes;
            braintreeKey = stripeDetailsModel.getData().getBraintreeKey();
            paystackrefkey = String.valueOf(stripeDetailsModel.getData().getPaystackRefKey());
            customeremail = stripeDetailsModel.getData().getEmail();
        }
    }





    public void StartPaystack(){
        if (price.isEmpty()) {
            Toast.makeText(this, AppUtils.cleanLangStr(this,
                    walletScreenList.getLblEnterAmtToProceed().getName(), R.string.txt_enter_amount), Toast.LENGTH_SHORT).show();
            return;
        }

        if (Double.parseDouble(price) < 1) {
            Toast.makeText(this, AppUtils.cleanLangStr(this,
                    walletScreenList.getLblEnterLessThanOne().getName(), R.string.txt_amount_greater), Toast.LENGTH_SHORT).show();
            return;
        }



        currencyconversion();
    }

    @Override
    public void onResponseFailure(Object myRes, boolean isLoadMore, String responseType) {

    }

    @Override
    public void onRequestFailure(Object myRes, boolean isLoadMore, String responseType) {

    }


    @Override
    public void onPaymentMethodNonceCreated(PaymentMethodNonce paymentMethodNonce) {
        Log.d("paymentMethodNonce :", paymentMethodNonce.toString());
        String nonce = paymentMethodNonce.getNonce();
        Postsubsuccess(nonce, "paypal");
//        callBrainTreeAddWallet(price, nonce,
//                ((PayPalAccountNonce) paymentMethodNonce).getClientMetadataId());
    }

    private void callBrainTreeAddWallet(String amount, String nonce, String orderId) {
        if (AppUtils.isNetworkAvailable(this)) {
            ProgressDlg.showProgressDialog(this, null, null);
            ApiInterface apiService =
                    ApiClient.getClientNoHeader().create(ApiInterface.class);
            Call<BaseResponse> classificationCall = apiService.callBrainTreeAddWallet
                    (PreferenceStorage.getKey(AppConstants.USER_TOKEN),
                            amount, orderId, nonce);
            RetrofitHandler.executeRetrofit(this, classificationCall, AppConstants.BRAINTREEADDWALLET,
                    this, false);
        } else {
            AppUtils.showToast(getApplicationContext(), getString(R.string.txt_enable_internet));
        }
    }

    @SuppressWarnings("unused")
    @Override
    public void onPaymentSuccess(String razorpayPaymentID) {
        try {
            Log.e("Razorpayid", razorpayPaymentID);
//            postTopupWallet(razorpayPaymentID, "razorpay");
            Postsubsuccess(razorpayPaymentID, "razorpay");
//            Toast.makeText(this, "Payment Successful: " + razorpayPaymentID, Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Log.e("TAG", "Exception in onPaymentSuccess", e);
        }
    }

    @SuppressWarnings("unused")
    @Override
    public void onPaymentError(int code, String response) {
        try {
            Toast.makeText(this, "Payment failed: " + response + " " + response, Toast.LENGTH_SHORT).show();
            Log.i("messaged", "Payment failed: " + code + " " + response);
        } catch (Exception e) {
            Log.e("TAG", "Exception in onPaymentError", e);
        }
    }
}
