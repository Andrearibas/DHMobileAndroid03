package com.example.desafioandroidnovo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.desafioandroidnovo.R;
import com.example.desafioandroidnovo.activity.LoginActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Timer().schedule(new TimerTask(){
            @Override
            public void run() {
                irParaTelaLoginActivity();
            }
        }, 2000);
    }

    private void irParaTelaLoginActivity () {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
