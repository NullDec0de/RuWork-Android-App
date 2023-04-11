// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SubscriptionThankYouActivity_ViewBinding implements Unbinder {
  private SubscriptionThankYouActivity target;

  private View view7f0800e6;

  @UiThread
  public SubscriptionThankYouActivity_ViewBinding(SubscriptionThankYouActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SubscriptionThankYouActivity_ViewBinding(final SubscriptionThankYouActivity target,
      View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.bt_getStarted, "field 'btGetStarted' and method 'onViewClicked'");
    target.btGetStarted = Utils.castView(view, R.id.bt_getStarted, "field 'btGetStarted'", Button.class);
    view7f0800e6 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.tb_toolbar, "field 'mToolbar'", Toolbar.class);
    target.ivSubs = Utils.findRequiredViewAsType(source, R.id.iv_subs, "field 'ivSubs'", ImageView.class);
    target.tvSubsThankYou = Utils.findRequiredViewAsType(source, R.id.tv_subs_thank_you, "field 'tvSubsThankYou'", TextView.class);
    target.tvSubsMsg = Utils.findRequiredViewAsType(source, R.id.tv_subs_msg, "field 'tvSubsMsg'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SubscriptionThankYouActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btGetStarted = null;
    target.mToolbar = null;
    target.ivSubs = null;
    target.tvSubsThankYou = null;
    target.tvSubsMsg = null;

    view7f0800e6.setOnClickListener(null);
    view7f0800e6 = null;
  }
}
