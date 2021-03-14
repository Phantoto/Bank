package com.example.bank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDate = (TextView) findViewById(R.id.tvDate);
        String date = String.valueOf(android.text.format.DateFormat.format("dd.MM.yyyy", new java.util.Date()));
        tvDate.setText(date);
    }
}