// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeFragment_ViewBinding implements Unbinder {
  private HomeFragment target;

  private View view7f080295;

  private View view7f080296;

  private View view7f080513;

  private View view7f080512;

  private View view7f080514;

  @UiThread
  public HomeFragment_ViewBinding(final HomeFragment target, View source) {
    this.target = target;

    View view;
    target.tvAppname = Utils.findRequiredViewAsType(source, R.id.tv_appname, "field 'tvAppname'", TextView.class);
    target.tvAppService = Utils.findRequiredViewAsType(source, R.id.tv_app_service, "field 'tvAppService'", TextView.class);
    target.rvPopularServices = Utils.findRequiredViewAsType(source, R.id.rv_popular_services, "field 'rvPopularServices'", RecyclerView.class);
    target.rvNewServices = Utils.findRequiredViewAsType(source, R.id.rv_new_services, "field 'rvNewServices'", RecyclerView.class);
    target.rvTopRatedServices = Utils.findRequiredViewAsType(source, R.id.rv_top_rated_services, "field 'rvTopRatedServices'", RecyclerView.class);
    target.rvHomeCategories = Utils.findRequiredViewAsType(source, R.id.rv_home_categories, "field 'rvHomeCategories'", RecyclerView.class);
    target.etSearch = Utils.findRequiredViewAsType(source, R.id.et_search, "field 'etSearch'", EditText.class);
    view = Utils.findRequiredView(source, R.id.iv_userlogin, "field 'ivUserlogin' and method 'onViewClicked'");
    target.ivUserlogin = Utils.castView(view, R.id.iv_userlogin, "field 'ivUserlogin'", ImageView.class);
    view7f080295 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.iv_usermapjobs, "field 'iv_userMapJobs' and method 'onViewClicked'");
    target.iv_userMapJobs = Utils.castView(view, R.id.iv_usermapjobs, "field 'iv_userMapJobs'", ImageView.class);
    view7f080296 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.tvNoCategories = Utils.findRequiredViewAsType(source, R.id.tv_no_categories, "field 'tvNoCategories'", TextView.class);
    target.tvNoPopularServices = Utils.findRequiredViewAsType(source, R.id.tv_no_popular_services, "field 'tvNoPopularServices'", TextView.class);
    target.tvNoNewServices = Utils.findRequiredViewAsType(source, R.id.tv_no_new_services, "field 'tvNoNewServices'", TextView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.ivNewServices = Utils.findRequiredViewAsType(source, R.id.iv_new_services, "field 'ivNewServices'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.tv_viewall_popular, "field 'tvViewallPopular' and method 'onViewClicked'");
    target.tvViewallPopular = Utils.castView(view, R.id.tv_viewall_popular, "field 'tvViewallPopular'", TextView.class);
    view7f080513 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_viewall_new, "field 'tvViewallNew' and method 'onViewClicked'");
    target.tvViewallNew = Utils.castView(view, R.id.tv_viewall_new, "field 'tvViewallNew'", TextView.class);
    view7f080512 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.tv_viewall_top_rated, "field 'tv_viewall_top_rated' and method 'onViewClicked'");
    target.tv_viewall_top_rated = Utils.castView(view, R.id.tv_viewall_top_rated, "field 'tv_viewall_top_rated'", TextView.class);
    view7f080514 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.llCategories = Utils.findRequiredViewAsType(source, R.id.ll_categories, "field 'llCategories'", LinearLayout.class);
    target.txtPopularServices = Utils.findRequiredViewAsType(source, R.id.txt_popular_services, "field 'txtPopularServices'", TextView.class);
    target.txtNewlyAddedServices = Utils.findRequiredViewAsType(source, R.id.txt_newly_added_services, "field 'txtNewlyAddedServices'", TextView.class);
    target.txtEnableLocationService = Utils.findRequiredViewAsType(source, R.id.txt_enable_location_service, "field 'txtEnableLocationService'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvAppname = null;
    target.tvAppService = null;
    target.rvPopularServices = null;
    target.rvNewServices = null;
    target.rvTopRatedServices = null;
    target.rvHomeCategories = null;
    target.etSearch = null;
    target.ivUserlogin = null;
    target.iv_userMapJobs = null;
    target.tvNoCategories = null;
    target.tvNoPopularServices = null;
    target.tvNoNewServices = null;
    target.ivPopularServices = null;
    target.ivNewServices = null;
    target.tvViewallPopular = null;
    target.tvViewallNew = null;
    target.tv_viewall_top_rated = null;
    target.llCategories = null;
    target.txtPopularServices = null;
    target.txtNewlyAddedServices = null;
    target.txtEnableLocationService = null;

    view7f080295.setOnClickListener(null);
    view7f080295 = null;
    view7f080296.setOnClickListener(null);
    view7f080296 = null;
    view7f080513.setOnClickListener(null);
    view7f080513 = null;
    view7f080512.setOnClickListener(null);
    view7f080512 = null;
    view7f080514.setOnClickListener(null);
    view7f080514 = null;
  }
}
