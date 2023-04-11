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

public class HomeCategoryAdapter$ViewMoreViewHolder_ViewBinding implements Unbinder {
  private HomeCategoryAdapter.ViewMoreViewHolder target;

  @UiThread
  public HomeCategoryAdapter$ViewMoreViewHolder_ViewBinding(
      HomeCategoryAdapter.ViewMoreViewHolder target, View source) {
    this.target = target;

    target.ivViewmore = Utils.findRequiredViewAsType(source, R.id.iv_viewmore, "field 'ivViewmore'", ImageView.class);
    target.txt_view_more = Utils.findRequiredViewAsType(source, R.id.txt_view_more, "field 'txt_view_more'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HomeCategoryAdapter.ViewMoreViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivViewmore = null;
    target.txt_view_more = null;
  }
}
