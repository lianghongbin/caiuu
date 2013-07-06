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
@Transactional(readOnly = true)
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> findAll() {
        return categoryMapper.selectAll();
    }
}
