package com.meishihome.core.entity;

import com.meishihome.core.entity.Category;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-14
 * Time: 上午12:19
 * Description:
 */
public class CategoryLink {

    private int level;
    private Category category;
    private List<CategoryLink> children;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<CategoryLink> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryLink> children) {
        this.children = children;
    }
}
