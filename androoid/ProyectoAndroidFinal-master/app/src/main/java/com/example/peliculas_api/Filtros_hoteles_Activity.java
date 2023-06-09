package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Filtros_hoteles_Activity extends AppCompatActivity {

    ImageView flecha;
    EditText filtro;
    Button buscar;
    Button pelicula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filtros_peliculas);

        flecha = (ImageView) findViewById(R.id.idFlecha);

        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        MainActivity2.class
                );
                startActivity(screenChanger);
            }
        });

        filtro = (EditText) findViewById(R.id.idFiltro);
        buscar = (Button) findViewById(R.id.idBtnBuscar);


        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent screenChanger = new Intent(getBaseContext(),
                        lstHoteles.class
                );
                Bundle filtroBundle = new Bundle();
                filtroBundle.putString("Filtro",filtro.getText().toString());

                screenChanger.putExtras(filtroBundle);

                startActivity(screenChanger);

            }
        });

        pelicula = (Button) findViewById(R.id.idMostrarPeli);
        pelicula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        lstHoteles.class
                );
                startActivity(screenChanger);
            }
        });




    }


}