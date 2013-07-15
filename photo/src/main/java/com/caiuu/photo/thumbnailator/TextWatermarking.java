package com.caiuu.photo.thumbnailator;


import com.caiuu.photo.Operation;
import com.caiuu.photo.Watermark;
import com.caiuu.photo.Watermarking;
import com.caiuu.photo.exception.WatermarkException;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * User: lianghongbin
 * Date: 13-7-15
 * Time: 上午11:15
 */
public class TextWatermarking implements Watermarking {

    private static final Logger logger = LoggerFactory.getLogger(TextWatermarking.class);

    public void execute(Operation operation, Watermark watermark) throws WatermarkException, IOException {
        long beginTime = System.currentTimeMillis();
        logger.debug("print picture watermark start!");

        Thumbnails.Builder builder = (Thumbnails.Builder) operation.getSource();

        Thumbnails.Builder watermarkBuilder = builder.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(watermark.getResource())), 0.5f);
        operation.setSource(watermarkBuilder);

        logger.debug("print picture watermark time:" + (System.currentTimeMillis() - beginTime) + " ms.");
    }
}
