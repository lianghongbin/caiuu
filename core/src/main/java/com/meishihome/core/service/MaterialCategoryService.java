package com.meishihome.core.service;

import com.meishihome.core.dao.MaterialCategoryMapper;
import com.meishihome.core.entity.MaterialCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午7:26
 * Description:
 */
@Service
@Transactional
public class MaterialCategoryService {

    @Autowired
    private MaterialCategoryMapper materialCategoryMapper;

    public List<MaterialCategory> findAll() {
        return materialCategoryMapper.selectAll();
    }

    public int save(MaterialCategory materialCategory) {
        return materialCategoryMapper.insert(materialCategory);
    }

    public MaterialCategory find(int id) {
        return materialCategoryMapper.select(id);
    }

    public int update(MaterialCategory materialCategory) {
        return materialCategoryMapper.update(materialCategory);
    }
}
