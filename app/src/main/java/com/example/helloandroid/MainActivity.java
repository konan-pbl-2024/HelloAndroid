package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button okButton = findViewById(R.id.button);
        okButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText);
                String inputStr = editText.getText().toString();
                TextView textView1 = findViewById(R.id.text);
                textView1.setText(inputStr);
            }
        });
        Button nextButton = findViewById(R.id.button2);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });
        nextButton.setAlpha(0.3f);
        nextButton.setRotation(15f);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Button okButton = findViewById(R.id.button);
                float x = okButton.getX();
                okButton.setX((x + 10) % 600);
            }
        }, 1000, 100);
    }
}