package com.meishihome.core.dao;

import com.meishihome.core.entity.CMRelation;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-8-11
 * Time: 下午10:30
 * Description:Crowd-Material关联表数据处理类
 */
@Repository
public interface CMRelationMapper {

    public int insert(CMRelation relation);

    public int batchInsert(List<CMRelation> relations);

    public int deleteById(int id);

    public int delete(CMRelation relation);

    public int batchDelete(List<Integer> ids);

    public List<CMRelation> selectByCrowd(int crowdId, RowBounds rowBounds);

    public List<CMRelation> selectByMaterial(int materialId, RowBounds rowBounds);
}
