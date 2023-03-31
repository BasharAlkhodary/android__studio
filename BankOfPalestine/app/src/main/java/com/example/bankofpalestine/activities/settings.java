package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bankofpalestine.R;

public class settings extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14;
    View v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);




        tv1 = findViewById(R.id.tv_draw1);
        tv2 = findViewById(R.id.tv_draw2);
        tv3 = findViewById(R.id.tv_Main);
        tv4 = findViewById(R.id.tv_setting1);
        tv5 = findViewById(R.id.tv_setting2);
        tv6 = findViewById(R.id.tv_setting3);
        tv7 = findViewById(R.id.tv_setting4);
        tv8 = findViewById(R.id.tv_setting5);
        tv9 = findViewById(R.id.tv_setting6);
        tv10 = findViewById(R.id.tv_setting7);
        tv11 = findViewById(R.id.tv_setting8);
        tv12 = findViewById(R.id.tv_setting9);
        tv13 = findViewById(R.id.tv_setting10);
        tv14 = findViewById(R.id.tv_setting11);

        v1 = findViewById(R.id.v_v1);
        v2 = findViewById(R.id.v_v2);
        v3 = findViewById(R.id.v_v3);
        v4 = findViewById(R.id.v_v4);
        v5 = findViewById(R.id.v_v5);
        v6 = findViewById(R.id.v_v6);
        v7 = findViewById(R.id.v_v7);
        v8 = findViewById(R.id.v_v8);
        v9 = findViewById(R.id.v_v9);
        v10 = findViewById(R.id.v_v10);
        v11 = findViewById(R.id.v_v11);
        v12 = findViewById(R.id.v_v12);






    }
}