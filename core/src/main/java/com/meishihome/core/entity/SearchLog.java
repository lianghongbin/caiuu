package com.meishihome.core.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * User: lianghongbin
 * Date: 7/5/13
 * Time: 0:32
 * Description:
 */
public class SearchLog implements Serializable {

    private int id;
    private String key;
    private String ip;
    private int result;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
