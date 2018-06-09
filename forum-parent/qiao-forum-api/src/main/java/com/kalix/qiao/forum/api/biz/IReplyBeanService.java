package com.kalix.qiao.forum.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.qiao.forum.api.dto.ReplyTreeDTO;
import com.kalix.qiao.forum.entities.ReplyBean;

import java.util.List;

/**
 * Created by sunli on 2018/5/13.
 */
public interface IReplyBeanService extends IBizService<ReplyBean> {
    // 回复树
    ReplyTreeDTO getReplyByPostId(long postId, String jsonStr);

    // List<ReplyTreeDTO> getReplyByParentId(ReplyBean replyBean);
}
