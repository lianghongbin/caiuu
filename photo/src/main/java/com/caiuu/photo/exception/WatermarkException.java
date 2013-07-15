package com.caiuu.photo.exception;

/**
 * User: lianghongbin
 * Date: 7/15/13
 * Time: 9:55
 * Description:
 */
public class WatermarkException extends PhotoException {

    public WatermarkException() {
        super();
    }

    public WatermarkException(Throwable throwable) {
        super(throwable);
    }

    public WatermarkException(String message) {
        super(message);
    }

    public WatermarkException(String message, Throwable throwable) {
        super(message, throwable);
    }
}