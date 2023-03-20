package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.entities.Hoteles;
import com.example.peliculas_api.presenter.LstHotelesPresenter;
import com.example.peliculas_api.view.LstHotelesContract;

import java.util.ArrayList;


public class Ficha_tecnica extends AppCompatActivity implements LstHotelesContract.View {

   private LstHotelesPresenter lstPeliculasPresenter;
   private TextView nombre;
   private TextView director;
   private TextView pais;
   private TextView ano;
   private TextView duracion;
   private TextView genero;
   private TextView calificacion;
   private TextView reparto;
   private TextView trailer;
   ImageView flecha;
   Button comprarEntrada;
   private Integer id;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_tecnica);

        initComponents();
        initPresenter();
        initData();

        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Filtros_hoteles_Activity.class
                );
                startActivity(screenChanger);
            }
        });

        comprarEntrada = (Button)findViewById(R.id.botonComprarEntradaPeli);
        comprarEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Compra_Activity.class
                );
                startActivity(screenChanger);
            }
        });
    }


    private void initComponents(){
        flecha = findViewById(R.id.idFlechalstPelis);
        nombre = findViewById(R.id.idTitulo);
        director = findViewById(R.id.idDireccion);
        pais = findViewById(R.id.idPais);
        ano = findViewById(R.id.idAno);
        duracion = findViewById(R.id.idDuracion);
        genero = findViewById(R.id.idGenero);
        calificacion = findViewById(R.id.idCalificacion);
        reparto = findViewById(R.id.idReparto);
        trailer = findViewById(R.id.idTrailer);
    }

    public  void initPresenter(){
        lstPeliculasPresenter = new LstHotelesPresenter(this);
    }

    public void initData(){
        lstPeliculasPresenter.lstPeliculas(null);
    }

    @Override
    public void successLstPeliculas(ArrayList<Index> lstIndex) {
              for (Hoteles peliculas: lstIndex.get(0).getPeliculasFicha()){
                  Bundle miBundle = this.getIntent().getExtras();
                  if(miBundle!=null){
                      id = miBundle.getInt("idPeli");
                      if (id.equals(peliculas.getId_pelicula())){
                          nombre.setText(peliculas.getNombre());
                          director.setText(peliculas.getDirector());
                          pais.setText(peliculas.getPais());
                         // ano.setText(peliculas.getAno());
                          duracion.setText(peliculas.getDuracion());
                          genero.setText(peliculas.getGenero());
                          reparto.setText(peliculas.getInterpretes());
                          trailer.setText(peliculas.getTrailer());
                          calificacion.setText(peliculas.getClasificacion());
                      }
                  }
              }
    }

    @Override
    public void failureLstPeliculas(String err) {
        Toast.makeText(this,err, Toast.LENGTH_LONG).show();
    }
}