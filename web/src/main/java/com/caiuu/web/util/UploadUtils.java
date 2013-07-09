package com.caiuu.web.util;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: Administrator
 * Date: 13-7-9
 * Time: 下午8:36
 * Description:
 */
public class UploadUtils {

    private static String imageRoot = "e:/upload";

    public static String upload(String name, InputStream inputStream) throws IOException, FileNotFoundException{

        String ext = StringUtils.substringAfterLast(name, ".");
        String pureName = Long.toString(new Date().getTime());
        String dir = new SimpleDateFormat("Y-m-d").toString();
        String fileName = imageRoot + File.separator + dir + File.separator + pureName + File.separator + ext;
        OutputStream outputStream = new FileOutputStream(fileName);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) >0) {
            outputStream.write(buffer);
        }

        return fileName;
    }
}
