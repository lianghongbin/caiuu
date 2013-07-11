package com.caiuu.core.dao;

import com.caiuu.core.entity.Element;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElementMapper {
    int countByExample(ElementExample example);

    int deleteByExample(ElementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Element record);

    int insertSelective(Element record);

    List<Element> selectByExample(ElementExample example);

    Element selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Element record, @Param("example") ElementExample example);

    int updateByExample(@Param("record") Element record, @Param("example") ElementExample example);

    int updateByPrimaryKeySelective(Element record);

    int updateByPrimaryKey(Element record);
}