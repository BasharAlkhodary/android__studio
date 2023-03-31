package com.example.bankofpalestine.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bankofpalestine.R;

public class payToFriend extends AppCompatActivity {
    public static final int READ_CON = 1;



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



        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(payToFriend.this, MainActivity.class);
                startActivity(i);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {
                    //الصلاحية لم يتم الحصول عليها
                    String[] permissions = {Manifest.permission.READ_CONTACTS};
                    ActivityCompat.requestPermissions(payToFriend.this,permissions,READ_CON);
                } else {
                    //الصلاحية تم الحصول عليها
                }
            }
        });
    }
        public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);

            switch (requestCode){
                case READ_CON:
                    if(grantResults.length > 0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(this, "تم الحصول على الصلاحية", Toast.LENGTH_SHORT).show();
                    }
                    return;
            }
    }
}