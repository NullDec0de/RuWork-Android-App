// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StripeSettingsActivity_ViewBinding extends BaseActivity_ViewBinding {
  private StripeSettingsActivity target;

  private View view7f0800f8;

  @UiThread
  public StripeSettingsActivity_ViewBinding(StripeSettingsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StripeSettingsActivity_ViewBinding(final StripeSettingsActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.editAcc_Holder_name = Utils.findRequiredViewAsType(source, R.id.et_acc_holder_name, "field 'editAcc_Holder_name'", EditText.class);
    target.editAcc_num = Utils.findRequiredViewAsType(source, R.id.et_acc_num, "field 'editAcc_num'", EditText.class);
    target.editIBAN = Utils.findRequiredViewAsType(source, R.id.et_IBAN_num, "field 'editIBAN'", EditText.class);
    target.editBankName = Utils.findRequiredViewAsType(source, R.id.et_bank_name, "field 'editBankName'", EditText.class);
    target.editBankAddress = Utils.findRequiredViewAsType(source, R.id.et_bank_addr, "field 'editBankAddress'", EditText.class);
    target.editSortCode = Utils.findRequiredViewAsType(source, R.id.et_sort_code, "field 'editSortCode'", EditText.class);
    target.editRoutingNum = Utils.findRequiredViewAsType(source, R.id.et_routing_num, "field 'editRoutingNum'", EditText.class);
    target.editIFSCCode = Utils.findRequiredViewAsType(source, R.id.et_IFSC_code, "field 'editIFSCCode'", EditText.class);
    target.et_Email = Utils.findRequiredViewAsType(source, R.id.et_email, "field 'et_Email'", EditText.class);
    target.et_Contactno = Utils.findRequiredViewAsType(source, R.id.et_contactno, "field 'et_Contactno'", EditText.class);
    view = Utils.findRequiredView(source, R.id.bt_update, "field 'btUpdate' and method 'onViewClicked'");
    target.btUpdate = Utils.castView(view, R.id.bt_update, "field 'btUpdate'", Button.class);
    view7f0800f8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.ctvAccHolderName = Utils.findRequiredViewAsType(source, R.id.ctv_acc_holder_name, "field 'ctvAccHolderName'", TextView.class);
    target.ctvAccNum = Utils.findRequiredViewAsType(source, R.id.ctv_acc_num, "field 'ctvAccNum'", TextView.class);
    target.ctvIban = Utils.findRequiredViewAsType(source, R.id.ctv_iban, "field 'ctvIban'", TextView.class);
    target.ctvBankName = Utils.findRequiredViewAsType(source, R.id.ctv_bank_name, "field 'ctvBankName'", TextView.class);
    target.ctvBankAddress = Utils.findRequiredViewAsType(source, R.id.ctv_bank_address, "field 'ctvBankAddress'", TextView.class);
    target.ctvSortCode = Utils.findRequiredViewAsType(source, R.id.ctv_sort_code, "field 'ctvSortCode'", TextView.class);
    target.ctvSwiftCode = Utils.findRequiredViewAsType(source, R.id.ctv_swift_code, "field 'ctvSwiftCode'", TextView.class);
    target.ctvIfscCode = Utils.findRequiredViewAsType(source, R.id.ctv_ifsc_code, "field 'ctvIfscCode'", TextView.class);
  }

  @Override
  public void unbind() {
    StripeSettingsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editAcc_Holder_name = null;
    target.editAcc_num = null;
    target.editIBAN = null;
    target.editBankName = null;
    target.editBankAddress = null;
    target.editSortCode = null;
    target.editRoutingNum = null;
    target.editIFSCCode = null;
    target.et_Email = null;
    target.et_Contactno = null;
    target.btUpdate = null;
    target.ctvAccHolderName = null;
    target.ctvAccNum = null;
    target.ctvIban = null;
    target.ctvBankName = null;
    target.ctvBankAddress = null;
    target.ctvSortCode = null;
    target.ctvSwiftCode = null;
    target.ctvIfscCode = null;

    view7f0800f8.setOnClickListener(null);
    view7f0800f8 = null;

    super.unbind();
  }
}
