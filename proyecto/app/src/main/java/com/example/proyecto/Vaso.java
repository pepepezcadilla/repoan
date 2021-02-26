package com.example.proyecto;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.Toast;

public class Vaso extends View {

    int alto, ancho;
    int finale, aux;

    public Vaso(Context context) {
        super(context);

        finale = 0;
    }

    public Vaso(Context context, int finale) {
        super(context);

        this.finale = finale;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        alto = canvas.getHeight();
        ancho = canvas.getWidth();
        aux = 100-finale;

        Paint vaso = new Paint();
        vaso.setARGB(255,120,120,120);
        canvas.drawRect(ancho/5,alto/100,(ancho/5)*4,alto,vaso);

        vaso.setARGB(255,255,255,255);
        canvas.drawRect(ancho/5+50,alto/100,(ancho/5)*4-50,alto-50,vaso);

        vaso.setARGB(255,255,255,0);
        canvas.drawRect(ancho/5+50,alto/100*aux,(ancho/5)*4-50,alto-50,vaso);


    }
}
