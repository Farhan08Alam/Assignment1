package com.example.assign3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class home extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String s =  getIntent().getStringExtra("mydata");
        TextView tv = findViewById(R.id.text);
        tv.setText("Welcome : "+s);
    }
}