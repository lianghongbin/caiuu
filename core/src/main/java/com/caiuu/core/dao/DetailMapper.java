package com.caiuu.core.dao;

import com.caiuu.core.entity.Detail;
import com.caiuu.core.entity.DetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DetailMapper {
    int countByExample(DetailExample example);

    int deleteByExample(DetailExample example);

    int insert(Detail record);

    int insertSelective(Detail record);

    List<Detail> selectByExampleWithBLOBs(DetailExample example);

    List<Detail> selectByExample(DetailExample example);

    int updateByExampleSelective(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByExampleWithBLOBs(@Param("record") Detail record, @Param("example") DetailExample example);

    int updateByExample(@Param("record") Detail record, @Param("example") DetailExample example);
}