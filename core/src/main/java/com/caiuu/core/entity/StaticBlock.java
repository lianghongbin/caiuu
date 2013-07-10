package com.caiuu.core.entity;

import java.util.Date;

/**
 * User: Administrator
 * Date: 13-7-10
 * Time: 下午10:54
 * Description:
 */
public class StaticBlock {

    private int id;
    private String content;
    private Date createTime;
    private Date lastTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}
