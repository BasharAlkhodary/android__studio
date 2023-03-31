package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bankofpalestine.R;

public class MainActivity extends AppCompatActivity {
    TextView الرئيسية;
    TextView الاسم;
    TextView اخر_تسجيل;
    TextView رقم_الحساب;
    TextView الرقم;
    TextView الاختصارات;
    TextView الاشعارات;
    Button الحسابات;
    Button البطاقات;
    Button التحويلات ;
    Button ادارة_المستفيدين ;
    Button متابعة_الحوالات_الخارجية ;
    Button الدفع_لصديق ;
    Button دفع_الفواتير ;
    Button الشحن_المسبق ;
    Button شراء_رصيد ;
    Button دفاتر_الشيكات ;
    Button عرض_الشيكات_الاجلة ;
    Button نقاطكم ;
    Button التبرع ;
    Button الحملات ;
    Button أسهمي ;
    Button الاعدادات ;
    TextView اخر_حركات ;
    TextView سحب;
    TextView to1;
    View v1;
    TextView ايداع;
    TextView to2;
    View v2;
    TextView ايداع2;
    TextView to3;

    //خاص بتفعيل ملف الالوان
    @SuppressLint("ResourceAsColor")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        الرئيسية = findViewById(R.id.tv_Main);
        الاسم = findViewById(R.id.tv_name);
        اخر_تسجيل = findViewById(R.id.tv_date);
        رقم_الحساب = findViewById(R.id.tv_num);
        الرقم = findViewById(R.id.tv_numn);
        الاشعارات = findViewById(R.id.tv_155);
        الاختصارات = findViewById(R.id.tv_ctrl);
        الحسابات = findViewById(R.id.et_ed3);
        البطاقات = findViewById(R.id.et_ed2);
        التحويلات = findViewById(R.id.et_ed1);
        ادارة_المستفيدين = findViewById(R.id.et_ed4);
        متابعة_الحوالات_الخارجية = findViewById(R.id.et_ed5);
        الدفع_لصديق = findViewById(R.id.et_ed6);
        دفع_الفواتير = findViewById(R.id.et_ed7);
        الشحن_المسبق = findViewById(R.id.et_ed8);
        شراء_رصيد = findViewById(R.id.et_ed9);
        دفاتر_الشيكات =  findViewById(R.id.et_ed10);
        عرض_الشيكات_الاجلة = findViewById(R.id.et_ed11);
        نقاطكم = findViewById(R.id.et_ed12);
        التبرع = findViewById(R.id.et_ed13);
        الحملات = findViewById(R.id.et_ed14);
        أسهمي = findViewById(R.id.et_ed15);
        الاعدادات = findViewById(R.id.et_ed16);
        اخر_حركات = findViewById(R.id.tv_hov);
        سحب = findViewById(R.id.tv_سحب);
        to1 = findViewById(R.id.tv_to1);
        v1 = findViewById(R.id.v_three);
        ايداع = findViewById(R.id.tv_ايداع);
        to2 = findViewById(R.id.tv_to2);
        v2 = findViewById(R.id.v_four);
        ايداع2 = findViewById(R.id.tv_ايداع2);
        to3 = findViewById(R.id.tv_to3);

       // دفاتر_الشيكات.setTextSize(25);
       // الاسم.setTextColor(R.color.purple_200;

        Toast.makeText(MainActivity.this, "Hello For Bank Of Palestine", Toast.LENGTH_LONG).show();
        الحسابات.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,hsabat.class);
                startActivity(i);            }
        });
        ادارة_المستفيدين.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,manageMostafedin.class);
                startActivity(i);            }
        });
        التحويلات.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,tahwelat.class);
                startActivity(i);
            }
        });
        متابعة_الحوالات_الخارجية.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,motabaaHwalatOutside.class);
                startActivity(i);
            }
        });
        الدفع_لصديق.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,payToFriend.class);
                startActivity(i);
            }
        });
        دفع_الفواتير.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,payPhawater.class);
                startActivity(i);
            }
        });
        الاعدادات.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,settings.class);
                startActivity(i);
            }
        });
        نقاطكم.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,points.class);
                startActivity(i);
            }
        });

        الاشعارات.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,notifications.class);
                startActivity(i);
            }
        });
    }

}