// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ServiceCommentsFragment_ViewBinding implements Unbinder {
  private ServiceCommentsFragment target;

  @UiThread
  public ServiceCommentsFragment_ViewBinding(ServiceCommentsFragment target, View source) {
    this.target = target;

    target.rvOtherServices = Utils.findRequiredViewAsType(source, R.id.rv_other_services, "field 'rvOtherServices'", RecyclerView.class);
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ServiceCommentsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvOtherServices = null;
    target.tvNoRecordsFound = null;
  }
}
