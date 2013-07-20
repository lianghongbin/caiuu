package com.caiuu.core.service;

import com.caiuu.core.dao.MaterialMapper;
import com.caiuu.core.entity.Material;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午7:58
 * Description:
 */
@Service
@Transactional
public class MaterialService {

    @Autowired
    private MaterialMapper materialMapper;

    public int findCount() {
        return materialMapper.count();
    }

    public int save(Material material) {
        return materialMapper.insert(material);
    }

    public int update(Material material) {
        return materialMapper.update(material);
    }

    public int delete(int id) {
        return materialMapper.delete(id);
    }

    public Material find(int id) {
        return materialMapper.select(id);
    }

    public List<Material> findAll(RowBounds rowBounds) {
        return materialMapper.selectAll(rowBounds);
    }
}
