package com.caiuu.core.service;

import com.caiuu.core.dao.FocusMapper;
import com.caiuu.core.entity.Focus;
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
public class FocusService {

    @Autowired
    private FocusMapper focusMapper;

    public List<Focus> findAll() {
        return focusMapper.selectAll();
    }

    public int save(Focus focus) {
        return focusMapper.insert(focus);
    }

    public int update(Focus focus) {
        return focusMapper.update(focus);
    }

    public int deleteById(int id) {
        return focusMapper.deleteById(id);
    }
}
