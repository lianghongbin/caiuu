package com.caiuu.core.service;

import com.caiuu.core.dao.TemporaryMapper;
import com.caiuu.core.entity.Temporary;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午4:11
 * Description:
 */
@Service
@Transactional
public class TemporaryService {

    @Autowired
    private TemporaryMapper temporaryMapper;

    public int findCount() {
        return temporaryMapper.count();
    }

    public int save(Temporary temporary) {
        return temporaryMapper.insert(temporary);
    }

    public int batchSave(List<Temporary> temporaries) {
        return temporaryMapper.batchInsert(temporaries);
    }

    public Temporary find(int id) {
        return temporaryMapper.select(id);
    }

    public List<Temporary> findAll(RowBounds rowBounds) {
        return temporaryMapper.selectAll(rowBounds);
    }

    public int delete(int id) {
        return temporaryMapper.delete(id);
    }

    public int batchDelete(List<Integer> ids) {
        return temporaryMapper.batchDelete(ids);
    }
}
