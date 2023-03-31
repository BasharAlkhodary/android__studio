package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bankofpalestine.R;

public class hsabat extends AppCompatActivity {

    TextView t1 , t2 , t3 ,t4 ,t5 ;
    View v1 ,v2 ;
    Button on ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsabat);

        t1 = findViewById(R.id.tv_tt1);
        v1 = findViewById(R.id.v_v1);
        t2 = findViewById(R.id.tv_name);
        t3 = findViewById(R.id.tv_name2);
        t4 = findViewById(R.id.ed_ed1);
        t5 = findViewById(R.id.ed_ed2);
        v2 = findViewById(R.id.v_v2);
        on = findViewById(R.id.bt_btn1);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(hsabat.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}