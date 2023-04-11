// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubscriptionActivity_ViewBinding extends BaseActivity_ViewBinding {
  private SubscriptionActivity target;

  private View view7f0804dc;

  @UiThread
  public SubscriptionActivity_ViewBinding(SubscriptionActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubscriptionActivity_ViewBinding(final SubscriptionActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    target.rvSubsList = Utils.findRequiredViewAsType(source, R.id.rv_subs_list, "field 'rvSubsList'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.tv_skipnow, "field 'tvSkipnow' and method 'onViewClicked'");
    target.tvSkipnow = Utils.castView(view, R.id.tv_skipnow, "field 'tvSkipnow'", TextView.class);
    view7f0804dc = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
  }

  @Override
  public void unbind() {
    SubscriptionActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvSubsList = null;
    target.tvSkipnow = null;

    view7f0804dc.setOnClickListener(null);
    view7f0804dc = null;

    super.unbind();
  }
}
