package com.caiuu.core.service;

import com.caiuu.core.dao.FeedbackMapper;
import com.caiuu.core.entity.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: lianghongbin
 * Date: 7/4/13
 * Time: 14:22
 * Description:
 */
@Service
@Transactional
public class FeedbackService {

    @Autowired
    private FeedbackMapper feedbackMapper;

    public int getCount() {
        return feedbackMapper.count();
    }

    public int deleteById(int id) {
        return feedbackMapper.deleteById(id);
    }

    public int add(Feedback feedback) {
        return feedbackMapper.insert(feedback);
    }

    public List<Feedback> findAll() {
        return feedbackMapper.selectAll();
    }
}
