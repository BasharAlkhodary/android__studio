package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bankofpalestine.R;

public class payToFriend extends AppCompatActivity {

    TextView tv1 , tv2 ;
    View v1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_to_friend);

        tv1 = findViewById(R.id.tv_tt1);
        v1 = findViewById(R.id.v_v1);
        tv2 = findViewById(R.id.tv_name);
        btn1 = findViewById(R.id.btn_ed1);

    }
}