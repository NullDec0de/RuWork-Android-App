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

public class MyServicesAdapter$MyServicesViewHolder_ViewBinding implements Unbinder {
  private MyServicesAdapter.MyServicesViewHolder target;

  @UiThread
  public MyServicesAdapter$MyServicesViewHolder_ViewBinding(
      MyServicesAdapter.MyServicesViewHolder target, View source) {
    this.target = target;

    target.ivServiceImage = Utils.findRequiredViewAsType(source, R.id.iv_service_image, "field 'ivServiceImage'", ImageView.class);
    target.tvServiceName = Utils.findRequiredViewAsType(source, R.id.tv_service_name, "field 'tvServiceName'", TextView.class);
    target.rbRating = Utils.findRequiredViewAsType(source, R.id.rb_rating, "field 'rbRating'", RatingBar.class);
    target.tvRating = Utils.findRequiredViewAsType(source, R.id.tv_rating, "field 'tvRating'", TextView.class);
    target.ivUserimage = Utils.findRequiredViewAsType(source, R.id.iv_userimage, "field 'ivUserimage'", CircleImageView.class);
    target.ivEdit = Utils.findRequiredViewAsType(source, R.id.iv_edit, "field 'ivEdit'", ImageView.class);
    target.ivDelete = Utils.findRequiredViewAsType(source, R.id.iv_delete, "field 'ivDelete'", ImageView.class);
    target.ivStatus = Utils.findRequiredViewAsType(source, R.id.iv_status, "field 'ivStatus'", TextView.class);
    target.tvCategory = Utils.findRequiredViewAsType(source, R.id.tv_category, "field 'tvCategory'", TextView.class);
    target.tvServiceCost = Utils.findRequiredViewAsType(source, R.id.tv_service_cost, "field 'tvServiceCost'", TextView.class);
    target.tvViewonmap = Utils.findRequiredViewAsType(source, R.id.tv_viewonmap, "field 'tvViewonmap'", TextView.class);
    target.txtInprogress = Utils.findRequiredViewAsType(source, R.id.txt_inprogress, "field 'txtInprogress'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MyServicesAdapter.MyServicesViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivServiceImage = null;
    target.tvServiceName = null;
    target.rbRating = null;
    target.tvRating = null;
    target.ivUserimage = null;
    target.ivEdit = null;
    target.ivDelete = null;
    target.ivStatus = null;
    target.tvCategory = null;
    target.tvServiceCost = null;
    target.tvViewonmap = null;
    target.txtInprogress = null;
  }
}
