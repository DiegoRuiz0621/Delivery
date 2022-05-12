package com.clase.delivelyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RecuperarPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_password);
    }
    public void Cancelar(View view){
        Intent mainActity = new Intent(this, MainActivity.class);
        startActivity(mainActity);
    }

}