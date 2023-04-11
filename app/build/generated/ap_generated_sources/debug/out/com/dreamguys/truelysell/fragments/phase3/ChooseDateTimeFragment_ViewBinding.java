// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import devs.mulham.horizontalcalendar.HorizontalCalendarView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChooseDateTimeFragment_ViewBinding implements Unbinder {
  private ChooseDateTimeFragment target;

  private View view7f080119;

  @UiThread
  public ChooseDateTimeFragment_ViewBinding(final ChooseDateTimeFragment target, View source) {
    this.target = target;

    View view;
    target.calendarView = Utils.findRequiredViewAsType(source, R.id.calendarView, "field 'calendarView'", HorizontalCalendarView.class);
    view = Utils.findRequiredView(source, R.id.btn_next, "field 'btnNext' and method 'onViewClicked'");
    target.btnNext = Utils.castView(view, R.id.btn_next, "field 'btnNext'", Button.class);
    view7f080119 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.rvPickDatetime = Utils.findRequiredViewAsType(source, R.id.rv_pick_datetime, "field 'rvPickDatetime'", RecyclerView.class);
    target.tvNoRecordsFound = Utils.findRequiredViewAsType(source, R.id.tv_no_records_found, "field 'tvNoRecordsFound'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChooseDateTimeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.calendarView = null;
    target.btnNext = null;
    target.rvPickDatetime = null;
    target.tvNoRecordsFound = null;

    view7f080119.setOnClickListener(null);
    view7f080119 = null;
  }
}
