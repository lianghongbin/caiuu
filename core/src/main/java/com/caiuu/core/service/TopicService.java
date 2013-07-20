package com.caiuu.core.service;

import com.caiuu.core.dao.TopicMapper;
import com.caiuu.core.entity.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午3:19
 * Description:
 */
@Service
@Transactional
public class TopicService {

    @Autowired
    private TopicMapper topicMapper;

    public int save(Topic topic) {
        return topicMapper.insert(topic);
    }

    public int update(Topic topic) {
        return topicMapper.update(topic);
    }

    public int updatePicture(Map<String,String> map) {
        return topicMapper.updatePicture(map);
    }

    public List<Topic> findAll() {
        return topicMapper.selectAll();
    }

    public Topic find(int id) {
        return topicMapper.select(id);
    }

    public int delete(int id) {
        return topicMapper.delete(id);
    }
}
