package com.example.nuevaaplicacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout fondo;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fondo = findViewById(R.id.idFondo);
        texto = findViewById(R.id.idTexto);

        fondo.setOnClickListener(new View.OnClickListener() {

            Colores ob = new Colores();
            Colores ob1=new Colores();
            @Override
            public void onClick(View view) {
                fondo.setBackgroundColor(ob.genColor());
                texto.setTextColor(ob1.genColor1());

                texto.setTranslationY(texto.getTranslationY()+20);
                texto.invalidate();

            }
        });
    }
}