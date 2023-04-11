// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MyBookingRequestsActivity_ViewBinding extends BaseActivity_ViewBinding {
  private MyBookingRequestsActivity target;

  @UiThread
  public MyBookingRequestsActivity_ViewBinding(MyBookingRequestsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MyBookingRequestsActivity_ViewBinding(MyBookingRequestsActivity target, View source) {
    super(target, source);

    this.target = target;

    target.rvMyservices = Utils.findRequiredViewAsType(source, R.id.rv_myservices, "field 'rvMyservices'", RecyclerView.class);
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
    target.ivPopularServices = Utils.findRequiredViewAsType(source, R.id.iv_popular_services, "field 'ivPopularServices'", ImageView.class);
    target.ivFilter = Utils.findRequiredViewAsType(source, R.id.iv_filter, "field 'ivFilter'", ImageView.class);
    target.txtMyProviders = Utils.findRequiredViewAsType(source, R.id.txt_my_providers, "field 'txtMyProviders'", TextView.class);
  }

  @Override
  public void unbind() {
    MyBookingRequestsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvMyservices = null;
    target.tvNoRecordsFound = null;
    target.ivPopularServices = null;
    target.ivFilter = null;
    target.txtMyProviders = null;

    super.unbind();
  }
}
