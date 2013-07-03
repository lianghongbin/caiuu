package com.caiuu.core.entity;

public class MaterialWithBLOBs extends Material {
    private String info;

    private String alimentation;

    private String human;

    private String make;

    private String cure;

    private String other;

    private String remark;

    private String conflict;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(String alimentation) {
        this.alimentation = alimentation == null ? null : alimentation.trim();
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human == null ? null : human.trim();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make == null ? null : make.trim();
    }

    public String getCure() {
        return cure;
    }

    public void setCure(String cure) {
        this.cure = cure == null ? null : cure.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getConflict() {
        return conflict;
    }

    public void setConflict(String conflict) {
        this.conflict = conflict == null ? null : conflict.trim();
    }
}