package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class broadcastimageactivity extends AppCompatActivity {
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcastimageactivity);
        i1 = findViewById(R.id.img1);

        Intent i = getIntent();
        String action = i.getAction();
        String type= i.getType();
        if(Intent.ACTION_SEND.equals(action)&&type!=null)
        {
            i1.setImageURI(i.getParcelableExtra(Intent.EXTRA_STREAM));
        }
    }
}