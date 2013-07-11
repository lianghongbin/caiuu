package com.caiuu.core.service;

import com.caiuu.core.dao.DetailMapper;
import com.caiuu.core.entity.Detail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午10:29
 * Description:
 */
@Service
@Transactional
public class DetailService {

    @Autowired
    private DetailMapper detailMapper;

    public int save(Detail detail) {
        return detailMapper.insert(detail);
    }

    public int update(Detail detail) {
        return detailMapper.update(detail);
    }

    public int delete(int id) {
        return detailMapper.delete(id);
    }

    public Detail find(int id) {
        return detailMapper.select(id);
    }

    public List<Detail> findAll() {
        return detailMapper.selectAll();
    }
}
