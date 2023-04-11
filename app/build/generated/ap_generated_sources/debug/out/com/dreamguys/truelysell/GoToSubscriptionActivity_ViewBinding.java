// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GoToSubscriptionActivity_ViewBinding implements Unbinder {
  private GoToSubscriptionActivity target;

  private View view7f0800e7;

  @UiThread
  public GoToSubscriptionActivity_ViewBinding(GoToSubscriptionActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GoToSubscriptionActivity_ViewBinding(final GoToSubscriptionActivity target, View source) {
    this.target = target;

    View view;
    target.tvBuySubs = Utils.findRequiredViewAsType(source, R.id.tv_buy_subs, "field 'tvBuySubs'", TextView.class);
    target.tvThankyou = Utils.findRequiredViewAsType(source, R.id.tv_thankyou, "field 'tvThankyou'", TextView.class);
    view = Utils.findRequiredView(source, R.id.bt_goto_subs, "field 'btGotoSubs' and method 'onViewClicked'");
    target.btGotoSubs = Utils.castView(view, R.id.bt_goto_subs, "field 'btGotoSubs'", Button.class);
    view7f0800e7 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.ivSubs = Utils.findRequiredViewAsType(source, R.id.iv_subs, "field 'ivSubs'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GoToSubscriptionActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvBuySubs = null;
    target.tvThankyou = null;
    target.btGotoSubs = null;
    target.ivSubs = null;

    view7f0800e7.setOnClickListener(null);
    view7f0800e7 = null;
  }
}
