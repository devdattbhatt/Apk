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

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dev on 19/1/17.
 * via this activity user can reach developer
 */

public class Contact_us extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        TextView whats_app, developer, language, google_plus, linkedin, facebook;

        whats_app = (TextView) findViewById(R.id.contact_to_whats_app);
        developer = (TextView) findViewById(R.id.contact_to_google_plus_developer);
        language = (TextView) findViewById(R.id.contact_to_language);
        google_plus = (TextView) findViewById(R.id.contact_to_google_plus);
        linkedin = (TextView) findViewById(R.id.contact_to_linkedin);
        facebook = (TextView) findViewById(R.id.contact_to_facebook);


        whats_app.setOnClickListener(this);
        developer.setOnClickListener(this);
        language.setOnClickListener(this);
        google_plus.setOnClickListener(this);
        linkedin.setOnClickListener(this);
        facebook.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.contact_to_whats_app:
                try {
                    startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:9427159497")).setPackage("com.whatsapp"));
                } catch (Exception e) {
                    e.printStackTrace();
                    Snackbar snackbar = Snackbar.make(view, R.string.seekbar_install_whats_app, Snackbar.LENGTH_SHORT);
                    snackbar.setAction(R.string.seekbar_install_now, new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //https://play.google.com/store/apps/details?id=com.whatsapp
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")));
                        }
                    });
                    snackbar.show();
                }
                break;
            case R.id.contact_to_google_plus_developer:
                try {
                    startActivity(Intent.createChooser(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://groups.google.com/forum/#!forum/dbhatt_org_android/join")), null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.contact_to_language:
                try {
                    startActivity(Intent.createChooser(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://groups.google.com/forum/#!forum/dbhatt_org_language/join")), null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.contact_to_google_plus:
                try {
                    startActivity(Intent.createChooser(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://plus.google.com/114708882354058631022")), null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.contact_to_linkedin:
                try {
                    startActivity(Intent.createChooser(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.linkedin.com/in/devdatt-bhatt-533136109")), null));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case R.id.contact_to_facebook:
                try {
                    if (getPackageManager().getPackageInfo("com.facebook.katana", 0).versionCode >= 3002850)
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("fb://facewebmodal/f?href=https://www.facebook.com/dbhatt.org")));
                    else
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/dbhatt.org")));
                } catch (Exception e) {
                    startActivity(Intent.createChooser(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/dbhatt.org")), null));
                }
                break;
        }
    }
}