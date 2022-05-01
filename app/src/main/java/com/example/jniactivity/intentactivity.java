package com.example.jniactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class intentactivity extends AppCompatActivity {
    Button implicit,implicit2;
    ImageButton implicit3,implicit4;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentactivity);
        setTitle("IntentPage");
        implicit=(Button)findViewById(R.id.implicit);
        implicit2=(Button)findViewById(R.id.explicit);
        implicit3=(ImageButton)findViewById(R.id.implicit_image);
        implicit4=(ImageButton)findViewById(R.id.implicit_tele);

        et=findViewById(R.id.message);

        implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.einfochips.com"));
                startActivity(intent);
            }
        });

        implicit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String text="Jai Shree Krishna";
                String text = et.getText().toString();
                Intent i= new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT,text);
                startActivity(Intent.createChooser(i,"Suggest to friends"));
                et.setText("");
            }
        });

        implicit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text="Hello Guys";
                Intent i= new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_TEXT,text);
                i.setPackage("com.whatsapp");
                startActivity(Intent.createChooser(i,"Suggest to friends"));
            }
        });

        implicit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String phone = "+9426579349";
                //Intent intent = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",phone,null));
                //startActivity(intent);
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+9426579349"));
                startActivity(intent);
            }
        });



    }
}