package com.caiuu.photo;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * User: lianghongbin
 * Date: 6/5/12
 * Time: 10:57 AM
 * Description:
 */
public class Watermark implements Serializable, Cloneable {

    private WatermarkType type;
    private String resource;
    private Position position;
    private String gravity;
    private String font;
    private int pointSize;
    private String fill;
    private String fontWeight;
    private int drawX ;
    private int drawY ;
    private String geometry ;
    private int dissolve ;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @XmlElement()
    public String getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    @XmlElement()
    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    @XmlElement()
    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    @XmlElement()
    public int getPointSize() {
        return pointSize;
    }

    public void setPointSize(int pointSize) {
        this.pointSize = pointSize;
    }

    @XmlElement()
    public String getFill() {
        return fill;
    }

    public void setFill(String fill) {
        this.fill = fill;
    }

    @XmlElement()
    public int getDrawX() {
        return drawX;
    }

    public void setDrawX(int drawX) {
        this.drawX = drawX;
    }

    @XmlElement()
    public int getDrawY() {
        return drawY;
    }

    public void setDrawY(int drawY) {
        this.drawY = drawY;
    }

    @XmlElement()
    public String getGeometry() {
        return geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }

    @XmlElement()
    public int getDissolve() {
        return dissolve;
    }

    public void setDissolve(int dissolve) {
        this.dissolve = dissolve;
    }

    @XmlAttribute
    public WatermarkType getType() {
        return type;
    }

    public void setType(WatermarkType type) {
        this.type = type;
    }

    @XmlElement()
    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @XmlElement()
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
