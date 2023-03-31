package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bankofpalestine.R;

public class tahwelat extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
    Button btn1,btn2,btn3,btn4;
    View v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahwelat);

         tv1 = findViewById(R.id.tv_tt1);
         v1 = findViewById(R.id.v_v1);
         tv2 = findViewById(R.id.tv_name);
         tv3 = findViewById(R.id.tv_method);
         btn1 = findViewById(R.id.bt_btn1);
         btn2 = findViewById(R.id.bt_btn2);
         btn3 = findViewById(R.id.bt_btn3);
         tv4 = findViewById(R.id.tv_choose);
         ed1 = findViewById(R.id.ed_ed1);
         ed2 = findViewById(R.id.ed_ed2);
         ed3 = findViewById(R.id.ed_ed3);
         ed4 = findViewById(R.id.ed_ed4);
         ed5 = findViewById(R.id.ed_ed5);
         ed6 = findViewById(R.id.ed_ed6);
         ed7 = findViewById(R.id.ed_ed7);
         ed8 = findViewById(R.id.ed_ed8);
         btn4 = findViewById(R.id.bt_btn4);


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(tahwelat.this, "Proceed", Toast.LENGTH_LONG).show();
            }
        });

    }
}