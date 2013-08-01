package com.meishihome.core.dao;

import com.meishihome.core.entity.CategoryMap;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * User: lianghongbin
 * Date: 7/21/13
 * Time: 20:37
 * Description:
 */
@Repository
public interface CategoryMapMapper {

    public int batchInsert(List<CategoryMap> categoryMaps);

    public int delete(int id);

    public List<CategoryMap> selectByCategoryId(int categoryId, RowBounds rowBounds);

    public int selectCountByCategoryId(int categoryId);

    public List<CategoryMap> selectAll(Map<String,String> params, RowBounds rowBounds);

    public int selectCount(Map<String,String> params);
}
