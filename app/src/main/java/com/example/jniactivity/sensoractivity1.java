package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class sensoractivity1 extends AppCompatActivity {
  TextView t1;
  private SensorManager mSensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensoractivity1);
        t1=(TextView)findViewById(R.id.text2);
        t1.setVisibility(View.GONE);
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor>mList = mSensorManager.getSensorList(Sensor.TYPE_ALL);

        for(int i=1;i<mList.size();i++)
        {
            t1.setVisibility(View.VISIBLE);
            t1.append("\n" + mList.get(i).getName());
        }
    }
}