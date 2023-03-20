package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.view.LstHotelesContract;

import java.util.ArrayList;

public class Compra_Activity extends AppCompatActivity implements LstHotelesContract.View {

    ImageView flecha;
    Button confirmar;
    Spinner spinnerCines;
    Spinner spinnerHora;
    Spinner spinnerButacas;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compra);

        flecha = (ImageView) findViewById(R.id.idFlechalstPelis);
        confirmar = (Button)findViewById(R.id.buttonCompra);
        spinnerCines = (Spinner)findViewById(R.id.spinnerCine);
        spinnerHora = (Spinner)findViewById(R.id.spinnerHora);
        spinnerButacas = (Spinner)findViewById(R.id.spinnerButaca);



        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        confirmar_compra.class
                );
                startActivity(screenChanger);
            }
        });



        ArrayAdapter<CharSequence>adapter =ArrayAdapter.createFromResource(this,R.array.cine, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence>adapter2 =ArrayAdapter.createFromResource(this,R.array.hora, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        ArrayAdapter<CharSequence>adapter3 =ArrayAdapter.createFromResource(this,R.array.butacas, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);


        spinnerCines.setAdapter(adapter);
        spinnerHora.setAdapter(adapter2);
        spinnerButacas.setAdapter(adapter3);


    }


    @Override
    public void successLstPeliculas(ArrayList<Index> lstIndex) {

    }

    @Override
    public void failureLstPeliculas(String err) {

    }
}