package com.example.assign1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int a=0;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.count);
        if(savedInstanceState!= null){
            String s = savedInstanceState.getString("farhan");
            tv.setText(s);
        }
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("farhan",tv.getText().toString());
    }


    public void countUp(View view) {
        a++;
        tv.setText(""+a);
    }

    public void countDown(View view) {
        --a;
        tv.setText(""+a);
    }

    public void reset(View view) {
              tv.setText(""+0);
              a=0;
    }

    public void display(View view) {
        Toast.makeText(this,"Your count is : "+a,Toast.LENGTH_SHORT).show();
    }
}