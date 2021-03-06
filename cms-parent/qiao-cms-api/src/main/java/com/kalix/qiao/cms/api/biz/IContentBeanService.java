package com.kalix.qiao.cms.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.qiao.cms.entities.ContentBean;

/**
 * Created by Administrator on 2018/5/13.
 */
public interface IContentBeanService extends IBizService<ContentBean> {

    JsonData getMenuByColumnId();

    JsonData getTreeInfo();

    JsonData getContentByMenuId(long menuId);
}
