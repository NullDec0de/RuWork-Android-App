// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangePasswordActivity_ViewBinding implements Unbinder {
  private ChangePasswordActivity target;

  private View view7f080123;

  private View view7f080250;

  @UiThread
  public ChangePasswordActivity_ViewBinding(ChangePasswordActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangePasswordActivity_ViewBinding(final ChangePasswordActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_submit, "field 'btnSubmit' and method 'onViewClicked'");
    target.btnSubmit = Utils.castView(view, R.id.btn_submit, "field 'btnSubmit'", Button.class);
    view7f080123 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_back, "field 'ivBack' and method 'onViewClicked'");
    target.ivBack = Utils.castView(view, R.id.iv_back, "field 'ivBack'", ImageView.class);
    view7f080250 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvTitlename = Utils.findRequiredViewAsType(source, R.id.tv_titlename, "field 'tvTitlename'", TextView.class);
    target.etCurrentPwd = Utils.findRequiredViewAsType(source, R.id.et_currentPwd, "field 'etCurrentPwd'", EditText.class);
    target.etNewPwd = Utils.findRequiredViewAsType(source, R.id.et_newPwd, "field 'etNewPwd'", EditText.class);
    target.etConfirmPwd = Utils.findRequiredViewAsType(source, R.id.et_confirmPwd, "field 'etConfirmPwd'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChangePasswordActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnSubmit = null;
    target.ivBack = null;
    target.tvTitlename = null;
    target.etCurrentPwd = null;
    target.etNewPwd = null;
    target.etConfirmPwd = null;

    view7f080123.setOnClickListener(null);
    view7f080123 = null;
    view7f080250.setOnClickListener(null);
    view7f080250 = null;
  }
}
