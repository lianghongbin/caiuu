package com.meishihome.core.service;

import com.meishihome.core.dao.CookbookMapper;
import com.meishihome.core.entity.Cookbook;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-11
 * Time: 下午10:27
 * Description:
 */
@Service
@Transactional
public class CookbookService {

    @Autowired
    private CookbookMapper cookbookMapper;

    public int findCount() {
        return cookbookMapper.count();
    }

    public int save(Cookbook cookbook) {
        return cookbookMapper.insert(cookbook);
    }

    public int update(Cookbook cookbook) {
        return cookbookMapper.update(cookbook);
    }

    public int delete(int id) {
        return cookbookMapper.delete(id);
    }

    public Cookbook find(int id) {
        return cookbookMapper.select(id);
    }

    public List<Cookbook> findAll(RowBounds rowBounds) {
        return cookbookMapper.selectAll(rowBounds);
    }

    public List<Cookbook> findByCrowd(int crowdId, RowBounds rowBounds) {
        return cookbookMapper.selectByCrowd(crowdId, rowBounds);
    }

    /**
     * 精选菜谱
     * @param rowBounds 分页参数
     * @return 菜谱列表
     */
    public List<Cookbook> findBetter(RowBounds rowBounds) {
        return cookbookMapper.selectBetter(rowBounds);
    }

    /**
     * 热门菜谱
     * @param rowBounds 分页参数
     * @return 菜谱列表
     */
    public List<Cookbook> findHotter(RowBounds rowBounds) {
        return cookbookMapper.selectHotter(rowBounds);
    }
}
