package com.meishihome.photo.thumbnailator;


import com.meishihome.photo.Operation;
import com.meishihome.photo.Thumbnail;
import com.meishihome.photo.exception.ThumbnailException;
import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * User: lianghongbin
 * Date: 13-7-15
 * Time: 上午11:17
 */
public class Thumbnailator implements Thumbnail {

    private static final Logger logger = LoggerFactory.getLogger(Thumbnailator.class);

    /**
     * 缩放操作接口
     *
     * @param operation 操作相关信息
     */
    @Override
    public void execute(Operation operation) throws ThumbnailException, IOException {
        long beginTime = System.currentTimeMillis();
        logger.info("thumbnail image beginning ......");

        Thumbnails.Builder builder =
                Thumbnails.of(operation.getFile())
                        .size(operation.getSize().getWidth(), operation.getSize().getHeight());
        operation.setSource(builder);

        logger.info("thumbnail image spend time:" + (System.currentTimeMillis() - beginTime) + "ms.");
    }
}
