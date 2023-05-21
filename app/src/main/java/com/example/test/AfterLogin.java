package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AfterLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);


        Intent intent = getIntent();
        TextView userName = findViewById(R.id.tv_userName);
        userName.setText(intent.getStringExtra("userName"));

    }
}