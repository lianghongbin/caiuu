package com.meishihome.core.service;

import com.meishihome.core.dao.SearchTopMapper;
import com.meishihome.core.entity.SearchTop;
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
public class SearchTopService {

    @Autowired
    private SearchTopMapper searchTopMapper;

    public List<SearchTop> findTop() {
        return searchTopMapper.selectTop();
    }
}
