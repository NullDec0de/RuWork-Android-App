// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RateProviderActivity_ViewBinding extends BaseActivity_ViewBinding {
  private RateProviderActivity target;

  private View view7f08050e;

  private View view7f080122;

  @UiThread
  public RateProviderActivity_ViewBinding(RateProviderActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RateProviderActivity_ViewBinding(final RateProviderActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.tv_type, "field 'tvType' and method 'onViewClicked'");
    target.tvType = Utils.castView(view, R.id.tv_type, "field 'tvType'", TextView.class);
    view7f08050e = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.rbRating = Utils.findRequiredViewAsType(source, R.id.rb_rating, "field 'rbRating'", AppCompatRatingBar.class);
    target.etComments = Utils.findRequiredViewAsType(source, R.id.et_comments, "field 'etComments'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_send_feeedback, "field 'btnSendFeeedback' and method 'onViewClicked'");
    target.btnSendFeeedback = Utils.castView(view, R.id.btn_send_feeedback, "field 'btnSendFeeedback'", Button.class);
    view7f080122 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.rvTypes = Utils.findRequiredViewAsType(source, R.id.rv_types, "field 'rvTypes'", RecyclerView.class);
    target.txtHowWasExp = Utils.findRequiredViewAsType(source, R.id.txt_how_was_exp, "field 'txtHowWasExp'", TextView.class);
    target.txtLeaveYourComments = Utils.findRequiredViewAsType(source, R.id.txt_leave_your_comments, "field 'txtLeaveYourComments'", TextView.class);
  }

  @Override
  public void unbind() {
    RateProviderActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvType = null;
    target.rbRating = null;
    target.etComments = null;
    target.btnSendFeeedback = null;
    target.rvTypes = null;
    target.txtHowWasExp = null;
    target.txtLeaveYourComments = null;

    view7f08050e.setOnClickListener(null);
    view7f08050e = null;
    view7f080122.setOnClickListener(null);
    view7f080122 = null;

    super.unbind();
  }
}
