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

public class ServiceActiveInActiveFragment_ViewBinding implements Unbinder {
  private ServiceActiveInActiveFragment target;

  @UiThread
  public ServiceActiveInActiveFragment_ViewBinding(ServiceActiveInActiveFragment target,
      View source) {
    this.target = target;

    target.rvMyServices = Utils.findRequiredViewAsType(source, R.id.rv_myservices, "field 'rvMyServices'", RecyclerView.class);
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
    target.ivFilter = Utils.findRequiredViewAsType(source, R.id.iv_filter, "field 'ivFilter'", ImageView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.txtMyProviders = Utils.findRequiredViewAsType(source, R.id.txt_my_providers, "field 'txtMyProviders'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ServiceActiveInActiveFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvMyServices = null;
    target.tvNoRecordsFound = null;
    target.ivFilter = null;
    target.ivPopularServices = null;
    target.txtMyProviders = null;
  }
}
