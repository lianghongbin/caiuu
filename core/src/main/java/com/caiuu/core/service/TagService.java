package com.caiuu.core.service;

import com.caiuu.core.dao.TagMapper;
import com.caiuu.core.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午6:46
 * Description:
 */
@Service
@Transactional
public class TagService {

    @Autowired
    private TagMapper tagMapper;

    public List<Tag> findAll() {
        return tagMapper.selectAll();
    }

    public int save(Tag tag) {
        return tagMapper.insert(tag);
    }

    public int delete(int id) {
        return tagMapper.delete(id);
    }

    public Tag find(int id) {
        return tagMapper.select(id);
    }
}
