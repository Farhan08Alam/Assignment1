package com.example.assign2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    int a=0,b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.count1);
        tv2 = findViewById(R.id.count2);
        if(savedInstanceState!= null){
            String s1 = savedInstanceState.getString("c1");
            tv1.setText(s1);
            String s2 = savedInstanceState.getString("c2");
            tv2.setText(s2);
        }
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("c1",tv1.getText().toString());
        outState.putString("c2",tv2.getText().toString());
    }

    public void add1(View view) {
        a+=1;
        tv1.setText(""+a);
    }

    public void add2(View view) {
        a+=2;
        tv1.setText(""+a);
    }

    public void add3(View view) {
        a+=3;
        tv1.setText(""+a);
    }


    public void addOne(View view) {
        b+=1;
        tv2.setText(""+b);
    }

    public void addTwo(View view) {
        b+=2;
        tv2.setText(""+b);
    }

    public void addThree(View view) {
        b+=3;
        tv2.setText(""+b);
    }

    public void reset(View view) {
        tv1.setText(""+0);
        tv2.setText(""+0);
        a=0;b=0;
    }
}