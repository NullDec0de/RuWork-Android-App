// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentMapView_ViewBinding implements Unbinder {
  private FragmentMapView target;

  private View view7f08011a;

  private View view7f080119;

  @UiThread
  public FragmentMapView_ViewBinding(final FragmentMapView target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_previous, "field 'btnPrevious' and method 'onViewClicked'");
    target.btnPrevious = Utils.castView(view, R.id.btn_previous, "field 'btnPrevious'", Button.class);
    view7f08011a = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_next, "field 'btnNext' and method 'onViewClicked'");
    target.btnNext = Utils.castView(view, R.id.btn_next, "field 'btnNext'", Button.class);
    view7f080119 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.ivMapPin = Utils.findRequiredViewAsType(source, R.id.iv_mappin, "field 'ivMapPin'", ImageView.class);
    target.llBottom = Utils.findRequiredViewAsType(source, R.id.ll_bottom, "field 'llBottom'", LinearLayout.class);
    target.tvLocAddress = Utils.findRequiredViewAsType(source, R.id.tv_loc_address, "field 'tvLocAddress'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentMapView target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnPrevious = null;
    target.btnNext = null;
    target.ivMapPin = null;
    target.llBottom = null;
    target.tvLocAddress = null;

    view7f08011a.setOnClickListener(null);
    view7f08011a = null;
    view7f080119.setOnClickListener(null);
    view7f080119 = null;
  }
}
