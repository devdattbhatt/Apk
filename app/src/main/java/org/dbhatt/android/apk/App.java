/*
 * Copyright (c) 2017.
 *
 *     This file is part of apk app.
 *
 *     this app is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     app is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */

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
