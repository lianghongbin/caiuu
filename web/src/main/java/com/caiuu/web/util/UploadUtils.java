package com.caiuu.web.util;

import com.caiuu.photo.PhotoUtil;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;

/**
 * User: Administrator
 * Date: 13-7-9
 * Time: 下午8:36
 * Description:
 */
public class UploadUtils {

    public static String generateDir() {
        StringBuilder builder = new StringBuilder(5);
        builder.append("Y").append(File.separator).append("MM").append(File.separator).append("dd");
        SimpleDateFormat format = new SimpleDateFormat(builder.toString());
        return format.format(new Date());
    }

    public static String generateName() {
        long time = new Date().getTime();
        String hexTime = Long.toHexString(time);
        Random random = new Random();
        String hexRandom = Long.toHexString(random.nextInt(10000));
        return hexTime + hexRandom;
    }
}
