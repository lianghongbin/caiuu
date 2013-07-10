package com.caiuu.core.service;

import com.caiuu.core.dao.StaticBlockMapper;
import com.caiuu.core.entity.StaticBlock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-10
 * Time: 下午10:58
 * Description:
 */
@Service
@Transactional
public class StaticBlockService {

    @Autowired
    private StaticBlockMapper staticBlockMapper;

    public int save(StaticBlock staticBlock) {
        return staticBlockMapper.insert(staticBlock);
    }

    public int update(StaticBlock staticBlock) {
        return staticBlockMapper.update(staticBlock);
    }

    public List<StaticBlock> findAll() {
        return staticBlockMapper.selectAll();
    }
}
