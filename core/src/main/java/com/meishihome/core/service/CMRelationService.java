package com.meishihome.core.service;

import com.meishihome.core.dao.CMRelationMapper;
import com.meishihome.core.entity.CMRelation;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-8-11
 * Time: 下午10:38
 * Description:Crowd-Material关联服务类
 */
@Service
@Transactional
public class CMRelationService {

    @Autowired
    private CMRelationMapper relationMapper;

    public int save(CMRelation relation) {
        return relationMapper.insert(relation);
    }

    public int batchSave(List<CMRelation> relations) {
        return relationMapper.batchInsert(relations);
    }

    public int deleteById(int id) {
        return relationMapper.deleteById(id);
    }

    public int delete(CMRelation relation) {
        return relationMapper.delete(relation);
    }

    public int batchDelete(List<Integer> ids) {
        return relationMapper.batchDelete(ids);
    }

    public List<CMRelation> findByCrowd(int crowdId, RowBounds rowBounds) {
        return relationMapper.selectByCrowd(crowdId, rowBounds);
    }

    public List<CMRelation> findByMaterial(int materialId, RowBounds rowBounds) {
        return relationMapper.selectByMaterial(materialId, rowBounds);
    }
}
