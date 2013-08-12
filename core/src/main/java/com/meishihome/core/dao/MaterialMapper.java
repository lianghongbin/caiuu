package com.meishihome.core.dao;

import com.meishihome.core.entity.Material;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialMapper {

    public int count();

    public int insert(Material material);

    public int update(Material material);

    public int delete(int id);

    public Material select(int id);

    public List<Material> selectAll(RowBounds rowBounds);

    /**
     * 根据季节取当季食材
     * @param season 季节
     * @return 食材列表
     */
    public List<Material> selectBySeason(int season);

    /**
     * 根据人员先食材
     * @param crowdId 人群ID
     * @param rowBounds 分页
     * @return 食材列表
     */
    public List<Material> selectByCrowd(int crowdId, RowBounds rowBounds);
}