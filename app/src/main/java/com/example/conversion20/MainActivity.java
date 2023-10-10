package com.example.conversion20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt2=findViewById(R.id.txt2);

        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                txt2.setText("Segundos faltantes: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
            }
        }.start();
    }
}