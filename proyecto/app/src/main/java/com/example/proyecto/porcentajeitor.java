package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class porcentajeitor extends AppCompatActivity {

    Button atras,empezarse;
    RelativeLayout layout;
    TextView patata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porcentajeitor);

        atras = findViewById(R.id.atras_porc);
        empezarse = findViewById(R.id.empezar);
        layout = findViewById(R.id.layout);
        patata = findViewById(R.id.porcientaje);

        Vaso v = new Vaso(this);
        layout.addView(v);

    }

    public void numero(View v){
        int randoms = (int) (Math.random()*100);
        int finale = 0;

        //Toast.makeText(this.getApplicationContext(),""+randoms, Toast.LENGTH_SHORT).show();
        if (randoms<15){
            finale = (int) (Math.random()*5+10);
            //Toast.makeText(this.getApplicationContext(),""+finale, Toast.LENGTH_SHORT).show();
        }else if (randoms>=15 && randoms<70){
            finale = (int) (Math.random()*15+15);
            //Toast.makeText(this.getApplicationContext(),""+finale, Toast.LENGTH_SHORT).show();
        }else if (randoms>=70){
            finale = (int) (Math.random()*20+30);
            //Toast.makeText(this.getApplicationContext(),""+finale, Toast.LENGTH_SHORT).show();
        }

        patata.setTextSize(70);
        patata.setTextColor(Color.BLACK);
        patata.setText(finale+"%");

        v = new Vaso(this, finale);
        layout.addView(v);
    }

    public void atras(View patata){
        Intent intent = new Intent(this.getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

}