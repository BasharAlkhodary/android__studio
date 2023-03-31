package com.example.bankofpalestine.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bankofpalestine.R;
import com.example.bankofpalestine.activities.models.Notifications;
import com.example.bankofpalestine.activities.models.NotificationsAdapter;

import java.util.ArrayList;

public class notifications extends AppCompatActivity {
    ListView lv;
    TextView tt1,t1;
    View v1;

    ArrayList<Notifications> notifications;
    NotificationsAdapter notificationsAdapter;


    @SuppressLint({"ResourceAsColor", "MissingInflatedId"})
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);



        tt1 = findViewById(R.id.tv_tt1);
        v1 = findViewById(R.id.v_v1);
        t1 = findViewById(R.id.tv_name);
        lv = findViewById(R.id.lv);
        notifications =  new ArrayList<Notifications>();


        tt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(notifications.this,MainActivity.class);
                startActivity(i);
            }
        });
//int id, String pay, String date, String post
        notifications.add(new Notifications(1,"الدفع لتاجر","13/10","تحويل دفع لتاجر: Meat City , بمبلغ 25.00 ILS . الرقم المرجعي: TX99834127"));
        notifications.add(new Notifications(2,"أعياد ميلاد","08/12","بنك فلسطين يتمنى لكم عيد ميلاد سعيد مع تمنياتنا بموفور الصحة والعافية"));
        notifications.add(new Notifications(3,"الدفع لتاجر","29/09","تحويل دفع لتاجر: TAG MALL , بمبلغ 31.00 ILS . الرقم المرجعي: TX92596327"));
        notifications.add(new Notifications(4,"تفعيل البصمة","31/08","لقد تم تفعيل الدخول عن طريق البصمة بنجاح"));
        notifications.add(new Notifications(5,"الدفع لتاجر","13/10","تحويل دفع لتاجر: Meat City , بمبلغ 85.36 ILS . الرقم المرجعي: TX99269127"));
        notifications.add(new Notifications(6,"اشعار صيانة","13/10","يرجى العلم أن طلبكم الخاص بفتح حساب بنكي بحاجة لتعديل يرجى الدخول للتطبيق لعمل اللازم"));
        notifications.add(new Notifications(7,"الدفع لتاجر","21/12","تحويل دفع لتاجر: HYPER MALL , بمبلغ 97.00 ILS . الرقم المرجعي: TX99826127"));
        notifications.add(new Notifications(8,"الدفع لتاجر","3/12","تحويل دفع لتاجر: HYPER MALL , بمبلغ 102.00 ILS . الرقم المرجعي: TX98726127"));


        notificationsAdapter = new NotificationsAdapter(getApplicationContext(),notifications);
        lv.setAdapter(notificationsAdapter);

    }
}