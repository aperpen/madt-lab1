package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button changeTextBtn = (Button) findViewById(R.id.changeText);
        changeTextBtn.setOnClickListener(v -> {
            TextView textLabel = findViewById(R.id.textLabel);
            int randomNumber = (int) (Math.random() * 100 + 1); // Random number between 1 and 100

            textLabel.setText(String.format(getString(R.string.changed_text), randomNumber));
        });

        Button changeColorBtn = (Button) findViewById(R.id.changeColor);
        changeColorBtn.setOnClickListener(v -> {
            TextView textLabel = findViewById(R.id.textLabel);
            // Generate random color: https://stackoverflow.com/a/55334738
            int color = ((int) (Math.random() * 16777215)) | (0xFF << 24);

            textLabel.setTextColor(color);
        });
    }
}