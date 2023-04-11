// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DashboardFragment_ViewBinding implements Unbinder {
  private DashboardFragment target;

  private View view7f0801ec;

  private View view7f0802c9;

  private View view7f0802b7;

  private View view7f0802cd;

  private View view7f0802c1;

  @UiThread
  public DashboardFragment_ViewBinding(final DashboardFragment target, View source) {
    this.target = target;

    View view;
    target.tvMyServices = Utils.findRequiredViewAsType(source, R.id.tv_my_services, "field 'tvMyServices'", TextView.class);
    target.tvBuyerRequest = Utils.findRequiredViewAsType(source, R.id.tv_buyer_request, "field 'tvBuyerRequest'", TextView.class);
    target.tvInprogress = Utils.findRequiredViewAsType(source, R.id.tv_inprogress, "field 'tvInprogress'", TextView.class);
    target.tvCompleted = Utils.findRequiredViewAsType(source, R.id.tv_completed, "field 'tvCompleted'", TextView.class);
    target.tvAppname = Utils.findRequiredViewAsType(source, R.id.tv_appname, "field 'tvAppname'", TextView.class);
    target.tvAppService = Utils.findRequiredViewAsType(source, R.id.tv_app_service, "field 'tvAppService'", TextView.class);
    view = Utils.findRequiredView(source, R.id.fab_add_service, "field 'fabAddService' and method 'onViewClicked'");
    target.fabAddService = Utils.castView(view, R.id.fab_add_service, "field 'fabAddService'", FloatingActionButton.class);
    view7f0801ec = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.ivPayment = Utils.findRequiredViewAsType(source, R.id.iv_payment, "field 'ivPayment'", ImageView.class);
    target.ivBuyerRequest = Utils.findRequiredViewAsType(source, R.id.iv_buyer_request, "field 'ivBuyerRequest'", ImageView.class);
    target.ivPendingServices = Utils.findRequiredViewAsType(source, R.id.iv_pending_services, "field 'ivPendingServices'", ImageView.class);
    target.ivCompletedServices = Utils.findRequiredViewAsType(source, R.id.iv_completed_services, "field 'ivCompletedServices'", ImageView.class);
    target.txtMyProviders = Utils.findRequiredViewAsType(source, R.id.txt_my_providers, "field 'txtMyProviders'", TextView.class);
    target.txtBuyerRequest = Utils.findRequiredViewAsType(source, R.id.txt_buyer_request, "field 'txtBuyerRequest'", TextView.class);
    target.txtInprogressServices = Utils.findRequiredViewAsType(source, R.id.txt_inprogress_services, "field 'txtInprogressServices'", TextView.class);
    target.txtCompletedServices = Utils.findRequiredViewAsType(source, R.id.txt_completed_services, "field 'txtCompletedServices'", TextView.class);
    view = Utils.findRequiredView(source, R.id.ll_my_services, "method 'onViewClicked'");
    view7f0802c9 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_buyer_request, "method 'onViewClicked'");
    view7f0802b7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_pending_services, "method 'onViewClicked'");
    view7f0802cd = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.ll_completed_services, "method 'onViewClicked'");
    view7f0802c1 = view;
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
    DashboardFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvMyServices = null;
    target.tvBuyerRequest = null;
    target.tvInprogress = null;
    target.tvCompleted = null;
    target.tvAppname = null;
    target.tvAppService = null;
    target.fabAddService = null;
    target.ivPayment = null;
    target.ivBuyerRequest = null;
    target.ivPendingServices = null;
    target.ivCompletedServices = null;
    target.txtMyProviders = null;
    target.txtBuyerRequest = null;
    target.txtInprogressServices = null;
    target.txtCompletedServices = null;

    view7f0801ec.setOnClickListener(null);
    view7f0801ec = null;
    view7f0802c9.setOnClickListener(null);
    view7f0802c9 = null;
    view7f0802b7.setOnClickListener(null);
    view7f0802b7 = null;
    view7f0802cd.setOnClickListener(null);
    view7f0802cd = null;
    view7f0802c1.setOnClickListener(null);
    view7f0802c1 = null;
  }
}
