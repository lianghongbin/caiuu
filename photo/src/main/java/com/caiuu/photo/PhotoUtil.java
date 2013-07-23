package com.caiuu.photo;

import com.caiuu.photo.thumbnailator.ThumbnailatExecutorFactory;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * User: Administrator
 * Date: 13-7-15
 * Time: 下午10:22
 * Description:
 */
public class PhotoUtil {

    public static Map<String, Integer> getInfo(String filePath) {
        Map<String, Integer> map = new HashMap<String, Integer>(3);
        File imgFile = new File(filePath);
        try {
            BufferedImage buff = ImageIO.read(imgFile);
            map.put("width", buff.getWidth());
            map.put("height", buff.getHeight());

        } catch (FileNotFoundException e) {
            System.err.println("所给的图片文件" + imgFile.getPath() + "不存在！计算图片尺寸大小信息失败！");
            map = null;
        } catch (IOException e) {
            System.err.println("计算图片" + imgFile.getPath() + "尺寸大小信息失败！");
            map = null;
        }

        return map;
    }

    public static String getFormat(Object o) {
        try {

            ImageInputStream iis = ImageIO.createImageInputStream(o);
            Iterator iterator = ImageIO.getImageReaders(iis);
            if (!iterator.hasNext()) {
                return null;
            }
            ImageReader reader = (ImageReader) iterator.next();
            iis.close();
            return reader.getFormatName();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void thumbnail(String source, String target, String watermarkFile, Size size) {
        DefaultProcessorImpl processor = new DefaultProcessorImpl();
        Operation operation = new Operation();
        operation.setFile(source);
        operation.setTarget(target);
        Watermark watermark = new Watermark();
        watermark.setType(WatermarkType.ICON);
        watermark.setResource(watermarkFile);
        List<Watermark> watermarks = new ArrayList<Watermark>();
        watermarks.add(watermark);

        operation.setSize(size);
        operation.setWatermarks(watermarks);

        processor.setExecutorFactory(new ThumbnailatExecutorFactory());
        processor.process(operation);
    }
}
