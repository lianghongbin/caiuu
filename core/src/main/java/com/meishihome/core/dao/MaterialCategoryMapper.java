package com.meishihome.core.dao;

import com.meishihome.core.entity.MaterialCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午7:20
 * Description:
 */
@Repository
public interface MaterialCategoryMapper {

    public List<MaterialCategory> selectAll();

    public int insert(MaterialCategory materialCategory);

    public MaterialCategory select(int id);

    public int update(MaterialCategory materialCategory);
}
