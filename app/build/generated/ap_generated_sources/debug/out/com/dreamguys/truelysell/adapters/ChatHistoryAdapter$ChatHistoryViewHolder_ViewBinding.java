// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.adapters;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.dreamguys.truelysell.viewwidgets.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatHistoryAdapter$ChatHistoryViewHolder_ViewBinding implements Unbinder {
  private ChatHistoryAdapter.ChatHistoryViewHolder target;

  @UiThread
  public ChatHistoryAdapter$ChatHistoryViewHolder_ViewBinding(
      ChatHistoryAdapter.ChatHistoryViewHolder target, View source) {
    this.target = target;

    target.ivUserimg = Utils.findRequiredViewAsType(source, R.id.iv_userimg, "field 'ivUserimg'", CircleImageView.class);
    target.tvMessagerName = Utils.findRequiredViewAsType(source, R.id.tv_messager_name, "field 'tvMessagerName'", TextView.class);
    target.tvMessagerLastMessage = Utils.findRequiredViewAsType(source, R.id.tv_messager_last_message, "field 'tvMessagerLastMessage'", TextView.class);
    target.tvMessagerLastTime = Utils.findRequiredViewAsType(source, R.id.tv_messager_last_time, "field 'tvMessagerLastTime'", TextView.class);
    target.llChatList = Utils.findRequiredViewAsType(source, R.id.ll_chat_list, "field 'llChatList'", LinearLayout.class);
    target.tvUnreadCount = Utils.findRequiredViewAsType(source, R.id.tv_unread_count, "field 'tvUnreadCount'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatHistoryAdapter.ChatHistoryViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivUserimg = null;
    target.tvMessagerName = null;
    target.tvMessagerLastMessage = null;
    target.tvMessagerLastTime = null;
    target.llChatList = null;
    target.tvUnreadCount = null;
  }
}
