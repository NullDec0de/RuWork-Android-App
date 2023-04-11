// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.dreamguys.truelysell.viewwidgets.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HomeCategoryAdapter$CategoryViewHolder_ViewBinding implements Unbinder {
  private HomeCategoryAdapter.CategoryViewHolder target;

  @UiThread
  public HomeCategoryAdapter$CategoryViewHolder_ViewBinding(
      HomeCategoryAdapter.CategoryViewHolder target, View source) {
    this.target = target;

    target.ivCatImg = Utils.findRequiredViewAsType(source, R.id.iv_cat_img, "field 'ivCatImg'", CircleImageView.class);
    target.tvCatName = Utils.findRequiredViewAsType(source, R.id.tv_cat_name, "field 'tvCatName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeCategoryAdapter.CategoryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivCatImg = null;
    target.tvCatName = null;
  }
}
