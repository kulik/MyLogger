package com.kulik.logger;

/**
 * User: kulik
 * Date: 2/9/13
 * Time: 4:42 PM
 */
public class EasyLoggerFactory {

    private static Class<? extends MyLog> sLoggerClass;

    private static String sAppTag = "";

    public static void init(Class<? extends MyLog> clazz, String appPrefix) {
        sAppTag = appPrefix;
        sLoggerClass = clazz;
    }

    public static MyLog getLogger(Class clazz) {
        MyLog logger;
        if (MyLogAndroid.class.equals(sLoggerClass)) {
            logger = new MyLogAndroid(clazz, sAppTag);
        } else if (MyLogDesktop.class.equals(sLoggerClass)) {
            logger = new MyLogDesktop(clazz, sAppTag);
        } else {
            throw new IllegalArgumentException("EasyLoggerFactory no logger has selected");
        }
        return logger;
    }
}
