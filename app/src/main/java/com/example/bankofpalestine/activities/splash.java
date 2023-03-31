package com.example.bankofpalestine.activities;

import static android.media.AudioAttributes.*;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.bankofpalestine.R;

import java.util.Timer;
import java.util.TimerTask;


public class splash extends AppCompatActivity {
//    public static final int music = 1;

 ImageView img;
// MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       // Toast.makeText(splash.this, "Hello For Bank Of Palestine", Toast.LENGTH_SHORT).show();
        img = findViewById(R.id.img_hed);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                Intent i = new Intent(splash.this,login2.class);
                Intent goTOLogin = new Intent(splash.this,login2.class);
                startActivity(goTOLogin);

                finish();
            }
        }, 1600);

//        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(CONTENT_TYPE_MUSIC).setUsage(USAGE_MEDIA).build());
//        mediaPlayer.setDataSource(getApplicationContext(),R.raw.music);
//        mediaPlayer.prepare();
//        mediaPlayer.start();
//

    }
}