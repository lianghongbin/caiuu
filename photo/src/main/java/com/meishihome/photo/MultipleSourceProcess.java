package com.meishihome.photo;


import com.meishihome.photo.exception.ThumbnailException;

/**
 * User: lubh
 * Date: 12-8-28
 * Time: 下午12:54
 * Interface:图片处理接口类
 */
public interface MultipleSourceProcess {

    /**
     * 图片处理操作接口
     *
     * @param operation 操作数据
     *
     */
    public void process(Operation operation, boolean usingGM) throws ThumbnailException;
}
