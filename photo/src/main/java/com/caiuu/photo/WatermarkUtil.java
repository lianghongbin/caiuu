package com.caiuu.photo;

import java.awt.*;

/**
 * User: lingyun
 * Date: 12-7-29
 * Time: 上午00:19
 * Function: 水印工具类
 */
public class WatermarkUtil {
    private static String BOLD = "BOLD";
    private static final String ITALIC = "ITALIC";
    private static final String PLAIN = "PLAIN";

    private static final String RED = "RED";
    private static final String WHITE = "WHITE";
    private static final String BLACK = "BLACK";

    public static Color mapFontColor(String fontColor){
        fontColor = fontColor.toUpperCase();
        if(fontColor.equals(RED)){
            return Color.RED;
        }else if(fontColor.equals(WHITE)){
            return Color.WHITE;
        }else if(fontColor.equals(BLACK)){
            return Color.BLACK;
        }else{
            return Color.WHITE;
        }
    }

    public static Font getFont(Watermark watermark){
        String fontWeight = watermark.getFontWeight().toUpperCase();
        if(fontWeight.equals(BOLD)){
            return new Font(watermark.getFont(), Font.BOLD, watermark.getPointSize());
        }else if(fontWeight.equals(ITALIC)){
            return new Font(watermark.getFont(), Font.ITALIC, watermark.getPointSize());
        }else if(fontWeight.equals(PLAIN)){
            return new Font(watermark.getFont(), Font.PLAIN, watermark.getPointSize());
        }else{
            return new Font(watermark.getFont(), Font.PLAIN, watermark.getPointSize());
        }
    }
}
