package com.caiuu.web.util;

/**
 * User: Administrator
 * Date: 13-7-15
 * Time: 下午10:35
 * Description:
 */
public class PhotoConfig {

    private String uploadRoot;
    private String watermark;

    public String getUploadRoot() {
        return uploadRoot;
    }

    public void setUploadRoot(String uploadRoot) {
        this.uploadRoot = uploadRoot;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }
}
