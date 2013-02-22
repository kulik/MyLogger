package com.kulik.logger;

/**
 * User: kulik
 * Date: 2/9/13
 * Time: 4:42 PM
 */
public class EasyLogger {

    private String mTag;

    public EasyLogger(Class clazz) {
        //TODO Add Proguard config a.a.b.A != A
        mTag = MyLog.getAppTag() + clazz.getSimpleName();
    }

    public void i(String message) {
        MyLog.i(mTag, message);
    }

    public void d(String message) {
        MyLog.d(mTag, message);
    }
}
