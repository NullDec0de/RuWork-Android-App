// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.viewwidgets.CircleImageView;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyProfileActivity_ViewBinding extends BaseActivity_ViewBinding {
  private MyProfileActivity target;

  private View view7f080112;

  private View view7f08027c;

  private View view7f080125;

  private View view7f08010d;

  private View view7f080114;

  private View view7f080467;

  private View view7f080474;

  private View view7f080124;

  private View view7f080107;

  private View view7f08047c;

  private View view7f0802bc;

  private View view7f080181;

  @UiThread
  public MyProfileActivity_ViewBinding(MyProfileActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyProfileActivity_ViewBinding(final MyProfileActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_edit, "field 'btnEdit' and method 'onViewClicked'");
    target.btnEdit = Utils.castView(view, R.id.btn_edit, "field 'btnEdit'", Button.class);
    view7f080112 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.signupHeader = Utils.findRequiredViewAsType(source, R.id.signup_header, "field 'signupHeader'", ConstraintLayout.class);
    target.ivProfPic = Utils.findRequiredViewAsType(source, R.id.iv_prof_pic, "field 'ivProfPic'", CircleImageView.class);
    target.clHeader = Utils.findRequiredViewAsType(source, R.id.cl_header, "field 'clHeader'", RelativeLayout.class);
    target.tietSubscription = Utils.findRequiredViewAsType(source, R.id.tiet_subscription, "field 'tietSubscription'", TextInputEditText.class);
    target.tietUsername = Utils.findRequiredViewAsType(source, R.id.tiet_username, "field 'tietUsername'", TextInputEditText.class);
    target.tietEmail = Utils.findRequiredViewAsType(source, R.id.tiet_email, "field 'tietEmail'", TextInputEditText.class);
    target.tietPhone = Utils.findRequiredViewAsType(source, R.id.tiet_phone, "field 'tietPhone'", TextInputEditText.class);
    target.tietIcNumber = Utils.findRequiredViewAsType(source, R.id.tiet_ic_number, "field 'tietIcNumber'", TextInputEditText.class);
    target.btnSave = Utils.findRequiredViewAsType(source, R.id.btn_save, "field 'btnSave'", Button.class);
    target.llFooter = Utils.findRequiredViewAsType(source, R.id.ll_footer, "field 'llFooter'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_prof_pic_edit, "field 'ivProfPicEdit' and method 'onViewClicked'");
    target.ivProfPicEdit = Utils.castView(view, R.id.iv_prof_pic_edit, "field 'ivProfPicEdit'", ImageView.class);
    view7f08027c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.ivIcCardImg = Utils.findRequiredViewAsType(source, R.id.iv_ic_card_img, "field 'ivIcCardImg'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.btn_upload_ic, "field 'btnUploadIc' and method 'onViewClicked'");
    target.btnUploadIc = Utils.castView(view, R.id.btn_upload_ic, "field 'btnUploadIc'", Button.class);
    view7f080125 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvTxtSubs = Utils.findRequiredViewAsType(source, R.id.tv_txt_subs, "field 'tvTxtSubs'", TextView.class);
    target.tvTxtUsername = Utils.findRequiredViewAsType(source, R.id.tv_txt_username, "field 'tvTxtUsername'", TextView.class);
    target.tvTxtEmail = Utils.findRequiredViewAsType(source, R.id.tv_txt_email, "field 'tvTxtEmail'", TextView.class);
    target.tvTxtPhone = Utils.findRequiredViewAsType(source, R.id.tv_txt_phone, "field 'tvTxtPhone'", TextView.class);
    target.tvTxtIcCard = Utils.findRequiredViewAsType(source, R.id.tv_txt_ic_card, "field 'tvTxtIcCard'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_change_pwd, "field 'btnChangePwd' and method 'onViewClicked'");
    target.btnChangePwd = Utils.castView(view, R.id.btn_change_pwd, "field 'btnChangePwd'", Button.class);
    view7f08010d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_edit_subscription, "field 'btnEditSubscription' and method 'onViewClicked'");
    target.btnEditSubscription = Utils.castView(view, R.id.btn_edit_subscription, "field 'btnEditSubscription'", ImageView.class);
    view7f080114 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.btnEditMobileno = Utils.findRequiredViewAsType(source, R.id.btn_edit_mobileno, "field 'btnEditMobileno'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.tiet_category, "field 'tietCategory' and method 'onViewClicked'");
    target.tietCategory = Utils.castView(view, R.id.tiet_category, "field 'tietCategory'", EditText.class);
    view7f080467 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tiet_subcategory, "field 'tietSubcategory' and method 'onViewClicked'");
    target.tietSubcategory = Utils.castView(view, R.id.tiet_subcategory, "field 'tietSubcategory'", EditText.class);
    view7f080474 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_update_profile, "field 'btnUpdateProfile' and method 'onViewClicked'");
    target.btnUpdateProfile = Utils.castView(view, R.id.btn_update_profile, "field 'btnUpdateProfile'", Button.class);
    view7f080124 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.llSubscriptionplan = Utils.findRequiredViewAsType(source, R.id.ll_subscriptionplan, "field 'llSubscriptionplan'", LinearLayout.class);
    target.viewSubscription = Utils.findRequiredView(source, R.id.view_subscription, "field 'viewSubscription'");
    target.llCategory = Utils.findRequiredViewAsType(source, R.id.ll_category, "field 'llCategory'", LinearLayout.class);
    target.viewCategory = Utils.findRequiredView(source, R.id.view_category, "field 'viewCategory'");
    target.llSubcategory = Utils.findRequiredViewAsType(source, R.id.ll_subcategory, "field 'llSubcategory'", LinearLayout.class);
    target.viewSubscategory = Utils.findRequiredView(source, R.id.view_subscategory, "field 'viewSubscategory'");
    view = Utils.findRequiredView(source, R.id.btn_availability, "field 'btnAvailability' and method 'onViewClicked'");
    target.btnAvailability = Utils.castView(view, R.id.btn_availability, "field 'btnAvailability'", Button.class);
    view7f080107 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvTxtCurrency = Utils.findRequiredViewAsType(source, R.id.tv_txt_currency, "field 'tvTxtCurrency'", TextView.class);
    view = Utils.findRequiredView(source, R.id.title_currency, "field 'titleCurrency' and method 'onViewClicked'");
    target.titleCurrency = Utils.castView(view, R.id.title_currency, "field 'titleCurrency'", TextView.class);
    view7f08047c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvCategory = Utils.findRequiredViewAsType(source, R.id.tv_category, "field 'tvCategory'", TextView.class);
    target.tvSubcategory = Utils.findRequiredViewAsType(source, R.id.tv_subcategory, "field 'tvSubcategory'", TextView.class);
    target.tvChangePwd = Utils.findRequiredViewAsType(source, R.id.tv_changePwd, "field 'tvChangePwd'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_changePwd, "field 'llChangePwd' and method 'onViewClicked'");
    target.llChangePwd = Utils.castView(view, R.id.ll_changePwd, "field 'llChangePwd'", LinearLayout.class);
    view7f0802bc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.currencyLayout, "method 'onViewClicked'");
    view7f080181 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  public void unbind() {
    MyProfileActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnEdit = null;
    target.signupHeader = null;
    target.ivProfPic = null;
    target.clHeader = null;
    target.tietSubscription = null;
    target.tietUsername = null;
    target.tietEmail = null;
    target.tietPhone = null;
    target.tietIcNumber = null;
    target.btnSave = null;
    target.llFooter = null;
    target.ivProfPicEdit = null;
    target.ivIcCardImg = null;
    target.btnUploadIc = null;
    target.tvTxtSubs = null;
    target.tvTxtUsername = null;
    target.tvTxtEmail = null;
    target.tvTxtPhone = null;
    target.tvTxtIcCard = null;
    target.btnChangePwd = null;
    target.btnEditSubscription = null;
    target.btnEditMobileno = null;
    target.tietCategory = null;
    target.tietSubcategory = null;
    target.btnUpdateProfile = null;
    target.llSubscriptionplan = null;
    target.viewSubscription = null;
    target.llCategory = null;
    target.viewCategory = null;
    target.llSubcategory = null;
    target.viewSubscategory = null;
    target.btnAvailability = null;
    target.tvTxtCurrency = null;
    target.titleCurrency = null;
    target.tvCategory = null;
    target.tvSubcategory = null;
    target.tvChangePwd = null;
    target.llChangePwd = null;

    view7f080112.setOnClickListener(null);
    view7f080112 = null;
    view7f08027c.setOnClickListener(null);
    view7f08027c = null;
    view7f080125.setOnClickListener(null);
    view7f080125 = null;
    view7f08010d.setOnClickListener(null);
    view7f08010d = null;
    view7f080114.setOnClickListener(null);
    view7f080114 = null;
    view7f080467.setOnClickListener(null);
    view7f080467 = null;
    view7f080474.setOnClickListener(null);
    view7f080474 = null;
    view7f080124.setOnClickListener(null);
    view7f080124 = null;
    view7f080107.setOnClickListener(null);
    view7f080107 = null;
    view7f08047c.setOnClickListener(null);
    view7f08047c = null;
    view7f0802bc.setOnClickListener(null);
    view7f0802bc = null;
    view7f080181.setOnClickListener(null);
    view7f080181 = null;

    super.unbind();
  }
}
