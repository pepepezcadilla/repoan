package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button jugar, opciones, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jugar = findViewById(R.id.jugar);
        opciones = findViewById(R.id.opciones);
        salir = findViewById(R.id.salir);

    }

    public void jugar(View view){
        Intent intent = new Intent(this.getApplicationContext(), jugar.class);
        startActivity(intent);
    }

    public void opciones(View view){
        Intent intent = new Intent(this.getApplicationContext(), opciones.class);
        startActivity(intent);
    }

    public void salir(View view){
        System.exit(0);
    }
}