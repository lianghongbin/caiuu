package com.caiuu.photo;


import com.caiuu.photo.exception.WatermarkException;
import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

/**
 * User: lianghongbin
 * Date: 12-7-20
 * Time: 下午3:04
 * Function:
 */
public class CallableWorker implements Callable<byte[]> {

    private final static Logger logger = LoggerFactory.getLogger(CallableWorker.class);
    private final Operation operation;
    private AbstractExecutorFactory executorFactory;

    public CallableWorker(Operation operation, AbstractExecutorFactory executorFactory) {
        this.operation = operation;
        this.executorFactory = executorFactory;
    }


    @Override
    public byte[] call() throws Exception {
        logger.warn("Current thread count is : " + DefaultProcessorImpl.getThreadCount());

        //先做图片缩放
        if (operation.isCompress()) {
            Thumbnail thumbnail = executorFactory.createScaling();
            try {
                thumbnail.execute(operation);
            } catch (Exception e) {
                logger.error("thumbnail failed！", e);
                return new byte[0];
            }
        }

        //再做打水印

        Watermarking watermarking;
        for (Watermark watermark : operation.getWatermarks()) {
            WatermarkType type = watermark.getType();
            if (type == WatermarkType.ICON) {
                watermarking = executorFactory.createPictureWatermarking();
            } else {
                watermarking = executorFactory.createTextWatermarking();
            }

            try {
                if (watermarking != null) {
                    watermarking.execute(operation, watermark);
                }
            } catch (WatermarkException e) {
                logger.error("watermark image failed！", e);
            }
        }


        Thumbnails.Builder builder = (Thumbnails.Builder) operation.getSource();
        builder.toFile(operation.getTarget());

        return new byte[0];
    }
}
