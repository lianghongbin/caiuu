package com.caiuu.core.dao;

import com.caiuu.core.entity.Material;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MaterialMapper {

    public int insert(Material material);

    public int update(Material material);

    public int delete(int id);

    public Material select(int id);

    public List<Material> selectAll();
}