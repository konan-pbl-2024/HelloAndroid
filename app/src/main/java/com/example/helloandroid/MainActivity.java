package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button okButton = findViewById(R.id.button);
        okButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView1 = findViewById(R.id.text);
                textView1.setText("OK Button Clicked!!");
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
    }
}