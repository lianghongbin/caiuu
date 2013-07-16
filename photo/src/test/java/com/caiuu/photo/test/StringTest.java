package com.caiuu.photo.test;

import java.text.MessageFormat;

/**
 * User: lianghongbin
 * Date: 7/16/13
 * Time: 17:31
 * Description:
 */
public class StringTest {

    public static void main(String[] args) {
        String url = "/list/{0}";
        String out = MessageFormat.format(url, 1);

        System.out.println(out);
    }
}
