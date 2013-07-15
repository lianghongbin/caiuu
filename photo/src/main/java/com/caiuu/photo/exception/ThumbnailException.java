package com.caiuu.photo.exception;

/**
 * User: lianghongbin
 * Date: 7/15/13
 * Time: 9:37
 * Description:
 */
public class ThumbnailException extends PhotoException {

    public ThumbnailException() {
        super();
    }

    public ThumbnailException(Throwable throwable) {
        super(throwable);
    }

    public ThumbnailException(String message) {
        super(message);
    }

    public ThumbnailException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
