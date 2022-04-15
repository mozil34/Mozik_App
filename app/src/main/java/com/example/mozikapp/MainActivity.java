package com.example.mozikapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button register, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = findViewById(R.id.registerTxt);
        login = findViewById(R.id.loginTxt);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Welcome to registration page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Welcome to login page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });



    }
}