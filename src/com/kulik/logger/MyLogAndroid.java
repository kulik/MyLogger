package com.kulik.logger;

import android.util.Log;

/**
 * User: kulik
 * Date: 2/8/13
 * Time: 5:56 PM
 */
public class MyLogAndroid implements MyLog{

    private String mTag = "";

    public MyLogAndroid(Class clazz, String mAppTag) {
        //TODO Add Proguard config a.a.b.A != A
        mTag = mAppTag + clazz.getSimpleName();
    }

    public void i(String message) {
        if (INFO) {
            Log.i(mTag, message);
        }
    }

    public void d(String message) {
        if (DEBUG) {
            Log.d(mTag, message);
        }
    }

    @Override
    public void e(String message) {
        Log.e(mTag, message);
    }

    @Override
    public void e(String message, Throwable e) {
        Log.e(mTag, message, e);
    }
}
