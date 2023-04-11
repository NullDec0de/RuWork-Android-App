// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell.fragments.phase3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatHistoryListFragment_ViewBinding implements Unbinder {
  private ChatHistoryListFragment target;

  @UiThread
  public ChatHistoryListFragment_ViewBinding(ChatHistoryListFragment target, View source) {
    this.target = target;

    target.rvMessageChatList = Utils.findRequiredViewAsType(source, R.id.rv_message_chat_list, "field 'rvMessageChatList'", RecyclerView.class);
    target.tvNoChatAvailable = Utils.findRequiredViewAsType(source, R.id.tv_no_chat_available, "field 'tvNoChatAvailable'", TextView.class);
    target.txtChatLists = Utils.findRequiredViewAsType(source, R.id.txt_chat_lists, "field 'txtChatLists'", TextView.class);
    target.ivUserlogin = Utils.findRequiredViewAsType(source, R.id.iv_userlogin, "field 'ivUserlogin'", ImageView.class);
    target.ivSearch = Utils.findRequiredViewAsType(source, R.id.iv_search, "field 'ivSearch'", ImageView.class);
    target.tbToolbar = Utils.findRequiredViewAsType(source, R.id.tb_toolbar, "field 'tbToolbar'", Toolbar.class);
    target.appBar = Utils.findRequiredViewAsType(source, R.id.app_bar, "field 'appBar'", AppBarLayout.class);
    target.txtComingSoon = Utils.findRequiredViewAsType(source, R.id.txt_coming_soon, "field 'txtComingSoon'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatHistoryListFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvMessageChatList = null;
    target.tvNoChatAvailable = null;
    target.txtChatLists = null;
    target.ivUserlogin = null;
    target.ivSearch = null;
    target.tbToolbar = null;
    target.appBar = null;
    target.txtComingSoon = null;
  }
}
