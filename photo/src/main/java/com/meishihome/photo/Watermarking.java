package com.meishihome.photo;


import com.meishihome.photo.exception.WatermarkException;

import java.io.IOException;

/**
 * User: lianghongbin
 * Date: 12-6-28
 * Time: 上午11:04
 * Function: 打水印接口类
 */
public interface Watermarking {

    /**
     * 打水印业务接口
     * @param operation 操作数据
     * @param watermark 水印数据
     * @throws WatermarkException
     */
    public void execute(Operation operation, Watermark watermark) throws WatermarkException, IOException;
}
