package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class batteryshowactivity extends AppCompatActivity {
    TextView t1;
    batteryshow battershow1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batteryshowactivity);

        t1=(TextView)findViewById(R.id.tv1);

        battershow1 = new batteryshow(t1);
        registerReceiver(battershow1,new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    protected void onStop()
    {
        super.onStop();
        unregisterReceiver(battershow1);
    }
}