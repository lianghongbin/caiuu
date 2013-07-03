package com.caiuu.core.dao;

import com.caiuu.core.entity.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper {

    int count();

    int deleteById(int id);

    int insert(Category category);

    int update(Category category);

    List<Category> selectAll();
}