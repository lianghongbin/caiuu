package com.meishihome.core.dao;

import com.meishihome.core.entity.Detail;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DetailMapper {

    public int insert(Detail detail);

    public int update(Detail detail);

    public int updateContent(Map<String,String> map);

    public int delete(int id);

    public Detail select(int cookbookId);

    public List<Detail> selectAll();
}