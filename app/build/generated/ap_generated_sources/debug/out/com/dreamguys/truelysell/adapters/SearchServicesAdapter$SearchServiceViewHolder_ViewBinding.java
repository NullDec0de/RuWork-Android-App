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

public class SearchServicesAdapter$SearchServiceViewHolder_ViewBinding implements Unbinder {
  private SearchServicesAdapter.SearchServiceViewHolder target;

  @UiThread
  public SearchServicesAdapter$SearchServiceViewHolder_ViewBinding(
      SearchServicesAdapter.SearchServiceViewHolder target, View source) {
    this.target = target;

    target.ivServiceImage = Utils.findRequiredViewAsType(source, R.id.iv_service_image, "field 'ivServiceImage'", ImageView.class);
    target.tvServiceName = Utils.findRequiredViewAsType(source, R.id.tv_service_name, "field 'tvServiceName'", TextView.class);
    target.rbRating = Utils.findRequiredViewAsType(source, R.id.rb_rating, "field 'rbRating'", RatingBar.class);
    target.tvRating = Utils.findRequiredViewAsType(source, R.id.tv_rating, "field 'tvRating'", TextView.class);
    target.tvCategory = Utils.findRequiredViewAsType(source, R.id.tv_category, "field 'tvCategory'", TextView.class);
    target.ivUserimage = Utils.findRequiredViewAsType(source, R.id.iv_userimage, "field 'ivUserimage'", CircleImageView.class);
    target.tvBook = Utils.findRequiredViewAsType(source, R.id.tv_book, "field 'tvBook'", TextView.class);
    target.tvViewonmap = Utils.findRequiredViewAsType(source, R.id.tv_viewonmap, "field 'tvViewonmap'", TextView.class);
    target.tvCost = Utils.findRequiredViewAsType(source, R.id.tv_cost, "field 'tvCost'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchServicesAdapter.SearchServiceViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivServiceImage = null;
    target.tvServiceName = null;
    target.rbRating = null;
    target.tvRating = null;
    target.tvCategory = null;
    target.ivUserimage = null;
    target.tvBook = null;
    target.tvViewonmap = null;
    target.tvCost = null;
  }
}
