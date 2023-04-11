// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.wallet;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class WalletDashBoard_ViewBinding implements Unbinder {
  private WalletDashBoard target;

  @UiThread
  public WalletDashBoard_ViewBinding(WalletDashBoard target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public WalletDashBoard_ViewBinding(WalletDashBoard target, View source) {
    this.target = target;

    target.toolbar = Utils.findRequiredViewAsType(source, R.id.tb_wallet, "field 'toolbar'", Toolbar.class);
    target.flWallet = Utils.findRequiredViewAsType(source, R.id.fl_wallet, "field 'flWallet'", FrameLayout.class);
    target.tvGigsTitle = Utils.findRequiredViewAsType(source, R.id.tv_gigs_title, "field 'tvGigsTitle'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    WalletDashBoard target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.toolbar = null;
    target.flWallet = null;
    target.tvGigsTitle = null;
  }
}
