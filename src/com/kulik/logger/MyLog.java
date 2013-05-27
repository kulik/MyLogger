package com.kulik.logger;

/**
 * User: kulik
 * Date: 2/8/13
 * Time: 5:56 PM
 */
public interface MyLog {

    //TODO change to log level
    static final boolean DEBUG = true;
    static final boolean INFO = true;

    public void i(String message);

    public void d(String message);
}
