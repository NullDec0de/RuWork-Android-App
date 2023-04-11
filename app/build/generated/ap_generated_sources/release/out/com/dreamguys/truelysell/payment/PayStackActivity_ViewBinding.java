// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.payment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.CharSequence;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PayStackActivity_ViewBinding implements Unbinder {
  private PayStackActivity target;

  private View view7f080144;

  private TextWatcher view7f080144TextWatcher;

  @UiThread
  public PayStackActivity_ViewBinding(PayStackActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PayStackActivity_ViewBinding(final PayStackActivity target, View source) {
    this.target = target;

    View view;
    target.cetEnterCardNumber = Utils.findRequiredViewAsType(source, R.id.cet_enter_card_number, "field 'cetEnterCardNumber'", EditText.class);
    view = Utils.findRequiredView(source, R.id.cet_expiry_date, "field 'cetExpiryDate', method 'beforeExpireEtChanged', and method 'autoFixAndMoveToNext'");
    target.cetExpiryDate = Utils.castView(view, R.id.cet_expiry_date, "field 'cetExpiryDate'", EditText.class);
    view7f080144 = view;
    view7f080144TextWatcher = new TextWatcher() {
      @Override
      public void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.autoFixAndMoveToNext();
      }

      @Override
      public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
        target.beforeExpireEtChanged();
      }

      @Override
      public void afterTextChanged(Editable p0) {
      }
    };
    ((TextView) view).addTextChangedListener(view7f080144TextWatcher);
    target.cetCvv = Utils.findRequiredViewAsType(source, R.id.cet_cvv, "field 'cetCvv'", EditText.class);
    target.tvPrice = Utils.findRequiredViewAsType(source, R.id.tv_price, "field 'tvPrice'", TextView.class);
    target.tvPayableAmount = Utils.findRequiredViewAsType(source, R.id.tvPayableAmount, "field 'tvPayableAmount'", TextView.class);
    target.tv_name = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'tv_name'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PayStackActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cetEnterCardNumber = null;
    target.cetExpiryDate = null;
    target.cetCvv = null;
    target.tvPrice = null;
    target.tvPayableAmount = null;
    target.tv_name = null;

    ((TextView) view7f080144).removeTextChangedListener(view7f080144TextWatcher);
    view7f080144TextWatcher = null;
    view7f080144 = null;
  }
}
