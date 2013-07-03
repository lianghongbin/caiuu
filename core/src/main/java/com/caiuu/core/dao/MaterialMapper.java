package com.caiuu.core.dao;

import com.caiuu.core.entity.Material;
import com.caiuu.core.entity.MaterialExample;
import com.caiuu.core.entity.MaterialWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialMapper {
    int countByExample(MaterialExample example);

    int deleteByExample(MaterialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialWithBLOBs record);

    int insertSelective(MaterialWithBLOBs record);

    List<MaterialWithBLOBs> selectByExampleWithBLOBs(MaterialExample example);

    List<Material> selectByExample(MaterialExample example);

    MaterialWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialWithBLOBs record, @Param("example") MaterialExample example);

    int updateByExampleWithBLOBs(@Param("record") MaterialWithBLOBs record, @Param("example") MaterialExample example);

    int updateByExample(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByPrimaryKeySelective(MaterialWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MaterialWithBLOBs record);

    int updateByPrimaryKey(Material record);
}