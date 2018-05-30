package com.kalix.qiao.forum.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.qiao.forum.api.dao.IReplyBeanDao;
import com.kalix.qiao.forum.entities.ReplyBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by sunli on 2018/5/13.
 */
public class ReplyBeanDaoImpl extends GenericDao<ReplyBean, Long> implements IReplyBeanDao {
    @Override
    @PersistenceContext(unitName = "forum-cm")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}