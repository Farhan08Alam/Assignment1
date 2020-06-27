package com.example.assign3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.net.PasswordAuthentication;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.uname);
        et2 = findViewById(R.id.pass);
    }

    public void Login(View view) {
        String uname = et1.getText().toString();
        String pass = et2.getText().toString();
        if(uname.isEmpty() || pass.isEmpty() ){
            if(uname.isEmpty())
            Toast.makeText(this,"Please Enter Name ",Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this,"Please Enter Password ",Toast.LENGTH_SHORT).show();

        }
        else {
            Intent i = new Intent(MainActivity.this, home.class);
            i.putExtra("mydata", uname);
            startActivity(i);
        }

    }

    public void Reg(View view) {
        Intent i = new Intent(MainActivity.this,registration.class);
        startActivity(i);
    }
}