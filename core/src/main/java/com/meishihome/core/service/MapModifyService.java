package com.meishihome.core.service;

import com.meishihome.core.dao.MapModifyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: lianghongbin
 * Date: 7/21/13
 * Time: 21:50
 * Description:
 */
@Service
@Transactional
public class MapModifyService {

    @Autowired
    private MapModifyMapper mapModifyMapper;

    public int findCountByType(String type) {
        return mapModifyMapper.selectCountByType(type);
    }

    public int updateByType(String type) {
        return mapModifyMapper.updateByType(type);
    }

    public int save(String type) {
        return mapModifyMapper.insert(type);
    }
}
