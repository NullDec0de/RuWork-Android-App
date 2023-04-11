// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.viewwidgets;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FullScreenImageView_ViewBinding implements Unbinder {
  private FullScreenImageView target;

  @UiThread
  public FullScreenImageView_ViewBinding(FullScreenImageView target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public FullScreenImageView_ViewBinding(FullScreenImageView target, View source) {
    this.target = target;

    target.ivImageFullscreen = Utils.findRequiredViewAsType(source, R.id.iv_image_fullscreen, "field 'ivImageFullscreen'", TouchImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FullScreenImageView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivImageFullscreen = null;
  }
}
