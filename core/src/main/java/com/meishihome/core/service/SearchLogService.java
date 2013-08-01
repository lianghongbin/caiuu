package com.meishihome.core.service;

import com.meishihome.core.dao.SearchLogMapper;
import com.meishihome.core.entity.SearchLog;
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
@Transactional
public class SearchLogService {

    @Autowired
    private SearchLogMapper searchLogMapper;

    public List<SearchLog> findAll() {
        return searchLogMapper.selectAll();
    }
}
