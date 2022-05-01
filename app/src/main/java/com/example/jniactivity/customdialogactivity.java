package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class customdialogactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customdialogactivity);
        showDialog();
    }
    public void showDialog()
    {
        Dialog dialog =new Dialog(this);
        dialog.setContentView(R.layout.activity_customdialogactivity);
        Button btn = (Button)dialog.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();

    }
}