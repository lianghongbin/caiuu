package com.caiuu.core.dao;

import com.caiuu.core.entity.StaticBlock;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-10
 * Time: 下午10:56
 * Description:
 */
@Repository
public interface StaticBlockMapper {

    public int insert(StaticBlock block);

    public int update(StaticBlock block);

    public StaticBlock select(int id);

    public List<StaticBlock> selectAll();
}
