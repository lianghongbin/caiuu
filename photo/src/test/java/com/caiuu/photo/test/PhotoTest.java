package com.caiuu.photo.test;

import com.caiuu.photo.*;
import com.caiuu.photo.thumbnailator.ThumbnailatExecutorFactory;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * User: lianghongbin
 * Date: 7/15/13
 * Time: 15:00
 * Description:
 */
public class PhotoTest {

    @Test
    public void testProcessor() {
        DefaultProcessorImpl processor = new DefaultProcessorImpl();
        Operation operation = new Operation();
        operation.setFile("/Users/lianghongbin/Pictures/7694727298.jpg");
        operation.setTarget("/Users/lianghongbin/Pictures/test.jpg");
        Watermark watermark = new Watermark();
        watermark.setType(WatermarkType.ICON);
        watermark.setResource("/Users/lianghongbin/Pictures/watermark.jpg");
        List<Watermark> watermarks = new ArrayList<Watermark>();
        watermarks.add(watermark);

        Size size = new Size(800, 900);
        operation.setSize(size);
        operation.setWatermarks(watermarks);

        processor.setExecutorFactory(new ThumbnailatExecutorFactory());
        processor.process(operation);

        Assert.assertTrue(true);
    }
}
