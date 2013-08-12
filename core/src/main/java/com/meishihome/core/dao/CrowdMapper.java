package com.meishihome.core.dao;

import com.meishihome.core.entity.Crowd;
import com.meishihome.core.entity.Focus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CrowdMapper {

    public Crowd select(int id);

    public int deleteById(int id);

    public int insert(Crowd focus);

    public int update(Crowd focus);

    public List<Crowd> selectAll();

    public List<Crowd> selectChildren(int parentId);
}