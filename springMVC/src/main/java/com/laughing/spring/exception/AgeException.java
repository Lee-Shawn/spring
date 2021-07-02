package com.laughing.spring.exception;

/**
 * @author : laughing
 * @create : 2021-04-11 17:13
 * @description :
 */
public class AgeException extends MyUserException {
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
