package org.dbhatt.android.apk;

import android.content.pm.PackageInfo;

/**
 * Created by dev on 18/1/17.
 */

class App {
    private String app_name;
    PackageInfo packageInfo;


    App(String name, PackageInfo packageInfo) {
        this.packageInfo = packageInfo;
        setApp_name(name);
    }


    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public PackageInfo getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(PackageInfo packageInfo) {
        this.packageInfo = packageInfo;
    }
}
