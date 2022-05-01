package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateProfile extends AppCompatActivity {

    private EditText Name;
    private EditText Email;
    private AppPreferences appPreferences;
    private Button Save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        // initializing the views
        initViews();

        // initializing the listeners
        initListeners();

        // initializing the objects
        initObjects();
    }

    private void initObjects() {
        appPreferences = new AppPreferences(getApplicationContext());

        if (appPreferences.getBooleanPrefs(AppPreferences.KEY_SAVE_USER)) {
            Intent intent = new Intent(getApplicationContext(), profileactivity.class);
            startActivity(intent);
            finish();
        }
    }

    private void initListeners() {
        Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveUserData();
            }
        });
    }

    private void initViews() {
        Name = (EditText) findViewById(R.id.name);
        Email = (EditText) findViewById(R.id.email);
        Save = (Button) findViewById(R.id.sav);
    }

    private void saveUserData() {

        appPreferences.setBooleanPrefs(AppPreferences.KEY_SAVE_USER, true);
        appPreferences.setStringPrefs(AppPreferences.KEY_USER_NAME, Name.getText().toString().trim());
        appPreferences.setStringPrefs(AppPreferences.KEY_USER_EMAIL, Email.getText().toString().trim());


        // navigating to profile activity
        Intent intent = new Intent(getApplicationContext(), profileactivity.class);
        startActivity(intent);
        finish();


    }
}