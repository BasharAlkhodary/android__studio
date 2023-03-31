package com.example.bankofpalestine.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bankofpalestine.R;

public class MainActivity extends AppCompatActivity {

    public static final int WRITE_EX_REQ_CODE = 1;
    public static final int CAM = 1;
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
    TextView tv1,QR;

    //خاص بتفعيل ملف الالوان
    @SuppressLint("ResourceAsColor")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.tv_draw);
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
        QR = findViewById(R.id.QR_CODE);
       // دفاتر_الشيكات.setTextSize(25);
       // الاسم.setTextColor(R.color.purple_200;

        //هل الصلاحية تم الحصول عليها ام لا
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            //الصلاحية لم يتم الحصول عليها
            String [] permissions = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
            ActivityCompat.requestPermissions(this,permissions,WRITE_EX_REQ_CODE);
        }
        else {
        //الصلاحية تم الحصول عليها
        }




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

        QR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //هل الصلاحية تم الحصول عليها ام لا
                if(ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
                    //الصلاحية لم يتم الحصول عليها
                    String [] permissions = {Manifest.permission.CAMERA};
                    ActivityCompat.requestPermissions(MainActivity.this,permissions,CAM);
                }
                else {
                    //الصلاحية تم الحصول عليها
                }
            }
        });
//        Toast.makeText(MainActivity.this, "BIK", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        switch (requestCode) {
            case WRITE_EX_REQ_CODE:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "تم الحصول على الصلاحية", Toast.LENGTH_SHORT).show();
                }
                return;
        }
        switch (requestCode){
            case CAM:
                if(grantResults.length > 0 && grantResults[1]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this, "تم الحصول على الصلاحية", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }
    }

