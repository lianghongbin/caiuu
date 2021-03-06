package com.meishihome.core.service;

import com.meishihome.core.dao.ImageMapper;
import com.meishihome.core.entity.Image;
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

    public Image find(int id) {
        return imageMapper.select(id);
    }
}
