package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bankofpalestine.R;

public class manageMostafedin extends AppCompatActivity {

    TextView tt2 , t2 , t3 , t4 , t5;
    EditText ed1;
    View v1 ;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_mostafedin);

        tt2 = findViewById(R.id.tv_tt1);
        v1 = findViewById(R.id.v_v1);
        t2 = findViewById(R.id.tv_name);
        ed1 = findViewById(R.id.ed_search);
        t3 = findViewById(R.id.tv_tv1);
        t4 = findViewById(R.id.tv_tv2);
        t5 = findViewById(R.id.tv_tv3);




    }
}