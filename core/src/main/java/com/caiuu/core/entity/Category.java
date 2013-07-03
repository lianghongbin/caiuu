package com.caiuu.core.entity;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable {

    private int id;

    private String name;

    private String dname;

    private String mname;

    private String pinyin;

    private int parentId;

    private Date createTime;

    private Integer cais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCais() {
        return cais;
    }

    public void setCais(Integer cais) {
        this.cais = cais;
    }
}