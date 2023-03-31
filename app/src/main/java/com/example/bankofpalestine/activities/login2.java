package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bankofpalestine.R;

import java.security.PrivateKey;

public class login2 extends AppCompatActivity {
    EditText ed1,ed2;
    Button bt1;
    SharedPreferences sharedPreferences;
    String username ,password,user1,pass1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        bt1 = findViewById(R.id.bt_btn1);
        ed1 = findViewById(R.id.tv_enter);
        ed2 = findViewById(R.id.tv_pass);
        sharedPreferences = getSharedPreferences("Users", MODE_PRIVATE);
        username = sharedPreferences.getString("username","");
        password = sharedPreferences.getString("password","");


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user1 = ed1.getText().toString();
                pass1 = ed2.getText().toString();
                if( user1.equals("BIK") && pass1.equals("120140180")){
                    Intent i = new Intent(login2.this, MainActivity.class);
                    startActivity(i);
                    finish();
                    Toast.makeText(login2.this, "Welcome  " + user1, Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(login2.this, "Please Enter Username & Password again" , Toast.LENGTH_SHORT).show();
//                    Intent j = new Intent(login2.this, MainActivity.class);
//                    startActivity(j);
//                    finish();
                }


            }
        });
    }
}