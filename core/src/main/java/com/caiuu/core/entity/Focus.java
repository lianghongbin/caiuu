package com.caiuu.core.entity;

import java.util.Date;

public class Focus {

    private int id;
    private String title;
    private String url;
    private String pic43;
    private String pic21;
    private Date publishTime;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPic43() {
        return pic43;
    }

    public void setPic43(String pic43) {
        this.pic43 = pic43;
    }

    public String getPic21() {
        return pic21;
    }

    public void setPic21(String pic21) {
        this.pic21 = pic21 == null ? null : pic21.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}