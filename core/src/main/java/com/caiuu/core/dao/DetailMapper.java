package com.caiuu.core.dao;

import com.caiuu.core.entity.Detail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailMapper {

    public int insert(Detail detail);

    public int update(Detail detail);

    public int delete(int id);

    public Detail select(int id);

    public List<Detail> selectAll();
}