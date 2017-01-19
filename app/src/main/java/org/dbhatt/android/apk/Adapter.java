package org.dbhatt.android.apk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by dev on 17/1/17.
 * this class is adapter for recycler view from main activity
 * <p>
 * it shows
 * - icon of application
 * - name of application
 * - version of application
 * - package name
 */

class Adapter extends RecyclerView.Adapter<Adapter.App> {

    private List<org.dbhatt.android.apk.App> list;
    private PackageManager pm;

    Adapter(Context context) {
        list = new ArrayList<>();
        pm = context.getPackageManager();
        for (ApplicationInfo applicationInfo : pm.getInstalledApplications(PackageManager.GET_META_DATA)) {
            if ((applicationInfo.flags & applicationInfo.FLAG_SYSTEM) != 0)
                continue;
            try {
                list.add(new org.dbhatt.android.apk.App((String) applicationInfo.loadLabel(pm), pm.getPackageInfo(applicationInfo.packageName, 0)));
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
            Collections.sort(list, new Comparator<org.dbhatt.android.apk.App>() {
                @Override
                public int compare(org.dbhatt.android.apk.App o1, org.dbhatt.android.apk.App o2) {
                    return o1.getApp_name().compareTo(o2.getApp_name());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Adapter(Context context, int j) {
        list = new ArrayList<>();
        pm = context.getPackageManager();
        for (ApplicationInfo applicationInfo : pm.getInstalledApplications(PackageManager.GET_META_DATA)) {
            try {
                list.add(new org.dbhatt.android.apk.App((String) applicationInfo.loadLabel(pm), pm.getPackageInfo(applicationInfo.packageName, 0)));
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
            Collections.sort(list, new Comparator<org.dbhatt.android.apk.App>() {
                @Override
                public int compare(org.dbhatt.android.apk.App o1, org.dbhatt.android.apk.App o2) {
                    return o1.getApp_name().compareTo(o2.getApp_name());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public App onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_app, parent, false);
        return new App(v);
    }

    @Override
    public void onBindViewHolder(App holder, int position) {
        org.dbhatt.android.apk.App info = list.get(position);
        holder.app_name.setText(info.getApp_name());
        holder.version.setText(info.packageInfo.versionName);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class App extends RecyclerView.ViewHolder {

        ImageView app_icon;
        TextView app_name, version;

        App(View itemView) {
            super(itemView);
            app_icon = (ImageView) itemView.findViewById(R.id.app_row_icon);
            app_name = (TextView) itemView.findViewById(R.id.app_row_name);
            version = (TextView) itemView.findViewById(R.id.app_row_app_version_value);
        }
    }
}