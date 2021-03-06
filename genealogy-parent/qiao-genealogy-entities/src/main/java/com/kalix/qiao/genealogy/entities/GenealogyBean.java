package com.kalix.qiao.genealogy.entities;

import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.DateTimeException;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/13.
 */
@Entity
@Table(name = "qiao_genealogy_genealogy")
public class GenealogyBean extends PersistentEntity {
    private String genealogyname;//家谱名称
    private int parentid;//父id
    private String country;//国家
    private String province;//省
    private String city;//市
    private String area;//区
    private String county;//县
    private String hamlet;//村
    private String streets;//街道
    private String encoding;//
    private String genealogysite;//谱属地
    private String remarks;//备注
    private String summarize;//概况
    private int listid;//栏目id（打印菜单）
    private int part;//部id（字典表）
    private String unit;//卷id（字典表）
    private String volume;//册id（字典表）

    @Transient
    private JsonData defaultOption; // 级联菜单默认选中项

    public JsonData getDefaultOption() {
        return defaultOption;
    }

    public void setDefaultOption(JsonData defaultOption) {
        this.defaultOption = defaultOption;
    }

    public String getGenealogyname() {
        return genealogyname;
    }

    public void setGenealogyname(String genealogyname) {
        this.genealogyname = genealogyname;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getHamlet() {
        return hamlet;
    }

    public void setHamlet(String hamlet) {
        this.hamlet = hamlet;
    }

    public String getStreets() {
        return streets;
    }

    public void setStreets(String streets) {
        this.streets = streets;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getGenealogysite() {
        return genealogysite;
    }

    public void setGenealogysite(String genealogysite) {
        this.genealogysite = genealogysite;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    public int getListid() {
        return listid;
    }

    public void setListid(int listid) {
        this.listid = listid;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }



}
