package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class listadapteractivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] banknames={"BOI","SBI","HDFC","PNB"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listadapteractivity);

        Spinner spin = (Spinner)findViewById(R.id.sp1);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa =new ArrayAdapter(this, android.R.layout.simple_spinner_item,banknames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),banknames[position],Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}