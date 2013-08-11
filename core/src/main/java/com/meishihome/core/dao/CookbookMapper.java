package com.meishihome.core.dao;

import com.meishihome.core.entity.Cookbook;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CookbookMapper {

    public int count();

    public int insert(Cookbook cookbook);

    public int update(Cookbook cookbook);

    public int delete(int id);

    public Cookbook select(int id);

    public List<Cookbook> selectAll(RowBounds rowBounds);

    public List<Cookbook> selectByCrowd(int crowdId);
}