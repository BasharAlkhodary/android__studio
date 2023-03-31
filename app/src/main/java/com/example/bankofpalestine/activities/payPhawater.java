package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bankofpalestine.R;

public class payPhawater extends AppCompatActivity {
    TextView tv1 , tv2;
    View v1 ;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_phawater);


        tv1 = findViewById(R.id.tv_tt1);
        v1 = findViewById(R.id.v_v1);
        tv2 = findViewById(R.id.tv_name);
        bt1 = findViewById(R.id.btn_ed1);
        bt2 = findViewById(R.id.btn_ed2);
        bt3 = findViewById(R.id.btn_ed3);
        bt4 = findViewById(R.id.btn_ed4);
        bt5 = findViewById(R.id.btn_ed5);
        bt6 = findViewById(R.id.btn_ed6);
        bt7 = findViewById(R.id.btn_ed7);
        bt8 = findViewById(R.id.btn_ed8);
        bt9 = findViewById(R.id.btn_ed9);
        bt10 = findViewById(R.id.btn_ed10);
        bt11 = findViewById(R.id.btn_ed11);
        bt12 = findViewById(R.id.btn_ed12);
        bt13 = findViewById(R.id.btn_ed13);
        bt14 = findViewById(R.id.btn_ed14);
        bt15 = findViewById(R.id.btn_ed15);
        bt16 = findViewById(R.id.btn_ed16);
        bt17 = findViewById(R.id.btn_ed17);
        bt18 = findViewById(R.id.btn_ed18);
        bt19 = findViewById(R.id.btn_ed19);


        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(payPhawater.this,MainActivity.class);
                startActivity(i);
            }
        });






    }
}