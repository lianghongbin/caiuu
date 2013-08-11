package com.meishihome.core.entity;

/**
 * User: Administrator
 * Date: 13-8-11
 * Time: 下午10:28
 * Description:Material-Cookbook关联表
 */
public class MCRelation {

    private int id;
    private int materialId;
    private String materialName;
    private int cookbookId;
    private String cookbookName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCookbookId() {
        return cookbookId;
    }

    public void setCookbookId(int cookbookId) {
        this.cookbookId = cookbookId;
    }

    public String getCookbookName() {
        return cookbookName;
    }

    public void setCookbookName(String cookbookName) {
        this.cookbookName = cookbookName;
    }
}
