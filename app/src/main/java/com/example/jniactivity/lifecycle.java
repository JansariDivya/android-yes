package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class lifecycle extends AppCompatActivity {

    private static final String TAG = "logActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "On Create Method Called", Toast.LENGTH_SHORT).show();
        // Log.d(TAG,"OnCreate Method Called");


    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On start method Called", Toast.LENGTH_SHORT).show();
        //Log.d(TAG,"On start method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop Method called", Toast.LENGTH_SHORT).show();
        // Log.d(TAG,"On stop method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy Method Called", Toast.LENGTH_SHORT).show();
        // Log.d(TAG,"On destroy method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On Pause Method Called", Toast.LENGTH_SHORT).show();
        //Log.d(TAG,"On pause method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Pause Method Called", Toast.LENGTH_SHORT).show();
        //Log.d(TAG,"On resume method called");
    }

}