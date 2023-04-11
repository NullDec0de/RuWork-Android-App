// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ReviewTypeListAdapter$ProviderViewHolder_ViewBinding implements Unbinder {
  private ReviewTypeListAdapter.ProviderViewHolder target;

  @UiThread
  public ReviewTypeListAdapter$ProviderViewHolder_ViewBinding(
      ReviewTypeListAdapter.ProviderViewHolder target, View source) {
    this.target = target;

    target.tvTypename = Utils.findRequiredViewAsType(source, R.id.tv_typename, "field 'tvTypename'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ReviewTypeListAdapter.ProviderViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTypename = null;
  }
}
