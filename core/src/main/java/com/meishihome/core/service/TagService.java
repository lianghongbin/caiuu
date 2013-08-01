package com.meishihome.core.service;

import com.meishihome.core.dao.TagMapper;
import com.meishihome.core.entity.Tag;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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

    public int findCount() {
        return tagMapper.selectCount();
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

    public List<Tag> findAll(RowBounds rowBounds) {
        return tagMapper.selectAll(rowBounds);
    }
}
