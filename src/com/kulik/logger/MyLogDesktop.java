package com.kulik.logger;

/**
 * User: kulik
 * Date: 2/8/13
 * Time: 5:56 PM
 */
public class MyLogDesktop implements MyLog {

    private String mTag = "";

    public MyLogDesktop(Class clazz, String mAppTag) {
        //TODO Add Proguard config a.a.b.A != A
        mTag = mAppTag + clazz.getSimpleName();
    }

    @Override
    public void i(String message) {
        if (INFO) {
            System.out.println(mTag + ";\t" + message);
        }
    }

    @Override
    public void d(String message) {
        if (DEBUG) {
            System.out.println(mTag + ";\t" + message);
        }
    }

    @Override
    public void e(String message) {
        System.out.println(mTag + ";\t" + message);
    }

    @Override
    public void e(String message, Throwable e) {
        System.out.println(mTag + ";\t" + message);
        e.printStackTrace();
    }
}
