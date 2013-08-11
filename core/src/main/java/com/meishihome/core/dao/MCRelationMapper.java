package com.meishihome.core.dao;

import com.meishihome.core.entity.CMRelation;
import com.meishihome.core.entity.MCRelation;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User: Administrator
 * Date: 13-8-11
 * Time: 下午10:30
 * Description:Material-Cookbook关联表数据处理类
 */
@Repository
public interface MCRelationMapper {

    public int insert(MCRelation relation);

    public int batchInsert(List<MCRelation> relations);

    public int deleteById(int id);

    public int delete(MCRelation relation);

    public int batchDelete(List<Integer> ids);

    public List<MCRelation> selectByMaterial(int materialId, RowBounds rowBounds);

    public List<MCRelation> selectByCookbook(int cookbookId, RowBounds rowBounds);
}
