// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ViewAllPopularServicesFragment_ViewBinding implements Unbinder {
  private ViewAllPopularServicesFragment target;

  @UiThread
  public ViewAllPopularServicesFragment_ViewBinding(ViewAllPopularServicesFragment target,
      View source) {
    this.target = target;

    target.rvViewallServices = Utils.findRequiredViewAsType(source, R.id.rv_viewall_services, "field 'rvViewallServices'", RecyclerView.class);
    target.tvServices = Utils.findRequiredViewAsType(source, R.id.tv_services, "field 'tvServices'", TextView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.ivFilter = Utils.findRequiredViewAsType(source, R.id.iv_filter, "field 'ivFilter'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ViewAllPopularServicesFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvViewallServices = null;
    target.tvServices = null;
    target.ivPopularServices = null;
    target.ivFilter = null;
  }
}
