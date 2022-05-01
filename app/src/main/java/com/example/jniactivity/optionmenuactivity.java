package com.example.jniactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class optionmenuactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionmenuactivity);


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menuactivity,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.search:
                Toast.makeText(getApplicationContext(),"Searching",Toast.LENGTH_LONG).show();
                break;
            case R.id.play:
                Toast.makeText(getApplicationContext(),"playing",Toast.LENGTH_LONG).show();
                break;
            case R.id.pause:
                Toast.makeText(getApplicationContext(),"pausing",Toast.LENGTH_LONG).show();
                break;
            case R.id.call:
                Toast.makeText(getApplicationContext(),"calling",Toast.LENGTH_LONG).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}