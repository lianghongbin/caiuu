package com.caiuu.core.entity;

import java.io.Serializable;

/**
 * User: lianghongbin
 * Date: 7/9/13
 * Time: 9:13
 * Description:
 */
public class SearchTop implements Serializable {

    private String key;
    private int hit;
    private int result;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
