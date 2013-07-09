package com.caiuu.core.service;

import com.caiuu.core.dao.ImageMapper;
import com.caiuu.core.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Administrator
 * Date: 13-7-9
 * Time: 下午10:04
 * Description:
 */
@Service
@Transactional
public class ImageService {

    @Autowired
    private ImageMapper imageMapper;

    public int save(Image image) {
        return imageMapper.insert(image);
    }

    public Image get(int id) {
        return imageMapper.select(id);
    }
}
