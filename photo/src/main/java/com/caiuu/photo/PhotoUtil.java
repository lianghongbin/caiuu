package com.caiuu.photo;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * User: Administrator
 * Date: 13-7-15
 * Time: 下午10:22
 * Description:
 */
public class PhotoUtil {

    public static Map<String, Long> getInfo(String filePath) {
        Map<String, Long> map = new HashMap<String, Long>(3);
        File imgFile = new File(filePath);
        try {
            BufferedImage buff = ImageIO.read(imgFile);
            map.put("width", buff.getWidth() * 1L);
            map.put("height", buff.getHeight() * 1L);

        } catch (FileNotFoundException e) {
            System.err.println("所给的图片文件" + imgFile.getPath() + "不存在！计算图片尺寸大小信息失败！");
            map = null;
        } catch (IOException e) {
            System.err.println("计算图片" + imgFile.getPath() + "尺寸大小信息失败！");
            map = null;
        }

        return map;
    }

    private static String getFormat(Object o) {
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
}