// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.dreamguys.truelysell.viewwidgets.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ServiceReviewsAdapter$ReviewsViewHolder_ViewBinding implements Unbinder {
  private ServiceReviewsAdapter.ReviewsViewHolder target;

  @UiThread
  public ServiceReviewsAdapter$ReviewsViewHolder_ViewBinding(
      ServiceReviewsAdapter.ReviewsViewHolder target, View source) {
    this.target = target;

    target.ivUserImg = Utils.findRequiredViewAsType(source, R.id.iv_user_img, "field 'ivUserImg'", CircleImageView.class);
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.tv_username, "field 'tvUsername'", TextView.class);
    target.rbReviews = Utils.findRequiredViewAsType(source, R.id.rb_reviews, "field 'rbReviews'", RatingBar.class);
    target.tvComments = Utils.findRequiredViewAsType(source, R.id.tv_comments, "field 'tvComments'", TextView.class);
    target.tvShowMoreReplies = Utils.findRequiredViewAsType(source, R.id.tv_show_more_replies, "field 'tvShowMoreReplies'", TextView.class);
    target.tvTime = Utils.findRequiredViewAsType(source, R.id.tv_time, "field 'tvTime'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ServiceReviewsAdapter.ReviewsViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivUserImg = null;
    target.tvUsername = null;
    target.rbReviews = null;
    target.tvComments = null;
    target.tvShowMoreReplies = null;
    target.tvTime = null;
  }
}
