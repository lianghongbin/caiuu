package com.caiuu.core.dao;

import com.caiuu.core.entity.Topic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicMapper {

    public int insert(Topic topic);

    public int update(Topic topic);

    public int updatePicture(Map<String,String> map);

    public List<Topic> selectAll();

    public Topic select(int id);

    public int delete(int id);
}