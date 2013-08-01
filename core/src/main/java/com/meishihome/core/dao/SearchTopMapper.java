package com.meishihome.core.dao;

import com.meishihome.core.entity.SearchTop;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-7-8
 * Time: 下午9:25
 * Description:
 */
@Repository
public interface SearchTopMapper {

    public List<SearchTop> selectTop();
}
