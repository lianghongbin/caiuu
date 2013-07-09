package com.caiuu.core.dao;

import com.caiuu.core.entity.Image;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageMapper {

    public int insert(Image image);

    public Image select(int id);
}