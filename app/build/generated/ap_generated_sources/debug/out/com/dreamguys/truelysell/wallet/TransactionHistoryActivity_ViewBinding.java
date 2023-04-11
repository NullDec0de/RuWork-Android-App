// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.wallet;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TransactionHistoryActivity_ViewBinding implements Unbinder {
  private TransactionHistoryActivity target;

  @UiThread
  public TransactionHistoryActivity_ViewBinding(TransactionHistoryActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public TransactionHistoryActivity_ViewBinding(TransactionHistoryActivity target, View source) {
    this.target = target;

    target.titleWallet = Utils.findRequiredViewAsType(source, R.id.title_wallet, "field 'titleWallet'", TextView.class);
    target.labelTransactionHistory = Utils.findRequiredViewAsType(source, R.id.label_transaction_history, "field 'labelTransactionHistory'", TextView.class);
    target.actionFilter = Utils.findRequiredViewAsType(source, R.id.action_filter, "field 'actionFilter'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TransactionHistoryActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleWallet = null;
    target.labelTransactionHistory = null;
    target.actionFilter = null;
  }
}
