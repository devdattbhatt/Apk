package org.dbhatt.android.apk;

import android.os.Bundle;
import android.support.annotation.Nullable;
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
    public void onClick(View v) {

    }
}
