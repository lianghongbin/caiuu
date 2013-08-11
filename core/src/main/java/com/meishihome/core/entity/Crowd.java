package com.meishihome.core.entity;

/**
 * User: Administrator
 * Date: 13-8-10
 * Time: 下午9:27
 * Description: 人群实体类
 */
public class Crowd {

    private int id;
    private int pid;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
