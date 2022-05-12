package com.clase.delivelyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dominos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dominos);
    }

    public void Pedido(View view){
        Intent Pedido = new Intent(this, Pedido.class);
        startActivity(Pedido);
    }
}