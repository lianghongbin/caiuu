package com.caiuu.core.dao;

import com.caiuu.core.entity.Focus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FocusMapper {

    public Focus select(int id);

    public int deleteById(int id);

    public int insert(Focus focus);

    public int update(Focus focus);

    public List<Focus> selectAll();
}