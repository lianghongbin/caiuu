package com.caiuu.core.entity;

import java.util.Date;

public class Detail {
    private Integer caipuid;

    private String material;

    private String blending;

    private String fixing;

    private String fire;

    private String okren;

    private String noren;

    private String pkey;

    private String ckey;

    private String pic;

    private Integer status;

    private Integer good;

    private Integer bad;

    private Integer hit;

    private Integer hitlastweek;

    private Date pubdate;

    private Date edate;

    private String info;

    public Integer getCaipuid() {
        return caipuid;
    }

    public void setCaipuid(Integer caipuid) {
        this.caipuid = caipuid;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getBlending() {
        return blending;
    }

    public void setBlending(String blending) {
        this.blending = blending == null ? null : blending.trim();
    }

    public String getFixing() {
        return fixing;
    }

    public void setFixing(String fixing) {
        this.fixing = fixing == null ? null : fixing.trim();
    }

    public String getFire() {
        return fire;
    }

    public void setFire(String fire) {
        this.fire = fire == null ? null : fire.trim();
    }

    public String getOkren() {
        return okren;
    }

    public void setOkren(String okren) {
        this.okren = okren == null ? null : okren.trim();
    }

    public String getNoren() {
        return noren;
    }

    public void setNoren(String noren) {
        this.noren = noren == null ? null : noren.trim();
    }

    public String getPkey() {
        return pkey;
    }

    public void setPkey(String pkey) {
        this.pkey = pkey == null ? null : pkey.trim();
    }

    public String getCkey() {
        return ckey;
    }

    public void setCkey(String ckey) {
        this.ckey = ckey == null ? null : ckey.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getGood() {
        return good;
    }

    public void setGood(Integer good) {
        this.good = good;
    }

    public Integer getBad() {
        return bad;
    }

    public void setBad(Integer bad) {
        this.bad = bad;
    }

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }

    public Integer getHitlastweek() {
        return hitlastweek;
    }

    public void setHitlastweek(Integer hitlastweek) {
        this.hitlastweek = hitlastweek;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}