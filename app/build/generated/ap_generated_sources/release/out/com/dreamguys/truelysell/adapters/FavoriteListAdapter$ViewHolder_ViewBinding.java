// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.FavouriteAnimationLib.LikeButton;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FavoriteListAdapter$ViewHolder_ViewBinding implements Unbinder {
  private FavoriteListAdapter.ViewHolder target;

  @UiThread
  public FavoriteListAdapter$ViewHolder_ViewBinding(FavoriteListAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.tvServiceName = Utils.findRequiredViewAsType(source, R.id.tv_service_name, "field 'tvServiceName'", TextView.class);
    target.tvCategory = Utils.findRequiredViewAsType(source, R.id.tv_category, "field 'tvCategory'", TextView.class);
    target.ivServiceImage = Utils.findRequiredViewAsType(source, R.id.iv_service_image, "field 'ivServiceImage'", ImageView.class);
    target.ivGradient = Utils.findRequiredViewAsType(source, R.id.iv_gradient, "field 'ivGradient'", ImageView.class);
    target.icFav = Utils.findRequiredViewAsType(source, R.id.icFav, "field 'icFav'", LikeButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FavoriteListAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivPopularServices = null;
    target.tvServiceName = null;
    target.tvCategory = null;
    target.ivServiceImage = null;
    target.ivGradient = null;
    target.icFav = null;
  }
}
