package com.kulik.logger;

import android.util.Log;

/**
 * User: kulik
 * Date: 2/8/13
 * Time: 5:56 PM
 */
public class MyLog {

    private static String appTag = "";

    //TODO change to log level
    private static final boolean DEBUG = true;
    private static final boolean INFO = true;

    public static void init(String appPrefix) {
        appTag = appPrefix;
    }

    static String getAppTag() {
        return appTag;
    }

    static void i(String tag, String message) {
        if (INFO) {
            Log.i(tag, message);
        }
    }

    static void d(String tag, String message) {
        if (DEBUG) {
            Log.d(tag, message);
        }
    }
}
