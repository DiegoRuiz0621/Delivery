package com.clase.delivelyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class editar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);
    }

    public void Dashboard(View view){
        Intent dashboard = new Intent(this, Dashboard.class);
        startActivity(dashboard);
    }
}