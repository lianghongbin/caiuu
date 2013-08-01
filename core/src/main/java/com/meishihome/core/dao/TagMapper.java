package com.meishihome.core.dao;

import com.meishihome.core.entity.Tag;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TagMapper {

    public int selectCount();

    public int insert(Tag tag);

    public int delete(int id);

    public Tag select(int id);

    public List<Tag> selectAll(RowBounds rowBounds);
}