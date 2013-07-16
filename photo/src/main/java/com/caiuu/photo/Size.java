package com.caiuu.photo;

import java.io.Serializable;

/**
 * User: lianghongbin
 * Date: 6/5/12
 * Time: 11:29 AM
 * Description:
 */
public class Size implements Serializable, Cloneable {

    private final int width;
    private final int height;
    private boolean hasSuffix;

    public Size(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isHasSuffix() {
        return hasSuffix;
    }

    public void setHasSuffix(boolean hasSuffix) {
        this.hasSuffix = hasSuffix;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Size target = (Size) obj;
        return (this.getWidth() == target.getWidth() && this.getHeight() == target.getHeight()
                && this.isHasSuffix() == target.isHasSuffix());
    }

    @Override
    public int hashCode() {
        if (this.width != 0 && this.height != 0) {
            return this.getWidth() * this.getHeight();
        } else {
            if (this.width != 0) {
                return this.width;
            } else if (this.height != 0) {
                return this.height;
            } else {
                return 0;
            }
        }
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        if (this.width != 0) {
            sb.append(this.width);
        }

        sb.append("*");

        if (this.height != 0) {
            sb.append(this.height);
        }

        if (hasSuffix) {
            sb.append("^");
        }

        return sb.toString();
    }
}
