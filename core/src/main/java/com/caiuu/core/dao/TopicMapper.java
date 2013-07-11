package com.caiuu.core.dao;

import com.caiuu.core.entity.Topic;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicMapper {

    public int insert(Topic topic);

    public int update(Topic topic);

    public int updatePicture(Topic topic);

    public List<Topic> selectAll();

    public Topic select(int id);

    public int delete(int id);
}