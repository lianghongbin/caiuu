package com.meishihome.core.service;

import com.meishihome.core.dao.CrowdMapper;
import com.meishihome.core.entity.Crowd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: lianghongbin
 * Date: 7/9/13
 * Time: 14:34
 * Description:
 */
@Service
@Transactional
public class CrowdService {

    @Autowired
    private CrowdMapper crowdMapper;

    public Crowd find(int id) {
        return crowdMapper.select(id);
    }

    public int save(Crowd crowd) {
        return crowdMapper.insert(crowd);
    }

    public int update(Crowd crowd) {
        return crowdMapper.update(crowd);
    }

    public int deleteById(int id) {
        return crowdMapper.deleteById(id);
    }

    public List<Crowd> findAll() {
        return crowdMapper.selectAll();
    }
}
