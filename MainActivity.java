package com.ben.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOnCampus(View view){
        Intent intent = new Intent(this, OnCampusActivity.class);
        startActivity(intent);
    }

    public void onClickNearCampus(View view){
        Intent intent = new Intent(this, NearCampusActivity.class);
        startActivity(intent);
    }
}
