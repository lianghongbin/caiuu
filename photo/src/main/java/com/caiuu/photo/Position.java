package com.caiuu.photo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User: lianghongbin
 * Date: 6/5/12
 * Time: 11:00 AM
 * Description:
 */
public class Position implements Serializable, Cloneable {

    private BigDecimal top;
    private BigDecimal left;
    private BigDecimal right;
    private BigDecimal bottom;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setTop(BigDecimal top) {
        this.top = top;
    }

    public void setLeft(BigDecimal left) {
        this.left = left;
    }

    public void setRight(BigDecimal right) {
        this.right = right;
    }

    public void setBottom(BigDecimal bottom) {
        this.bottom = bottom;
    }

    public BigDecimal getTop() {
        return top;
    }

    public BigDecimal getLeft() {
        return left;
    }

    public BigDecimal getRight() {
        return right;
    }

    public BigDecimal getBottom() {
        return bottom;
    }
}
