package com.caiuu.core.service;

import com.caiuu.core.dao.CategoryMapper;
import com.caiuu.core.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: lianghongbin
 * Date: 7/3/13
 * Time: 11:02
 * Description:
 */
@Service
@Transactional
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> findAll() {
        return categoryMapper.selectAll();
    }

    public int count() {
        return categoryMapper.count();
    }

    public int delete(int id) {
        return categoryMapper.delete(id);
    }

    public int save(Category category) {
        return categoryMapper.insert(category);
    }

    public int update(Category category) {
        return categoryMapper.update(category);
    }
}
