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

public class SubCategoryListAdapter$ProviderViewHolder_ViewBinding implements Unbinder {
  private SubCategoryListAdapter.ProviderViewHolder target;

  @UiThread
  public SubCategoryListAdapter$ProviderViewHolder_ViewBinding(
      SubCategoryListAdapter.ProviderViewHolder target, View source) {
    this.target = target;

    target.ivSubcatImage = Utils.findRequiredViewAsType(source, R.id.iv_subcat_image, "field 'ivSubcatImage'", CircleImageView.class);
    target.tvSubcatname = Utils.findRequiredViewAsType(source, R.id.tv_subcatname, "field 'tvSubcatname'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SubCategoryListAdapter.ProviderViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivSubcatImage = null;
    target.tvSubcatname = null;
  }
}
