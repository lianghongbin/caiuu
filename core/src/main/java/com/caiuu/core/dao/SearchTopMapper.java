package com.caiuu.core.dao;

import com.caiuu.core.entity.SearchTop;
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
