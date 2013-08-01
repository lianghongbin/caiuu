package com.meishihome.photo.exception;

/**
 * User: lianghongbin
 * Date: 7/15/13
 * Time: 9:55
 * Description:
 */
public class PhotoException extends Exception {

    public PhotoException() {
        super();
    }

    public PhotoException(Throwable throwable) {
        super(throwable);
    }

    public PhotoException(String message) {
        super(message);
    }

    public PhotoException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
