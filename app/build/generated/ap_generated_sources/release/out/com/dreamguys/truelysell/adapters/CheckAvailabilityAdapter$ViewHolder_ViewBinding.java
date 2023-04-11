// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CheckAvailabilityAdapter$ViewHolder_ViewBinding implements Unbinder {
  private CheckAvailabilityAdapter.ViewHolder target;

  @UiThread
  public CheckAvailabilityAdapter$ViewHolder_ViewBinding(CheckAvailabilityAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.switchSelect = Utils.findRequiredViewAsType(source, R.id.switch_select, "field 'switchSelect'", Switch.class);
    target.tvAvailDay = Utils.findRequiredViewAsType(source, R.id.tv_avail_day, "field 'tvAvailDay'", TextView.class);
    target.tvFromTime = Utils.findRequiredViewAsType(source, R.id.tv_from_time, "field 'tvFromTime'", TextView.class);
    target.tvToTime = Utils.findRequiredViewAsType(source, R.id.tv_to_time, "field 'tvToTime'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CheckAvailabilityAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.switchSelect = null;
    target.tvAvailDay = null;
    target.tvFromTime = null;
    target.tvToTime = null;
  }
}
