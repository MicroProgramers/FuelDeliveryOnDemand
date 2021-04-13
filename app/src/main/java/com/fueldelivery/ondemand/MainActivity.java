package com.fueldelivery.ondemand;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fueldelivery.ondemand.Admin.Activity.AdminActivity;
import com.fueldelivery.ondemand.Driver.Activity.DriverActivity;
import com.fueldelivery.ondemand.User.Activity.UserActivity;

public class MainActivity extends AppCompatActivity {

    AppCompatButton user_btn, driver_btn, admin_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_btn = findViewById(R.id.user_btn);
        driver_btn = findViewById(R.id.driver_btn);
        admin_btn = findViewById(R.id.admin_btn);


        user_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent);
            }
        });
        driver_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DriverActivity.class);
                startActivity(intent);
            }
        });
        admin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AdminActivity.class);
                startActivity(intent);
            }
        });

    }
}