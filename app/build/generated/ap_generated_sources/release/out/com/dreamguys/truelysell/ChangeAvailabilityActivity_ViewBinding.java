// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChangeAvailabilityActivity_ViewBinding extends BaseActivity_ViewBinding {
  private ChangeAvailabilityActivity target;

  private View view7f08011c;

  @UiThread
  public ChangeAvailabilityActivity_ViewBinding(ChangeAvailabilityActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChangeAvailabilityActivity_ViewBinding(final ChangeAvailabilityActivity target,
      View source) {
    super(target, source);

    this.target = target;

    View view;
    target.tvTxtAvailability = Utils.findRequiredViewAsType(source, R.id.tv_txt_availability, "field 'tvTxtAvailability'", TextView.class);
    target.tvTxtFrom = Utils.findRequiredViewAsType(source, R.id.tv_txt_from, "field 'tvTxtFrom'", TextView.class);
    target.tvTxtTo = Utils.findRequiredViewAsType(source, R.id.tv_txt_to, "field 'tvTxtTo'", TextView.class);
    target.rvAvailParent = Utils.findRequiredViewAsType(source, R.id.rv_avail_parent, "field 'rvAvailParent'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.btn_provider_submit, "field 'btnProviderSubmit' and method 'onViewClicked'");
    target.btnProviderSubmit = Utils.castView(view, R.id.btn_provider_submit, "field 'btnProviderSubmit'", Button.class);
    view7f08011c = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  public void unbind() {
    ChangeAvailabilityActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTxtAvailability = null;
    target.tvTxtFrom = null;
    target.tvTxtTo = null;
    target.rvAvailParent = null;
    target.btnProviderSubmit = null;

    view7f08011c.setOnClickListener(null);
    view7f08011c = null;

    super.unbind();
  }
}
