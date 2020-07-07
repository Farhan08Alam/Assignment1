package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.username);
    }

    public void submit(View view) {
        String uname = et.getText().toString();
        if(uname.isEmpty()){
            Toast.makeText(this,"Please Enter Name",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(MainActivity.this, SecondActivity.class);
            i.putExtra("mydata", uname);
            startActivity(i);
        }
    }
}