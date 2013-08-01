package com.meishihome.photo;

/**
 * User: lianghongbin
 * Date: 12-6-28
 * Time: 下午3:39
 * Function: 图片处理的抽象类
 */
public abstract class AbstractExecutorFactory {

    /**
     * 生成文字水印处理类
     *
     * @return 文字水印处理类
     */
    public abstract Watermarking createTextWatermarking();

    /**
     * 生成图片水印处理类
     *
     * @return 图片水印处理类
     */
    public abstract Watermarking createPictureWatermarking();

    /**
     * 生成图片缩放处理类
     *
     * @return 图片缩放处理类
     */
    public abstract Thumbnail createScaling();
}
