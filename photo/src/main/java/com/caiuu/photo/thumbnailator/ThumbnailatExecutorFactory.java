package com.caiuu.photo.thumbnailator;


import com.caiuu.photo.AbstractExecutorFactory;
import com.caiuu.photo.Thumbnail;
import com.caiuu.photo.Watermarking;

/**
 * User: Lingyun
 * Date: 12-7-17
 * Time: 上午11:12
 */
public class ThumbnailatExecutorFactory extends AbstractExecutorFactory {

    /**
     * 生成文字水印处理类
     *
     * @return 文字水印处理类
     */
    @Override
    public Watermarking createTextWatermarking() {
        return new TextWatermarking();
    }

    /**
     * 生成图片水印处理类
     *
     * @return 图片水印处理类
     */
    @Override
    public Watermarking createPictureWatermarking() {
        return new PictureWatermarking();
    }

    /**
     * 生成图片缩放处理类
     *
     * @return 图片缩放处理类
     */
    @Override
    public Thumbnail createScaling() {
        return new Thumbnailator();
    }
}
