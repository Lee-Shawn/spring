package com.laughing.spring.exception;

/**
 * @author : laughing
 * @create : 2021-04-11 17:12
 * @description :
 */
public class NameException extends MyUserException {
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
