package com.laughing.spring.exception;

/**
 * @author : laughing
 * @create : 2021-04-11 17:11
 * @description :
 */
public class MyUserException extends Exception {
    public MyUserException() {
        super();
    }

    public MyUserException(String message) {
        super(message);
    }
}
