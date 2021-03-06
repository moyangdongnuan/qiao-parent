package com.kalix.qiao.forum.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.qiao.forum.entities.ForumBean;

/**
 * Created by sunli on 2018/5/13.
 */
public interface IForumBeanService extends IBizService<ForumBean> {
    //回复管理左侧菜单
    JsonData getReplyForTree();
    //留言管理审核状态的改变
    int getCategory(long id);
    //删除帖子及回复的功能
    void deleteAllById(long id);
}
