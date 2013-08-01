package com.meishihome.core.dao;

import org.springframework.stereotype.Repository;

/**
 * User: lianghongbin
 * Date: 7/21/13
 * Time: 21:42
 * Description:
 */
@Repository
public interface MapModifyMapper {

    public int selectCountByType(String type);

    public int updateByType(String type);

    public int insert(String type);
}
