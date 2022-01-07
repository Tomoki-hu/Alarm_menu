package com.example.alarm_menu;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
        Intent intent = new Intent(getApplication(), AlarmListActivity.class);
        startActivity(intent);
        });
        }
    }

