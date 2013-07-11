package com.caiuu.core.dao;

import com.caiuu.core.entity.Temporary;
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

    public int insert(Temporary temporary);

    public int batchInsert(List<Temporary> temporaries);

    public Temporary select(int id);

    public List<Temporary> selectAll();

    public int delete(int id);

    public int batchDelete(List<Integer> ids);
}
