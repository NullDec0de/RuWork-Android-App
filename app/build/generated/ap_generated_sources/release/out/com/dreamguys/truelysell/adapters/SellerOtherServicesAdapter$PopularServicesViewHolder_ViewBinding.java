// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.dreamguys.truelysell.viewwidgets.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SellerOtherServicesAdapter$PopularServicesViewHolder_ViewBinding implements Unbinder {
  private SellerOtherServicesAdapter.PopularServicesViewHolder target;

  @UiThread
  public SellerOtherServicesAdapter$PopularServicesViewHolder_ViewBinding(
      SellerOtherServicesAdapter.PopularServicesViewHolder target, View source) {
    this.target = target;

    target.ivProfileImage = Utils.findRequiredViewAsType(source, R.id.iv_profile_image, "field 'ivProfileImage'", CircleImageView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.tvServiceName = Utils.findRequiredViewAsType(source, R.id.tv_service_name, "field 'tvServiceName'", TextView.class);
    target.rbRating = Utils.findRequiredViewAsType(source, R.id.rb_rating, "field 'rbRating'", RatingBar.class);
    target.tvRatingCount = Utils.findRequiredViewAsType(source, R.id.tv_total_rating, "field 'tvRatingCount'", TextView.class);
    target.tvServicePrice = Utils.findRequiredViewAsType(source, R.id.tv_service_price, "field 'tvServicePrice'", TextView.class);
    target.tvCategory = Utils.findRequiredViewAsType(source, R.id.tv_category, "field 'tvCategory'", TextView.class);
    target.ivServiceImage = Utils.findRequiredViewAsType(source, R.id.iv_service_image, "field 'ivServiceImage'", ImageView.class);
    target.ivGradient = Utils.findRequiredViewAsType(source, R.id.iv_gradient, "field 'ivGradient'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SellerOtherServicesAdapter.PopularServicesViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivProfileImage = null;
    target.ivPopularServices = null;
    target.tvServiceName = null;
    target.rbRating = null;
    target.tvRatingCount = null;
    target.tvServicePrice = null;
    target.tvCategory = null;
    target.ivServiceImage = null;
    target.ivGradient = null;
  }
}
