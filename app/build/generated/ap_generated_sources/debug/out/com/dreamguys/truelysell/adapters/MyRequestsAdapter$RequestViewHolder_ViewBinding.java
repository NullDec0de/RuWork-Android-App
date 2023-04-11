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

public class MyRequestsAdapter$RequestViewHolder_ViewBinding implements Unbinder {
  private MyRequestsAdapter.RequestViewHolder target;

  @UiThread
  public MyRequestsAdapter$RequestViewHolder_ViewBinding(MyRequestsAdapter.RequestViewHolder target,
      View source) {
    this.target = target;

    target.ivServiceImage = Utils.findRequiredViewAsType(source, R.id.iv_service_image, "field 'ivServiceImage'", ImageView.class);
    target.tvServiceName = Utils.findRequiredViewAsType(source, R.id.tv_service_name, "field 'tvServiceName'", TextView.class);
    target.rbRating = Utils.findRequiredViewAsType(source, R.id.rb_rating, "field 'rbRating'", RatingBar.class);
    target.tvRating = Utils.findRequiredViewAsType(source, R.id.tv_rating, "field 'tvRating'", TextView.class);
    target.tvCategory = Utils.findRequiredViewAsType(source, R.id.tv_category, "field 'tvCategory'", TextView.class);
    target.ivUserimage = Utils.findRequiredViewAsType(source, R.id.iv_userimage, "field 'ivUserimage'", CircleImageView.class);
    target.ivAccept = Utils.findRequiredViewAsType(source, R.id.iv_accept, "field 'ivAccept'", ImageView.class);
    target.ivReject = Utils.findRequiredViewAsType(source, R.id.iv_reject, "field 'ivReject'", ImageView.class);
    target.tvServiceCost = Utils.findRequiredViewAsType(source, R.id.tv_service_cost, "field 'tvServiceCost'", TextView.class);
    target.tvViewOnMap = Utils.findRequiredViewAsType(source, R.id.tv_viewonmap, "field 'tvViewOnMap'", TextView.class);
    target.tvProgress = Utils.findRequiredViewAsType(source, R.id.tv_progress, "field 'tvProgress'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyRequestsAdapter.RequestViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivServiceImage = null;
    target.tvServiceName = null;
    target.rbRating = null;
    target.tvRating = null;
    target.tvCategory = null;
    target.ivUserimage = null;
    target.ivAccept = null;
    target.ivReject = null;
    target.tvServiceCost = null;
    target.tvViewOnMap = null;
    target.tvProgress = null;
  }
}
