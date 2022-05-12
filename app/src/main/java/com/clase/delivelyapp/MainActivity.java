package com.clase.delivelyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Object editar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }
    
    public void Dashboard(View view){
        Intent dashboard = new Intent(this, Dashboard.class);
        startActivity(dashboard);
    }

    public void Registrar(View view){
        Intent registrar = new Intent(this, Registrate.class);
        startActivity(registrar);
    }

    public void Recuperar(View view){
        Intent RecuperarPassword = new Intent(this, RecuperarPassword.class);
        startActivity(RecuperarPassword);
    }
}