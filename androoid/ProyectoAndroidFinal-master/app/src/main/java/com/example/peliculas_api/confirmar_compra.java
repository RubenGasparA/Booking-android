package com.example.peliculas_api;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.view.LstConfirmarContract;

import java.util.ArrayList;

public class confirmar_compra extends AppCompatActivity implements LstConfirmarContract.View {

    TextView compraConfirmada;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmar_compra);

        compraConfirmada = (TextView) findViewById(R.id.textView24);
    }


    @Override
    public void successLstConfirmar(ArrayList<Index> lstIndex) {

    }

    @Override
    public void failureLstConfirmar(String err) {

    }
}