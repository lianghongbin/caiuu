package com.meishihome.core.entity;

import java.io.Serializable;
import java.util.Date;

public class Detail implements Serializable {

    private int cookbookId;
    private String material;
    private String blending;
    private String fixing;
    private String fire;
    private String okren;
    private String noren;
    private String pkey;
    private String ckey;
    private String pic;
    private String info;
    private int status;
    private int good;
    private int bad;
    private int hit;
    private int hitLast;
    private Date publishTime;
    private Date lastTime;

    public int getCookbookId() {
        return cookbookId;
    }

    public void setCookbookId(int cookbookId) {
        this.cookbookId = cookbookId;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBlending() {
        return blending;
    }

    public void setBlending(String blending) {
        this.blending = blending;
    }

    public String getFixing() {
        return fixing;
    }

    public void setFixing(String fixing) {
        this.fixing = fixing;
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire;
    }

    public String getOkren() {
        return okren;
    }

    public void setOkren(String okren) {
        this.okren = okren;
    }

    public String getNoren() {
        return noren;
    }

    public void setNoren(String noren) {
        this.noren = noren;
    }

    public String getPkey() {
        return pkey;
    }

    public void setPkey(String pkey) {
        this.pkey = pkey;
    }

    public String getCkey() {
        return ckey;
    }

    public void setCkey(String ckey) {
        this.ckey = ckey;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getGood() {
        return good;
    }

    public void setGood(int good) {
        this.good = good;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getHitLast() {
        return hitLast;
    }

    public void setHitLast(int hitLast) {
        this.hitLast = hitLast;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}