package com.meishihome.core.service;

import com.meishihome.core.dao.MCRelationMapper;
import com.meishihome.core.entity.CMRelation;
import com.meishihome.core.entity.MCRelation;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-8-11
 * Time: 下午10:38
 * Description:Material-Cookbook关联服务类
 */
@Service
@Transactional
public class MCRelationService {

    @Autowired
    private MCRelationMapper relationMapper;

    public int save(MCRelation relation) {
        return relationMapper.insert(relation);
    }

    public int batchSave(List<MCRelation> relations) {
        return relationMapper.batchInsert(relations);
    }

    public int deleteById(int id) {
        return relationMapper.deleteById(id);
    }

    public int delete(MCRelation relation) {
        return relationMapper.delete(relation);
    }

    public int batchDelete(List<Integer> ids) {
        return relationMapper.batchDelete(ids);
    }

    public List<MCRelation> findByMaterial(int materialId, RowBounds rowBounds) {
        return relationMapper.selectByMaterial(materialId, rowBounds);
    }

    public List<MCRelation> findByCookbook(int crowdId, RowBounds rowBounds) {
        return relationMapper.selectByCookbook(crowdId, rowBounds);
    }
}
