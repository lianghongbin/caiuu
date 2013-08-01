package com.meishihome.photo.thumbnailator;


import com.meishihome.photo.PositionType;
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
    private PositionType type = PositionType.BOTTOM_RIGHT;

    public void setPositionType(PositionType type) {
        this.type = type;
    }

    public CaiuuPosition() {}

    public CaiuuPosition(int insetLeft, int insetRight, int insetTop, int insetBottom) {
        this.insetLeft = insetLeft;
        this.insetRight = insetRight;
        this.insetTop = insetTop;
        this.insetBottom = insetBottom;
    }

    @Override
    public Point calculate(int enclosingWidth, int enclosingHeight, int width, int height, int l, int r, int t, int b) {

        int x,y;
        switch (type) {
            case TOP_LEFT: {
                x = insetLeft;
                y = insetTop;
            }
            break;

            case TOP_CENTER: {
                x = (enclosingWidth / 2) - (width / 2);
                y = insetTop;
            }
            break;

            case TOP_RIGHT:{
                x = enclosingWidth - width - insetRight;
                y = insetTop;
            }
            break;

            case CENTER_LEFT:{
                x = insetLeft;
                y = (enclosingHeight / 2) - (height / 2);
            }
            break;

            case CENTER: {
                x = (enclosingWidth / 2) - (width / 2);
                y = (enclosingHeight / 2) - (height / 2);
            }
            break;

            case CENTER_RIGHT:{
                x = enclosingWidth - width - insetRight;
                y = (enclosingHeight / 2) - (height / 2);
            }
            break;

            case BOTTOM_LEFT:{
                x = insetLeft;
                y = enclosingHeight - height - insetBottom;
            }
            break;

            case BOTTOM_CENTER:{
                x = (enclosingWidth / 2) - (width / 2);
                y = enclosingHeight - height - insetBottom;
            }
            break;

            default: BOTTOM_RIGHT:{
                x = enclosingWidth - width - insetRight;
                y = enclosingHeight - height - insetBottom;
            }
            break;
        }

        return new Point(x, y);
    }
}
