package com.ydy._09自定义异常;

/**
    自定义编译时异常类
        1.继承RuntimeException。
        2.重写构造器。
 */
public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }

    public AgeIllegalRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeIllegalRuntimeException(Throwable cause) {
        super(cause);
    }

    public AgeIllegalRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
