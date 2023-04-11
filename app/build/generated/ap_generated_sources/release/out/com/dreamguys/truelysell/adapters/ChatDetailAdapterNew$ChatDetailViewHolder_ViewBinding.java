// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatDetailAdapterNew$ChatDetailViewHolder_ViewBinding implements Unbinder {
  private ChatDetailAdapterNew.ChatDetailViewHolder target;

  @UiThread
  public ChatDetailAdapterNew$ChatDetailViewHolder_ViewBinding(
      ChatDetailAdapterNew.ChatDetailViewHolder target, View source) {
    this.target = target;

    target.tvFromMsg = Utils.findRequiredViewAsType(source, R.id.tv_from_msg, "field 'tvFromMsg'", TextView.class);
    target.tvFromMsgTime = Utils.findRequiredViewAsType(source, R.id.tv_from_msg_time, "field 'tvFromMsgTime'", TextView.class);
    target.tvToMsg = Utils.findRequiredViewAsType(source, R.id.tv_to_msg, "field 'tvToMsg'", TextView.class);
    target.tvToMsgTime = Utils.findRequiredViewAsType(source, R.id.tv_to_msg_time, "field 'tvToMsgTime'", TextView.class);
    target.cvChatFrom = Utils.findRequiredViewAsType(source, R.id.cv_chat_from, "field 'cvChatFrom'", CardView.class);
    target.cvChatTo = Utils.findRequiredViewAsType(source, R.id.cv_chat_to, "field 'cvChatTo'", CardView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatDetailAdapterNew.ChatDetailViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvFromMsg = null;
    target.tvFromMsgTime = null;
    target.tvToMsg = null;
    target.tvToMsgTime = null;
    target.cvChatFrom = null;
    target.cvChatTo = null;
  }
}
