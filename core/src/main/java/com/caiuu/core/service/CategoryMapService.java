package com.caiuu.core.service;

import com.caiuu.core.dao.CategoryMapMapper;
import com.caiuu.core.entity.CategoryMap;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * User: lianghongbin
 * Date: 7/21/13
 * Time: 21:27
 * Description:
 */
@Service
@Transactional
public class CategoryMapService {

    @Autowired
    private CategoryMapMapper categoryMapMapper;

    public int batchSave(List<CategoryMap> categoryMaps) {
        return categoryMapMapper.batchInsert(categoryMaps);
    }

    public int delete(int id) {
        return categoryMapMapper.delete(id);
    }

    public List<CategoryMap> findByCategoryId(int categoryId, RowBounds rowBounds) {
        return categoryMapMapper.selectByCategoryId(categoryId, rowBounds);
    }

    public int findCountByCategoryId(int categoryId) {
        return categoryMapMapper.selectCountByCategoryId(categoryId);
    }

    public List<CategoryMap> findAll(Map<String,String> params, RowBounds rowBounds) {
        return categoryMapMapper.selectAll(params, rowBounds);
    }

    public int findCount(Map<String,String> params) {
        return categoryMapMapper.selectCount(params);
    }
}
