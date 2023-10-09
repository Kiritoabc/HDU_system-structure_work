package org.boluo.test.exception;

/**
 *  自定义简单的常类
 */
public class BException extends RuntimeException{
    public BException(){
        super();
    }

    public BException(String errMsg){
        super(errMsg);
    }
}
