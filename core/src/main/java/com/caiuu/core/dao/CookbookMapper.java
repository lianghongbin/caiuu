package com.caiuu.core.dao;

import com.caiuu.core.entity.Cookbook;
import com.caiuu.core.entity.CookbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CookbookMapper {
    int countByExample(CookbookExample example);

    int deleteByExample(CookbookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cookbook record);

    int insertSelective(Cookbook record);

    List<Cookbook> selectByExample(CookbookExample example);

    Cookbook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cookbook record, @Param("example") CookbookExample example);

    int updateByExample(@Param("record") Cookbook record, @Param("example") CookbookExample example);

    int updateByPrimaryKeySelective(Cookbook record);

    int updateByPrimaryKey(Cookbook record);
}