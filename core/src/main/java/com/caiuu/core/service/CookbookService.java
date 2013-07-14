package com.caiuu.core.service;

import com.caiuu.core.dao.CookbookMapper;
import com.caiuu.core.entity.Cookbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午10:27
 * Description:
 */
@Service
@Transactional
public class CookbookService {

    @Autowired
    private CookbookMapper cookbookMapper;

    public int count() {
        return cookbookMapper.count();
    }

    public int save(Cookbook cookbook) {
        return cookbookMapper.insert(cookbook);
    }

    public int update(Cookbook cookbook) {
        return cookbookMapper.update(cookbook);
    }

    public int delete(int id) {
        return cookbookMapper.delete(id);
    }

    public Cookbook find(int id) {
        return cookbookMapper.select(id);
    }

    public List<Cookbook> findAll() {
        return cookbookMapper.selectAll();
    }
}
