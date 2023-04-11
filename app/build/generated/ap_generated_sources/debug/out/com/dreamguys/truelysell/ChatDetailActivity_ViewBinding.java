// Generated code from Butter Knife. Do not modify!
package com.dreamguys.truelysell;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.dreamguys.truelysell.viewwidgets.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ChatDetailActivity_ViewBinding implements Unbinder {
  private ChatDetailActivity target;

  private View view7f080285;

  @UiThread
  public ChatDetailActivity_ViewBinding(ChatDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ChatDetailActivity_ViewBinding(final ChatDetailActivity target, View source) {
    this.target = target;

    View view;
    target.rvChatRoom = Utils.findRequiredViewAsType(source, R.id.rv_chat_room, "field 'rvChatRoom'", RecyclerView.class);
    target.etMessageContent = Utils.findRequiredViewAsType(source, R.id.et_message_content, "field 'etMessageContent'", EditText.class);
    view = Utils.findRequiredView(source, R.id.iv_send_message, "field 'ivSendMessage' and method 'onViewClicked'");
    target.ivSendMessage = Utils.castView(view, R.id.iv_send_message, "field 'ivSendMessage'", ImageView.class);
    view7f080285 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.tvNoData = Utils.findRequiredViewAsType(source, R.id.tv_no_data, "field 'tvNoData'", TextView.class);
    target.tvUsername = Utils.findRequiredViewAsType(source, R.id.tv_username, "field 'tvUsername'", TextView.class);
    target.ivReqProcImg = Utils.findRequiredViewAsType(source, R.id.iv_req_proc_img, "field 'ivReqProcImg'", CircleImageView.class);
    target.llSendMsg = Utils.findRequiredViewAsType(source, R.id.ll_send_msg, "field 'llSendMsg'", LinearLayout.class);
    target.mToolbar = Utils.findRequiredViewAsType(source, R.id.tb_toolbar, "field 'mToolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ChatDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rvChatRoom = null;
    target.etMessageContent = null;
    target.ivSendMessage = null;
    target.tvNoData = null;
    target.tvUsername = null;
    target.ivReqProcImg = null;
    target.llSendMsg = null;
    target.mToolbar = null;

    view7f080285.setOnClickListener(null);
    view7f080285 = null;
  }
}
