// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.viewwidgets.CustomViewPager;
import com.google.android.material.tabs.TabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ActivityBookingRequestDetail_ViewBinding extends BaseActivity_ViewBinding {
  private ActivityBookingRequestDetail target;

  private View view7f080105;

  private View view7f080120;

  private View view7f080280;

  private View view7f08026e;

  private View view7f080257;

  private View view7f080258;

  private View view7f08011d;

  private View view7f08010c;

  private View view7f080259;

  @UiThread
  public ActivityBookingRequestDetail_ViewBinding(ActivityBookingRequestDetail target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ActivityBookingRequestDetail_ViewBinding(final ActivityBookingRequestDetail target,
      View source) {
    super(target, source);

    this.target = target;

    View view;
    target.tabServiceDetail = Utils.findRequiredViewAsType(source, R.id.tab_service_detail, "field 'tabServiceDetail'", TabLayout.class);
    target.viewpagerServiceDetail = Utils.findRequiredViewAsType(source, R.id.viewpager_service_detail, "field 'viewpagerServiceDetail'", CustomViewPager.class);
    target.rlParent = Utils.findRequiredViewAsType(source, R.id.rl_parent, "field 'rlParent'", RelativeLayout.class);
    target.tvMarkCompleted = Utils.findRequiredViewAsType(source, R.id.tv_mark_completed, "field 'tvMarkCompleted'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btn_accept, "field 'btnAccept' and method 'onViewClicked'");
    target.btnAccept = Utils.castView(view, R.id.btn_accept, "field 'btnAccept'", Button.class);
    view7f080105 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_reject, "field 'btnReject' and method 'onViewClicked'");
    target.btnReject = Utils.castView(view, R.id.btn_reject, "field 'btnReject'", Button.class);
    view7f080120 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.llBottom = Utils.findRequiredViewAsType(source, R.id.ll_bottom, "field 'llBottom'", LinearLayout.class);
    view = Utils.findRequiredView(source, R.id.iv_reject, "field 'ivReject' and method 'onViewClicked'");
    target.ivReject = Utils.castView(view, R.id.iv_reject, "field 'ivReject'", ImageView.class);
    view7f080280 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_mark_accept, "field 'ivMarkAccept' and method 'onViewClicked'");
    target.ivMarkAccept = Utils.castView(view, R.id.iv_mark_accept, "field 'ivMarkAccept'", ImageView.class);
    view7f08026e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_complete_accept, "field 'ivCompleteAccept' and method 'onViewClicked'");
    target.ivCompleteAccept = Utils.castView(view, R.id.iv_complete_accept, "field 'ivCompleteAccept'", ImageView.class);
    view7f080257 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_complete_reject, "field 'ivCompleteReject' and method 'onViewClicked'");
    target.ivCompleteReject = Utils.castView(view, R.id.iv_complete_reject, "field 'ivCompleteReject'", ImageView.class);
    view7f080258 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.rlAcceptcompleted = Utils.findRequiredViewAsType(source, R.id.rl_acceptcompleted, "field 'rlAcceptcompleted'", RelativeLayout.class);
    target.rl_parentCod = Utils.findRequiredViewAsType(source, R.id.rl_parentcod, "field 'rl_parentCod'", RelativeLayout.class);
    target.tv_mark_completed_cod = Utils.findRequiredViewAsType(source, R.id.tv_mark_completed_cod, "field 'tv_mark_completed_cod'", TextView.class);
    target.iv_mark_acceptcod = Utils.findRequiredViewAsType(source, R.id.iv_mark_acceptcod, "field 'iv_mark_acceptcod'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.btn_ratenow, "field 'btnRatenow' and method 'onViewClicked'");
    target.btnRatenow = Utils.castView(view, R.id.btn_ratenow, "field 'btnRatenow'", Button.class);
    view7f08011d = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_cancel, "field 'btnCancelService' and method 'onViewClicked'");
    target.btnCancelService = Utils.castView(view, R.id.btn_cancel, "field 'btnCancelService'", Button.class);
    view7f08010c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.txtProviderMarkedAsCompleted = Utils.findRequiredViewAsType(source, R.id.txt_provider_marked_as_completed, "field 'txtProviderMarkedAsCompleted'", TextView.class);
    view = Utils.findRequiredView(source, R.id.iv_completed_cod, "method 'onViewClicked'");
    view7f080259 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
  }

  @Override
  public void unbind() {
    ActivityBookingRequestDetail target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tabServiceDetail = null;
    target.viewpagerServiceDetail = null;
    target.rlParent = null;
    target.tvMarkCompleted = null;
    target.btnAccept = null;
    target.btnReject = null;
    target.llBottom = null;
    target.ivReject = null;
    target.ivMarkAccept = null;
    target.ivCompleteAccept = null;
    target.ivCompleteReject = null;
    target.rlAcceptcompleted = null;
    target.rl_parentCod = null;
    target.tv_mark_completed_cod = null;
    target.iv_mark_acceptcod = null;
    target.btnRatenow = null;
    target.btnCancelService = null;
    target.txtProviderMarkedAsCompleted = null;

    view7f080105.setOnClickListener(null);
    view7f080105 = null;
    view7f080120.setOnClickListener(null);
    view7f080120 = null;
    view7f080280.setOnClickListener(null);
    view7f080280 = null;
    view7f08026e.setOnClickListener(null);
    view7f08026e = null;
    view7f080257.setOnClickListener(null);
    view7f080257 = null;
    view7f080258.setOnClickListener(null);
    view7f080258 = null;
    view7f08011d.setOnClickListener(null);
    view7f08011d = null;
    view7f08010c.setOnClickListener(null);
    view7f08010c = null;
    view7f080259.setOnClickListener(null);
    view7f080259 = null;

    super.unbind();
  }
}
