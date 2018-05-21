package com.kalix.qiao.cms.entities;
import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * Created by Administrator on 2018/5/13.
 * 菜单
 */
@Entity
@Table(name = "qiao_cms_menu")
public class MenuBean extends PersistentEntity {
    private boolean message; //是否留言
    private String name;//菜单名称
    private int navid;//栏目id
    private int sequence;//排序
    private boolean show;//是否显示
    private String url;//菜单地址



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNavid() {
        return navid;
    }

    public void setNavid(int navid) {
        this.navid = navid;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public boolean isMessage() {
        return message;
    }

    public void setMessage(boolean message) {
        this.message = message;
    }

    public boolean isShow() {
        return show;
    }

    public void setShow(boolean show) {
        this.show = show;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
