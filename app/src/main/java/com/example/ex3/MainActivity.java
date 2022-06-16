package com.example.ex3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ex3.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

//    private  SampleViewModel viewModel;

    private ActivityMainBinding MainActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainActivityBinding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(MainActivityBinding.getRoot());

        MainActivityBinding.loginBtn.setOnClickListener(view -> {
            Intent i = new Intent(this, ChatActivity.class);
            startActivity(i);
        });

        MainActivityBinding.SignInBtn.setOnClickListener(view -> {
            Intent j = new Intent(this, SignInActivity.class);
            startActivity(j);
        });
    }
}