// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.core.widget.NestedScrollView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.dreamguys.truelysell.viewwidgets.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SettingsFragment_ViewBinding implements Unbinder {
  private SettingsFragment target;

  private View view7f0803aa;

  private View view7f0803af;

  private View view7f0803ac;

  private View view7f0804a9;

  private View view7f0803bb;

  private View view7f0803a6;

  private View view7f0803ae;

  private View view7f0803b8;

  private View view7f0803b7;

  private View view7f0803b4;

  private View view7f0803ad;

  private View view7f0803ab;

  private View view7f0803a9;

  private View view7f0803a8;

  @UiThread
  public SettingsFragment_ViewBinding(final SettingsFragment target, View source) {
    this.target = target;

    View view;
    target.ivUserImage = Utils.findRequiredViewAsType(source, R.id.iv_user_image, "field 'ivUserImage'", CircleImageView.class);
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.tv_username, "field 'tvUsername'", TextView.class);
    target.tvEmailAddress = Utils.findRequiredViewAsType(source, R.id.tv_email_address, "field 'tvEmailAddress'", TextView.class);
    target.tvLocation = Utils.findRequiredViewAsType(source, R.id.tv_location, "field 'tvLocation'", TextView.class);
    target.ivUserlogin = Utils.findRequiredViewAsType(source, R.id.iv_userlogin, "field 'ivUserlogin'", ImageView.class);
    target.rlRegional = Utils.findRequiredViewAsType(source, R.id.rl_regional, "field 'rlRegional'", RelativeLayout.class);
    target.llChangeLocation = Utils.findRequiredViewAsType(source, R.id.ll_change_location, "field 'llChangeLocation'", LinearLayout.class);
    target.svSettings = Utils.findRequiredViewAsType(source, R.id.sv_settings, "field 'svSettings'", NestedScrollView.class);
    view = Utils.findRequiredView(source, R.id.rl_change_location, "field 'rlChangeLocation' and method 'onViewClicked'");
    target.rlChangeLocation = Utils.castView(view, R.id.rl_change_location, "field 'rlChangeLocation'", RelativeLayout.class);
    view7f0803aa = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_notifications, "field 'rlNotifications' and method 'onViewClicked'");
    target.rlNotifications = Utils.castView(view, R.id.rl_notifications, "field 'rlNotifications'", RelativeLayout.class);
    view7f0803af = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_fav, "field 'rlFav' and method 'onViewClicked'");
    target.rlFav = Utils.castView(view, R.id.rl_fav, "field 'rlFav'", RelativeLayout.class);
    view7f0803ac = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvLanguage = Utils.findRequiredViewAsType(source, R.id.tv_language, "field 'tvLanguage'", TextView.class);
    view = Utils.findRequiredView(source, R.id.tv_edit_profile, "field 'tvEditProfile' and method 'onViewClicked'");
    target.tvEditProfile = Utils.castView(view, R.id.tv_edit_profile, "field 'tvEditProfile'", TextView.class);
    view7f0804a9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvMyServices = Utils.findRequiredViewAsType(source, R.id.tv_my_services, "field 'tvMyServices'", TextView.class);
    target.tvNotifications = Utils.findRequiredViewAsType(source, R.id.tv_notifications, "field 'tvNotifications'", TextView.class);
    target.tvWallet = Utils.findRequiredViewAsType(source, R.id.tv_wallet, "field 'tvWallet'", TextView.class);
    target.ivWallet = Utils.findRequiredViewAsType(source, R.id.iv_wallet, "field 'ivWallet'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.rl_wallet, "field 'rlWallet' and method 'onViewClicked'");
    target.rlWallet = Utils.castView(view, R.id.rl_wallet, "field 'rlWallet'", RelativeLayout.class);
    view7f0803bb = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvChangeLocation = Utils.findRequiredViewAsType(source, R.id.tv_change_location, "field 'tvChangeLocation'", TextView.class);
    target.ivLocation = Utils.findRequiredViewAsType(source, R.id.iv_location, "field 'ivLocation'", ImageView.class);
    target.tvChangeLanguage = Utils.findRequiredViewAsType(source, R.id.tv_change_language, "field 'tvChangeLanguage'", TextView.class);
    target.ivLang = Utils.findRequiredViewAsType(source, R.id.iv_lang, "field 'ivLang'", ImageView.class);
    target.ivOthers = Utils.findRequiredViewAsType(source, R.id.iv_others, "field 'ivOthers'", ImageView.class);
    target.tvSuggestion = Utils.findRequiredViewAsType(source, R.id.tv_suggestion, "field 'tvSuggestion'", TextView.class);
    target.tvTermscondition = Utils.findRequiredViewAsType(source, R.id.tv_termscondition, "field 'tvTermscondition'", TextView.class);
    target.tvShareapp = Utils.findRequiredViewAsType(source, R.id.tv_shareapp, "field 'tvShareapp'", TextView.class);
    target.tvRateapp = Utils.findRequiredViewAsType(source, R.id.tv_rateapp, "field 'tvRateapp'", TextView.class);
    target.ivRate = Utils.findRequiredViewAsType(source, R.id.iv_rate, "field 'ivRate'", ImageView.class);
    target.tvLogout = Utils.findRequiredViewAsType(source, R.id.tv_logout, "field 'tvLogout'", TextView.class);
    target.ivRegional = Utils.findRequiredViewAsType(source, R.id.iv_regional, "field 'ivRegional'", ImageView.class);
    target.ivApptheme = Utils.findRequiredViewAsType(source, R.id.iv_apptheme, "field 'ivApptheme'", ImageView.class);
    target.tvApptheme = Utils.findRequiredViewAsType(source, R.id.tv_change_apptheme, "field 'tvApptheme'", TextView.class);
    target.txtSettings = Utils.findRequiredViewAsType(source, R.id.txt_settings, "field 'txtSettings'", TextView.class);
    target.tv_Fav = Utils.findRequiredViewAsType(source, R.id.tv_fav, "field 'tv_Fav'", TextView.class);
    target.myHistory = Utils.findRequiredViewAsType(source, R.id.my_history, "field 'myHistory'", TextView.class);
    target.txtRegional = Utils.findRequiredViewAsType(source, R.id.txt_regional, "field 'txtRegional'", TextView.class);
    target.tv_Apptheme = Utils.findRequiredViewAsType(source, R.id.tv_apptheme, "field 'tv_Apptheme'", TextView.class);
    target.txtOthers = Utils.findRequiredViewAsType(source, R.id.txt_others, "field 'txtOthers'", TextView.class);
    target.txtDeleteAccount = Utils.findRequiredViewAsType(source, R.id.txt_delete_account, "field 'txtDeleteAccount'", TextView.class);
    target.tvAccountSettings = Utils.findRequiredViewAsType(source, R.id.tv_accountSettings, "field 'tvAccountSettings'", TextView.class);
    view = Utils.findRequiredView(source, R.id.rl_account_settings, "field 'rlAccountSettings' and method 'onViewClicked'");
    target.rlAccountSettings = Utils.castView(view, R.id.rl_account_settings, "field 'rlAccountSettings'", RelativeLayout.class);
    view7f0803a6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.ivContactUs = Utils.findRequiredViewAsType(source, R.id.iv_contact_us, "field 'ivContactUs'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.rl_make_suggestion, "field 'rlMakeSuggestion' and method 'onViewClicked'");
    target.rlMakeSuggestion = Utils.castView(view, R.id.rl_make_suggestion, "field 'rlMakeSuggestion'", RelativeLayout.class);
    view7f0803ae = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.ivTerms = Utils.findRequiredViewAsType(source, R.id.iv_terms, "field 'ivTerms'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.rl_terms_conditions, "field 'rlTermsConditions' and method 'onViewClicked'");
    target.rlTermsConditions = Utils.castView(view, R.id.rl_terms_conditions, "field 'rlTermsConditions'", RelativeLayout.class);
    view7f0803b8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.ivShare = Utils.findRequiredViewAsType(source, R.id.iv_share, "field 'ivShare'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.rl_share_app, "field 'rlShareApp' and method 'onViewClicked'");
    target.rlShareApp = Utils.castView(view, R.id.rl_share_app, "field 'rlShareApp'", RelativeLayout.class);
    view7f0803b7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_rate_app, "field 'rlRateApp' and method 'onViewClicked'");
    target.rlRateApp = Utils.castView(view, R.id.rl_rate_app, "field 'rlRateApp'", RelativeLayout.class);
    view7f0803b4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.imageLogout = Utils.findRequiredViewAsType(source, R.id.image_logout, "field 'imageLogout'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.rl_logout, "field 'rlLogout' and method 'onViewClicked'");
    target.rlLogout = Utils.castView(view, R.id.rl_logout, "field 'rlLogout'", RelativeLayout.class);
    view7f0803ad = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.ivDelete = Utils.findRequiredViewAsType(source, R.id.iv_delete, "field 'ivDelete'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.rl_delete_account, "field 'rlDeleteAccount' and method 'onViewClicked'");
    target.rlDeleteAccount = Utils.castView(view, R.id.rl_delete_account, "field 'rlDeleteAccount'", RelativeLayout.class);
    view7f0803ab = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_change_language, "method 'onViewClicked'");
    view7f0803a9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.rl_change_apptheme, "method 'onViewClicked'");
    view7f0803a8 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    SettingsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivUserImage = null;
    target.tvUsername = null;
    target.tvEmailAddress = null;
    target.tvLocation = null;
    target.ivUserlogin = null;
    target.rlRegional = null;
    target.llChangeLocation = null;
    target.svSettings = null;
    target.rlChangeLocation = null;
    target.rlNotifications = null;
    target.rlFav = null;
    target.tvLanguage = null;
    target.tvEditProfile = null;
    target.tvMyServices = null;
    target.tvNotifications = null;
    target.tvWallet = null;
    target.ivWallet = null;
    target.rlWallet = null;
    target.tvChangeLocation = null;
    target.ivLocation = null;
    target.tvChangeLanguage = null;
    target.ivLang = null;
    target.ivOthers = null;
    target.tvSuggestion = null;
    target.tvTermscondition = null;
    target.tvShareapp = null;
    target.tvRateapp = null;
    target.ivRate = null;
    target.tvLogout = null;
    target.ivRegional = null;
    target.ivApptheme = null;
    target.tvApptheme = null;
    target.txtSettings = null;
    target.tv_Fav = null;
    target.myHistory = null;
    target.txtRegional = null;
    target.tv_Apptheme = null;
    target.txtOthers = null;
    target.txtDeleteAccount = null;
    target.tvAccountSettings = null;
    target.rlAccountSettings = null;
    target.ivContactUs = null;
    target.rlMakeSuggestion = null;
    target.ivTerms = null;
    target.rlTermsConditions = null;
    target.ivShare = null;
    target.rlShareApp = null;
    target.rlRateApp = null;
    target.imageLogout = null;
    target.rlLogout = null;
    target.ivDelete = null;
    target.rlDeleteAccount = null;

    view7f0803aa.setOnClickListener(null);
    view7f0803aa = null;
    view7f0803af.setOnClickListener(null);
    view7f0803af = null;
    view7f0803ac.setOnClickListener(null);
    view7f0803ac = null;
    view7f0804a9.setOnClickListener(null);
    view7f0804a9 = null;
    view7f0803bb.setOnClickListener(null);
    view7f0803bb = null;
    view7f0803a6.setOnClickListener(null);
    view7f0803a6 = null;
    view7f0803ae.setOnClickListener(null);
    view7f0803ae = null;
    view7f0803b8.setOnClickListener(null);
    view7f0803b8 = null;
    view7f0803b7.setOnClickListener(null);
    view7f0803b7 = null;
    view7f0803b4.setOnClickListener(null);
    view7f0803b4 = null;
    view7f0803ad.setOnClickListener(null);
    view7f0803ad = null;
    view7f0803ab.setOnClickListener(null);
    view7f0803ab = null;
    view7f0803a9.setOnClickListener(null);
    view7f0803a9 = null;
    view7f0803a8.setOnClickListener(null);
    view7f0803a8 = null;
  }
}
