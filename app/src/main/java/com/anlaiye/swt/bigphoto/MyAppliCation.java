package com.anlaiye.swt.bigphoto;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by pc on 2016/12/14.
 */

public class MyAppliCation extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
