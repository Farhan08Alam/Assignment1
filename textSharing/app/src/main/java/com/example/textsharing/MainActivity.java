package com.example.textsharing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
        et = findViewById(R.id.msg);

    }

    public void share(View view) {
        String s = et.getText().toString();
        if(s.isEmpty()){
            Toast.makeText(this,"Text Can't Be Empty",Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_SEND);
            i.putExtra(Intent.EXTRA_TEXT, s);
            i.setType("text/plain");

            Intent shareIntent = Intent.createChooser(i, null);
            startActivity(shareIntent);
            et.setText("");
        }

    }
}