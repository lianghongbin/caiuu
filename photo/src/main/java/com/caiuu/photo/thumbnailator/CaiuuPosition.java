package com.caiuu.photo.thumbnailator;


import com.caiuu.photo.PositionType;
import net.coobird.thumbnailator.geometry.Position;

import java.awt.*;


/**
 * User: lianghongbin
 * Date: 7/15/13
 * Time: 16:22
 * Description:
 */
public class CaiuuPosition implements Position {

    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private int insetBottom;
    private PositionType type = PositionType.BOTTOM_CENTER;

    public void setPositionType(PositionType type) {
        this.type = type;
    }

    public CaiuuPosition() {}

    public CaiuuPosition(int insetLeft, int insetRight, int insetTop, int insetBottom) {

    }

    @Override
    public Point calculate(int enclosingWidth, int enclosingHeight, int width, int height, int insetLeft, int insetRight, int insetTop, int insetBottom) {

        int x = enclosingWidth - width - 10;
        int y = enclosingHeight - height - 10;
        return new Point(x, y);
    }

    private Point
}
