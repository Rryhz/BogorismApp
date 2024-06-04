package com.example.bogorismapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bogorismapp.login.LoginPage;

public class PreHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_home_page);

        Button expore_button = findViewById(R.id.explore_button);
        expore_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreHomePage.this, LoginPage.class);
                startActivity(intent);
            }
        });
    }
}