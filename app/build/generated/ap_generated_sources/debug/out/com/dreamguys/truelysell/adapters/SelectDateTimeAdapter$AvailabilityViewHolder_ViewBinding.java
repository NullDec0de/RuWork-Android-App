// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SelectDateTimeAdapter$AvailabilityViewHolder_ViewBinding implements Unbinder {
  private SelectDateTimeAdapter.AvailabilityViewHolder target;

  @UiThread
  public SelectDateTimeAdapter$AvailabilityViewHolder_ViewBinding(
      SelectDateTimeAdapter.AvailabilityViewHolder target, View source) {
    this.target = target;

    target.tvFromtime = Utils.findRequiredViewAsType(source, R.id.tv_fromtime, "field 'tvFromtime'", TextView.class);
    target.tvTotime = Utils.findRequiredViewAsType(source, R.id.tv_totime, "field 'tvTotime'", TextView.class);
    target.ivOtherServices = Utils.findRequiredViewAsType(source, R.id.iv_other_services, "field 'ivOtherServices'", ImageView.class);
    target.tvTimings = Utils.findRequiredViewAsType(source, R.id.tv_timings, "field 'tvTimings'", TextView.class);
    target.tvFrom = Utils.findRequiredViewAsType(source, R.id.tv_from, "field 'tvFrom'", TextView.class);
    target.tvTo = Utils.findRequiredViewAsType(source, R.id.tv_to, "field 'tvTo'", TextView.class);
    target.llTimeslots = Utils.findRequiredViewAsType(source, R.id.ll_timeslots, "field 'llTimeslots'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SelectDateTimeAdapter.AvailabilityViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvFromtime = null;
    target.tvTotime = null;
    target.ivOtherServices = null;
    target.tvTimings = null;
    target.tvFrom = null;
    target.tvTo = null;
    target.llTimeslots = null;
  }
}
