package org.dbhatt.android.apk;

import android.content.pm.PackageInfo;

/**
 * Created by dev on 18/1/17.
 *
 */

class App {
    private String app_name;
    PackageInfo packageInfo;


    App(String name, PackageInfo packageInfo) {
        this.packageInfo = packageInfo;
        this.app_name=name;
    }


    public String getApp_name() {
        return app_name;
    }

}
