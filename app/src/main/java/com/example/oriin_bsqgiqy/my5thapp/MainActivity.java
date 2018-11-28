package com.example.oriin_bsqgiqy.my5thapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
TextView TV;
Random rnd = new Random();
int x=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.btn1);
        btn2= (Button) findViewById(R.id.btn2);
        TV= (TextView) findViewById(R.id.TV);
    }

    public void go(View view) {
        x=rnd.nextInt();
        TV.setText("number="+x);

    }

    public void goo(View view) {
        TV.setText("number not found");
    }
}
