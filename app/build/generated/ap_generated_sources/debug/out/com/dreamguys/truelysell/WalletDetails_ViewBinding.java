// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletDetails_ViewBinding implements Unbinder {
  private WalletDetails target;

  @UiThread
  public WalletDetails_ViewBinding(WalletDetails target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletDetails_ViewBinding(WalletDetails target, View source) {
    this.target = target;

    target.tiet_creditWallet = Utils.findRequiredViewAsType(source, R.id.tiet_creditWallet, "field 'tiet_creditWallet'", TextInputEditText.class);
    target.tiet_debit_wallet = Utils.findRequiredViewAsType(source, R.id.tiet_debit_wallet, "field 'tiet_debit_wallet'", TextInputEditText.class);
    target.tiet_location = Utils.findRequiredViewAsType(source, R.id.tiet_location, "field 'tiet_location'", TextInputEditText.class);
    target.tiet_date = Utils.findRequiredViewAsType(source, R.id.tiet_date, "field 'tiet_date'", TextInputEditText.class);
    target.tv_txt_reason = Utils.findRequiredViewAsType(source, R.id.tiet_reason, "field 'tv_txt_reason'", TextView.class);
    target.tiet_service = Utils.findRequiredViewAsType(source, R.id.tiet_service, "field 'tiet_service'", TextInputEditText.class);
    target.tiet_Amount = Utils.findRequiredViewAsType(source, R.id.tiet_Amount, "field 'tiet_Amount'", TextInputEditText.class);
    target.tiet_paid = Utils.findRequiredViewAsType(source, R.id.tiet_paid, "field 'tiet_paid'", TextInputEditText.class);
    target.tiet_tot_amt = Utils.findRequiredViewAsType(source, R.id.tiet_tot_amt, "field 'tiet_tot_amt'", TextInputEditText.class);
    target.tiet_feeamt = Utils.findRequiredViewAsType(source, R.id.tiet_feeamt, "field 'tiet_feeamt'", TextInputEditText.class);
    target.tiet_netamt = Utils.findRequiredViewAsType(source, R.id.tiet_netamt, "field 'tiet_netamt'", TextInputEditText.class);
    target.tiet_amt_refund = Utils.findRequiredViewAsType(source, R.id.tiet_amt_refund, "field 'tiet_amt_refund'", TextInputEditText.class);
    target.llLocation = Utils.findRequiredViewAsType(source, R.id.llLocation, "field 'llLocation'", LinearLayout.class);
    target.llDate = Utils.findRequiredViewAsType(source, R.id.llDate, "field 'llDate'", LinearLayout.class);
    target.llService = Utils.findRequiredViewAsType(source, R.id.llService, "field 'llService'", LinearLayout.class);
    target.vLoc = Utils.findRequiredView(source, R.id.vLoc, "field 'vLoc'");
    target.vDate = Utils.findRequiredView(source, R.id.vDate, "field 'vDate'");
    target.viewSubscription = Utils.findRequiredView(source, R.id.view_subscription, "field 'viewSubscription'");
    target.tietProvider = Utils.findRequiredViewAsType(source, R.id.tietProvider, "field 'tietProvider'", TextInputEditText.class);
    target.llProvider = Utils.findRequiredViewAsType(source, R.id.llProvider, "field 'llProvider'", LinearLayout.class);
    target.viewProvider = Utils.findRequiredView(source, R.id.viewProvider, "field 'viewProvider'");
    target.tietUserName = Utils.findRequiredViewAsType(source, R.id.tietUserName, "field 'tietUserName'", TextInputEditText.class);
    target.llUser = Utils.findRequiredViewAsType(source, R.id.llUser, "field 'llUser'", LinearLayout.class);
    target.viewUsername = Utils.findRequiredView(source, R.id.viewUsername, "field 'viewUsername'");
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletDetails target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tiet_creditWallet = null;
    target.tiet_debit_wallet = null;
    target.tiet_location = null;
    target.tiet_date = null;
    target.tv_txt_reason = null;
    target.tiet_service = null;
    target.tiet_Amount = null;
    target.tiet_paid = null;
    target.tiet_tot_amt = null;
    target.tiet_feeamt = null;
    target.tiet_netamt = null;
    target.tiet_amt_refund = null;
    target.llLocation = null;
    target.llDate = null;
    target.llService = null;
    target.vLoc = null;
    target.vDate = null;
    target.viewSubscription = null;
    target.tietProvider = null;
    target.llProvider = null;
    target.viewProvider = null;
    target.tietUserName = null;
    target.llUser = null;
    target.viewUsername = null;
  }
}
