package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class backgroundserviceactivity extends AppCompatActivity {
    Button b21,b22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backgroundserviceactivity);

        b21 = (Button)findViewById(R.id.button12);
        b22 = (Button)findViewById(R.id.button13);

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getApplicationContext(),backgroundservice.class));
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getApplicationContext(),backgroundservice.class));
            }
        });

    }
}