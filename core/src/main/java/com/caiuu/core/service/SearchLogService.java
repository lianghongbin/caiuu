package com.caiuu.core.service;

import com.caiuu.core.dao.SearchLogMapper;
import com.caiuu.core.entity.SearchLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-8
 * Time: 下午9:28
 * Description:
 */
@Service
@Transactional(readOnly = true)
public class SearchLogService {

    @Autowired
    private SearchLogMapper searchLogMapper;

    public List<SearchLog> findAll() {
        return searchLogMapper.selectAll();
    }

    public List<SearchLog> findTop() {
        return searchLogMapper.selectTop();
    }
}
