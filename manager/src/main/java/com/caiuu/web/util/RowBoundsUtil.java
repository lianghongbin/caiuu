package com.caiuu.web.util;

import org.apache.ibatis.session.RowBounds;

/**
 * User: lianghongbin
 * Date: 7/16/13
 * Time: 15:20
 * Description:
 */
public class RowBoundsUtil {

    public static RowBounds generate(Page page) {
        int offset = (page.getCurrentPage()-1) * page.getPageSize();
        return new RowBounds(offset, page.getPageSize());
    }

}
