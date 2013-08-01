package com.caiuu.core.dao;

import com.caiuu.core.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {

    public int count();

    public Category select(int id);

    public int delete(int id);

    public int insert(Category category);

    public int update(Category category);

    public String selectNameById(int id);

    public List<Category> selectAll();

    public List<Category> selectTopLevel();

    public List<Category> selectByParent(int parentId);
}