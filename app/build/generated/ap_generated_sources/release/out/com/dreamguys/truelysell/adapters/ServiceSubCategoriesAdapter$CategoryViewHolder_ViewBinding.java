// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ServiceSubCategoriesAdapter$CategoryViewHolder_ViewBinding implements Unbinder {
  private ServiceSubCategoriesAdapter.CategoryViewHolder target;

  @UiThread
  public ServiceSubCategoriesAdapter$CategoryViewHolder_ViewBinding(
      ServiceSubCategoriesAdapter.CategoryViewHolder target, View source) {
    this.target = target;

    target.tvCatName = Utils.findRequiredViewAsType(source, R.id.tv_cat_name, "field 'tvCatName'", TextView.class);
    target.ivCatImg = Utils.findRequiredViewAsType(source, R.id.iv_cat_img, "field 'ivCatImg'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ServiceSubCategoriesAdapter.CategoryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvCatName = null;
    target.ivCatImg = null;
  }
}
