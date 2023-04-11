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

public class CategoryListAdapter$ProviderViewHolder_ViewBinding implements Unbinder {
  private CategoryListAdapter.ProviderViewHolder target;

  @UiThread
  public CategoryListAdapter$ProviderViewHolder_ViewBinding(
      CategoryListAdapter.ProviderViewHolder target, View source) {
    this.target = target;

    target.ivSubcatImage = Utils.findRequiredViewAsType(source, R.id.iv_subcat_image, "field 'ivSubcatImage'", CircleImageView.class);
    target.tvSubcatname = Utils.findRequiredViewAsType(source, R.id.tv_subcatname, "field 'tvSubcatname'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CategoryListAdapter.ProviderViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivSubcatImage = null;
    target.tvSubcatname = null;
  }
}
