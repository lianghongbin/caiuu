package com.meishihome.core.dao;

import com.meishihome.core.entity.Temporary;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午4:07
 * Description:
 */
@Repository
public interface TemporaryMapper {

    public int count();

    public int insert(Temporary temporary);

    public int batchInsert(List<Temporary> temporaries);

    public Temporary select(int id);

    public List<Temporary> selectAll(RowBounds rowBounds);

    public int delete(int id);

    public int batchDelete(List<Integer> ids);
}
