package com.caiuu.core.dao;

import com.caiuu.core.entity.Tag;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface TagMapper {

    public List<Tag> selectAll();

    public int insert(Tag tag);

    public int delete(int id);

    public Tag select(int id);
}