package com.meishihome.photo;


import com.meishihome.photo.exception.ThumbnailException;

import java.io.IOException;

/**
 * User: lianghongbin
 * Date: 12-6-28
 * Time: 下午12:48
 * Function: 等比例缩放接口类
 */
public interface Thumbnail {

    /**
     * 缩放操作接口
     * @param operation 操作相关信息
     * @throws ThumbnailException
     */
    public void execute(Operation operation) throws ThumbnailException, IOException;
}
