package com.caiuu.core.dao;

import com.caiuu.core.entity.Tag;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TagMapper {

    public int selectCount(Map<String,String> map);

    public int insert(Tag tag);

    public int delete(int id);

    public Tag select(int id);

    public List<Tag> selectAll(Map<String,String> map, RowBounds rowBounds);
}