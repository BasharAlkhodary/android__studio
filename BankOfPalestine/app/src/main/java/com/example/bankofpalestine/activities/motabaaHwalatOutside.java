package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.bankofpalestine.R;

public class motabaaHwalatOutside extends AppCompatActivity {

    TextView t1 , t2 , t3 , t4;
    View v1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motabaa_hwalat_outside);

        t1 = findViewById(R.id.tv_t1);
        v1 = findViewById(R.id.v_v1);
        t2 = findViewById(R.id.tv_name);
        t3 = findViewById(R.id.tv_tv2);
        t4 = findViewById(R.id.tv_tv3);

    }
}