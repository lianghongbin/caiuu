package com.caiuu.photo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 * 图片转换类
 */
public class ImageConvert {

    private static final Logger logger = LoggerFactory.getLogger(ImageConvert.class);


    /**
     * convertToBytes
     * @param srcImage BufferedImage
     * @param formatName 目标格式
     * @return 返回字节数组
     */
    public static byte[] convertToBytes(BufferedImage srcImage, String formatName){
        long begin = System.currentTimeMillis();
        if (srcImage == null) {
            return null;
        }

        long end = System.currentTimeMillis();
        if (logger.isInfoEnabled()) {
            logger.info("Processor->convertBufferedImage2BytesWithQuality() execute Cost: " + (end - begin) + "ms");
        }
        Iterator<ImageWriter> iter = ImageIO.getImageWritersByFormatName(formatName);// 得到迭代器
        ImageWriter writer = iter.next(); // 得到writer
        ImageWriteParam iwp = writer.getDefaultWriteParam();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 取得内存输出流
        IIOImage iIamge = new IIOImage(srcImage, null, null);
        try {
            writer.setOutput(ImageIO
                    .createImageOutputStream(byteArrayOutputStream));
            writer.write(null, iIamge, iwp);
        } catch (IOException e) {
            logger.error("process image quality has error.", e);
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /**
     * 将BufferedImage对象按照一定的质量数转换到字节数组
     *
     * @param srcImage   BufferedImage对象
     * @param quality    质量数, 在0.0到1.0之间
     * @param formatName 指定格式的Writer
     * @return 返回BufferedImage对应的字节数组
     */
    public static byte[] convertToBytes(BufferedImage srcImage, float quality, String formatName) {
        long begin = System.currentTimeMillis();

        // 如果图片空，返回空
        if (srcImage == null) {
            return null;
        }
        // 得到指定Format图片的writer
        Iterator<ImageWriter> iter = ImageIO.getImageWritersByFormatName(formatName);// 得到迭代器
        ImageWriter writer = iter.next(); // 得到writer

        // 得到指定writer的输出参数设置(ImageWriteParam )
        ImageWriteParam iwp = writer.getDefaultWriteParam();
        iwp.setCompressionMode(ImageWriteParam.MODE_EXPLICIT); // 设置可否压缩
        iwp.setCompressionQuality(quality); // 设置压缩质量参数
        iwp.setProgressiveMode(ImageWriteParam.MODE_DISABLED);

        ColorModel colorModel = ColorModel.getRGBdefault();
        // 指定压缩时使用的色彩模式
        iwp.setDestinationType(new ImageTypeSpecifier(colorModel,
                colorModel.createCompatibleSampleModel(16, 16)));

        // 开始打包图片，写入byte[]
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 取得内存输出流
        IIOImage iIamge = new IIOImage(srcImage, null, null);
        try {
            // 此处因为ImageWriter中用来接收write信息的output要求必须是ImageOutput
            // 通过ImageIo中的静态方法，得到byteArrayOutputStream的ImageOutput
            writer.setOutput(ImageIO
                    .createImageOutputStream(byteArrayOutputStream));
            writer.write(null, iIamge, iwp);
        } catch (IOException e) {
            logger.error("process image quality has error.", e);
            return null;
        }
        long end = System.currentTimeMillis();
        if (logger.isInfoEnabled()) {
            logger.info("Processor->convertBufferedImage2BytesWithQuality() execute Cost: " + (end - begin) + "ms");
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] convert2Bytes(BufferedImage srcImage, float quality, String formatName) throws Exception{
        Iterator<ImageWriter> writers =
                ImageIO.getImageWritersByFormatName(formatName);
        if (!writers.hasNext())
        {
            throw new Exception("No suitable ImageWriter found for " + formatName + ".");
        }
        ImageWriter writer = writers.next();
        ImageWriteParam writeParam = writer.getDefaultWriteParam();
        if(writeParam.canWriteCompressed()){
            writeParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            if(writeParam.getCompressionType() != null){
                logger.info("compressionType=" + writeParam.getCompressionType());
                writeParam.setCompressionType(writeParam.getCompressionType());
            }
            if (!Float.isNaN(quality))
            {
                writeParam.setCompressionQuality(quality);
            }
        }

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageOutputStream ios = ImageIO.createImageOutputStream(byteArrayOutputStream);
        if (ios == null)
        {
            throw new IOException("Could not open OutputStream.");
        }
        if (
                formatName.equalsIgnoreCase("jpg")
                        || formatName.equalsIgnoreCase("jpeg")
                        || formatName.equalsIgnoreCase("bmp")
                )
        {
            srcImage = copy(srcImage, BufferedImage.TYPE_INT_BGR);
        }

        writer.setOutput(ios);
        writer.write(null, new IIOImage(srcImage, null, null), writeParam);
        ios.close();

        return byteArrayOutputStream.toByteArray();
    }

    private static BufferedImage copy(BufferedImage img, int imageType){
        int width = img.getWidth();
        int height = img.getHeight();

        BufferedImage newImage = new BufferedImage(width, height, imageType);
        Graphics g = newImage.createGraphics();

        g.drawImage(img, 0, 0, null);

        g.dispose();

        return newImage;
    }
}