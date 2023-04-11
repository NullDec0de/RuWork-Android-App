// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ServiceDescriptionFragment_ViewBinding implements Unbinder {
  private ServiceDescriptionFragment target;

  private View view7f08011a;

  private View view7f08010a;

  @UiThread
  public ServiceDescriptionFragment_ViewBinding(final ServiceDescriptionFragment target,
      View source) {
    this.target = target;

    View view;
    target.etDescription = Utils.findRequiredViewAsType(source, R.id.et_description, "field 'etDescription'", EditText.class);
    target.tvCurrentBalance = Utils.findRequiredViewAsType(source, R.id.text_current_balance, "field 'tvCurrentBalance'", TextView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.ivPayment = Utils.findRequiredViewAsType(source, R.id.iv_payment, "field 'ivPayment'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.btn_previous, "field 'btnPrevious' and method 'onViewClicked'");
    target.btnPrevious = Utils.castView(view, R.id.btn_previous, "field 'btnPrevious'", Button.class);
    view7f08011a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_booknow, "field 'btnBooknow' and method 'onViewClicked'");
    target.btnBooknow = Utils.castView(view, R.id.btn_booknow, "field 'btnBooknow'", Button.class);
    view7f08010a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.txtMsgToProfessional = Utils.findRequiredViewAsType(source, R.id.txt_msg_to_professional, "field 'txtMsgToProfessional'", TextView.class);
    target.txtWalletDetails = Utils.findRequiredViewAsType(source, R.id.txt_wallet_details, "field 'txtWalletDetails'", TextView.class);
    target.labelCurrentBalance = Utils.findRequiredViewAsType(source, R.id.label_current_balance, "field 'labelCurrentBalance'", TextView.class);
    target.rbWallet = Utils.findRequiredViewAsType(source, R.id.rbWallet, "field 'rbWallet'", RadioButton.class);
    target.rbCOD = Utils.findRequiredViewAsType(source, R.id.rbCOD, "field 'rbCOD'", RadioButton.class);
    target.rgPayType = Utils.findRequiredViewAsType(source, R.id.rgPayType, "field 'rgPayType'", RadioGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ServiceDescriptionFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etDescription = null;
    target.tvCurrentBalance = null;
    target.ivPopularServices = null;
    target.ivPayment = null;
    target.btnPrevious = null;
    target.btnBooknow = null;
    target.txtMsgToProfessional = null;
    target.txtWalletDetails = null;
    target.labelCurrentBalance = null;
    target.rbWallet = null;
    target.rbCOD = null;
    target.rgPayType = null;

    view7f08011a.setOnClickListener(null);
    view7f08011a = null;
    view7f08010a.setOnClickListener(null);
    view7f08010a = null;
  }
}
