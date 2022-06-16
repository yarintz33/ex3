package com.example.ex3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ex3.databinding.ActivityMainBinding;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_in);

        Button doneBtn = findViewById(R.id.DoneBtn);
        doneBtn.setOnClickListener(view -> {
            Intent i = new Intent(this, ChatActivity.class);
            startActivity(i);
        });
    }
}