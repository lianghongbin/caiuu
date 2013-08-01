package com.meishihome.core.dao;

import com.meishihome.core.entity.Feedback;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackMapper {

    public int count();

    public int deleteById(int id);

    public List<Feedback> selectAll();

    public int insert(Feedback feedback);
}