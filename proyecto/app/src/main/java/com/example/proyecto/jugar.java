package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class jugar extends AppCompatActivity {

    Button porciento, minas, atras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);

        porciento = findViewById(R.id.porciento);
        minas = findViewById(R.id.minas);
        atras = findViewById(R.id.atras);

    }

    public void porciento(View view){
        Intent intent = new Intent(this.getApplicationContext(), porcentajeitor.class);
        startActivity(intent);
    }

    public void minas(View view){
        Intent intent = new Intent(this.getApplicationContext(), buscaminas.class);
        startActivity(intent);
    }

    public void atras(View view){
        Intent intent = new Intent(this.getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}