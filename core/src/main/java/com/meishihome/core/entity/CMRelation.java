package com.meishihome.core.entity;

/**
 * User: Administrator
 * Date: 13-8-11
 * Time: 下午10:27
 * Description:Crowd-Material关联表
 */
public class CMRelation {

    private int id;
    private int crowdId;
    private String crowdName;
    private int materialId;
    private String materialName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCrowdId() {
        return crowdId;
    }

    public void setCrowdId(int crowdId) {
        this.crowdId = crowdId;
    }

    public String getCrowdName() {
        return crowdName;
    }

    public void setCrowdName(String crowdName) {
        this.crowdName = crowdName;
    }

    public int getMaterialId() {
        return materialId;
    }

    public void setMaterialId(int materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
}
