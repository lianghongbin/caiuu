package com.caiuu.core.entity;

import java.util.Date;

public class Focus {
    private Integer focusid;

    private String title;

    private String url;

    private String pic43;

    private String pic21;

    private Long publishtime;

    private Date createtime;

    public Integer getFocusid() {
        return focusid;
    }

    public void setFocusid(Integer focusid) {
        this.focusid = focusid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPic43() {
        return pic43;
    }

    public void setPic43(String pic43) {
        this.pic43 = pic43 == null ? null : pic43.trim();
    }

    public String getPic21() {
        return pic21;
    }

    public void setPic21(String pic21) {
        this.pic21 = pic21 == null ? null : pic21.trim();
    }

    public Long getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Long publishtime) {
        this.publishtime = publishtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}