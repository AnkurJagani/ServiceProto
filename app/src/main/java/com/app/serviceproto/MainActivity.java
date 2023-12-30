package com.app.serviceproto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnStartService = findViewById(R.id.btnStartService);
        Button btnStopService = findViewById(R.id.btnStopService);
        Button btnNextActivity = findViewById(R.id.btnNextActivity);
        btnStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnStartServiceClick();
            }
        });
        btnStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnStopServiceClick();
            }
        });
        btnNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnNextActivityClick();
            }
        });
    }


    private void btnStartServiceClick() {
        startService(new Intent(this, MusicService.class));
    }


    private void btnStopServiceClick() {
        stopService(new Intent(this, MusicService.class));
    }

    private void btnNextActivityClick() {
        startActivity(new Intent(this, NextActivity.class));
    }

}