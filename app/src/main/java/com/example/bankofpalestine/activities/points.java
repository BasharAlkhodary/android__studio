package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bankofpalestine.R;

public class points extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    View v1,v2,v3,v4,v5,v6;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        tv1 = findViewById(R.id.tv_tt1);
        v1 = findViewById(R.id.v_v1);
        tv3 = findViewById(R.id.tv_Main);
        tv4 = findViewById(R.id.tv_setting1);
        v2 = findViewById(R.id.v_v2);
        tv5 = findViewById(R.id.tv_setting2);
        v3 = findViewById(R.id.v_v3);
        tv6 = findViewById(R.id.tv_setting3);
        v4 = findViewById(R.id.v_v4);
        tv7 = findViewById(R.id.tv_setting4);
        v5 = findViewById(R.id.v_v5);
        tv8 = findViewById(R.id.tv_setting5);
        v6 = findViewById(R.id.v_v6);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(points.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}