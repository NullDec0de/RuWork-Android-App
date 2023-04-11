// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AppThemeListAdapter$ThemeViewHolder_ViewBinding implements Unbinder {
  private AppThemeListAdapter.ThemeViewHolder target;

  @UiThread
  public AppThemeListAdapter$ThemeViewHolder_ViewBinding(AppThemeListAdapter.ThemeViewHolder target,
      View source) {
    this.target = target;

    target.ivAppColor = Utils.findRequiredViewAsType(source, R.id.iv_apptheme, "field 'ivAppColor'", ImageView.class);
    target.ivSelected = Utils.findRequiredViewAsType(source, R.id.iv_selected, "field 'ivSelected'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AppThemeListAdapter.ThemeViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivAppColor = null;
    target.ivSelected = null;
  }
}
