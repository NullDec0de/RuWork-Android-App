// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.google.android.material.tabs.TabLayout;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ServiceRequestOverviewFragment_ViewBinding implements Unbinder {
  private ServiceRequestOverviewFragment target;

  @UiThread
  public ServiceRequestOverviewFragment_ViewBinding(ServiceRequestOverviewFragment target,
      View source) {
    this.target = target;

    target.tvServiceName = Utils.findRequiredViewAsType(source, R.id.tv_service_name, "field 'tvServiceName'", TextView.class);
    target.tvServicePrice = Utils.findRequiredViewAsType(source, R.id.tv_service_price, "field 'tvServicePrice'", TextView.class);
    target.tvViews = Utils.findRequiredViewAsType(source, R.id.tv_views, "field 'tvViews'", TextView.class);
    target.forecastCityPicker = Utils.findRequiredViewAsType(source, R.id.forecast_city_picker, "field 'forecastCityPicker'", DiscreteScrollView.class);
    target.viewpager = Utils.findRequiredViewAsType(source, R.id.viewpager, "field 'viewpager'", ViewPager.class);
    target.tabLayout = Utils.findRequiredViewAsType(source, R.id.tab_layout, "field 'tabLayout'", TabLayout.class);
    target.tvCategory = Utils.findRequiredViewAsType(source, R.id.tv_category, "field 'tvCategory'", TextView.class);
    target.rbRating = Utils.findRequiredViewAsType(source, R.id.rb_rating, "field 'rbRating'", RatingBar.class);
    target.tvRatingCount = Utils.findRequiredViewAsType(source, R.id.tv_rating_count, "field 'tvRatingCount'", TextView.class);
    target.tvDescription = Utils.findRequiredViewAsType(source, R.id.tv_description, "field 'tvDescription'", TextView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ServiceRequestOverviewFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvServiceName = null;
    target.tvServicePrice = null;
    target.tvViews = null;
    target.forecastCityPicker = null;
    target.viewpager = null;
    target.tabLayout = null;
    target.tvCategory = null;
    target.rbRating = null;
    target.tvRatingCount = null;
    target.tvDescription = null;
    target.ivPopularServices = null;
  }
}
