package com.example.jniactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class profileactivity extends AppCompatActivity {

    private TextView Name1;
    private TextView Email1;
    private Button logout;

    private AppPreferences appPreferences;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileactivity);
        // initializing the views
        initViews();

        // initializing the listeners
        initListeners();

        // initializing the objects
        initObjects();

        // set preferences value to views
        showPrefsToViews();
    }

    private void initViews() {
        Email1 = (TextView) findViewById(R.id.em);
        Name1 = (TextView) findViewById(R.id.na);
        logout = (Button) findViewById(R.id.out);

    }

    private void initListeners() {

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appPreferences.clearPrefs();

                // navigating to the profile making activity
                Intent intent = new Intent(getApplicationContext(), CreateProfile.class);
                startActivity(intent);
                finish();
            }
        });


    }

    private void initObjects() {
        appPreferences = new AppPreferences(getApplicationContext());
    }

    private void showPrefsToViews() {

        Name1.setText(appPreferences.getStringPrefs(AppPreferences.KEY_USER_NAME));

        Email1.setText(appPreferences.getStringPrefs(AppPreferences.KEY_USER_EMAIL));

    }

}