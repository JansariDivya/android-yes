package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class proximityactivity extends AppCompatActivity implements SensorEventListener {

    TextView t1;
    private SensorManager mSensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximityactivity);
        t1=(TextView)findViewById(R.id.text2);
        t1.setVisibility(View.GONE);
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        if(mSensorManager!=null)
        {
            Sensor proximitysensor = mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
            if(proximitysensor!=null)
            {
                mSensorManager.registerListener(this,proximitysensor,mSensorManager.SENSOR_DELAY_NORMAL);
            }
        }
        else
        {
            Toast.makeText(this, "sensorservice not detected", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.sensor.getType()==Sensor.TYPE_PROXIMITY)
        {
            t1.setVisibility(View.VISIBLE);
            t1.setText("Proximity:" + sensorEvent.values[0]);
        }

        if(sensorEvent.values[0]>0)
        {
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.screenBrightness=-1;
            getWindow().setAttributes(params);
        }
        else
        {
            WindowManager.LayoutParams params = getWindow().getAttributes();
            params.screenBrightness=1;
            getWindow().setAttributes(params);
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}