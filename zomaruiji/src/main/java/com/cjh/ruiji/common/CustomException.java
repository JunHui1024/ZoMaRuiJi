package com.cjh.ruiji.common;

/**
 * 自定义业务异常类
 * @author cjh
 */
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}
