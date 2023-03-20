/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;

/**
 *
 * @author S1-PC52
 */
public class Index {

    ArrayList<Hoteles> peliculas = new ArrayList<Hoteles>();
    ArrayList<Sitios>cines = new ArrayList<Sitios>();
    ArrayList<Hoteles> peliculasDrama = new ArrayList<Hoteles>();
    ArrayList<Hoteles> peliculasDeporte = new ArrayList<Hoteles>();
    ArrayList<Hoteles> peliculasBiografica = new ArrayList<Hoteles>();
    ArrayList<Hoteles> peliculasEpica = new ArrayList<Hoteles>();
    ArrayList<Hoteles> peliculasBelica = new ArrayList<Hoteles>();
    ArrayList<Hoteles> peliculasComedia = new ArrayList<Hoteles>();
    ArrayList<Hoteles> peliculasAcion = new ArrayList<Hoteles>();
    ArrayList<Hoteles> peliculasMasvotadas = new ArrayList<Hoteles>();
    ArrayList<Hoteles> fichatecnica = new ArrayList<Hoteles>();

    public Index() {
    }

    public ArrayList<Hoteles> getFichatecnica() {
        return fichatecnica;
    }

    public void setFichatecnica(ArrayList<Hoteles> fichatecnica) {
        this.fichatecnica = fichatecnica;
    }

    public ArrayList<Hoteles> getPeliculasDrama() {
        return peliculasDrama;
    }

    public void setPeliculasDrama(ArrayList<Hoteles> peliculasDrama) {
        this.peliculasDrama = peliculasDrama;
    }

    public ArrayList<Hoteles> getPeliculasDeporte() {
        return peliculasDeporte;
    }

    public void setPeliculasDeporte(ArrayList<Hoteles> peliculasDeporte) {
        this.peliculasDeporte = peliculasDeporte;
    }

    public ArrayList<Hoteles> getPeliculasBiografica() {
        return peliculasBiografica;
    }

    public void setPeliculasBiografica(ArrayList<Hoteles> peliculasBiografica) {
        this.peliculasBiografica = peliculasBiografica;
    }

    public ArrayList<Hoteles> getPeliculasEpica() {
        return peliculasEpica;
    }

    public void setPeliculasEpica(ArrayList<Hoteles> peliculasEpica) {
        this.peliculasEpica = peliculasEpica;
    }

    public ArrayList<Hoteles> getPeliculasBelica() {
        return peliculasBelica;
    }

    public void setPeliculasBelica(ArrayList<Hoteles> peliculasBelica) {
        this.peliculasBelica = peliculasBelica;
    }

    public ArrayList<Hoteles> getPeliculasComedia() {
        return peliculasComedia;
    }

    public void setPeliculasComedia(ArrayList<Hoteles> peliculasComedia) {
        this.peliculasComedia = peliculasComedia;
    }

    
    
    public ArrayList<Hoteles> getPeliculasAcion() {
        return peliculasAcion;
    }

    public void setPeliculasAcion(ArrayList<Hoteles> peliculasAcion) {
        this.peliculasAcion = peliculasAcion;
    }

    public ArrayList<Hoteles> getPeliculasMasvotadas() {
        return peliculasMasvotadas;
    }

    public void setPeliculasMasvotadas(ArrayList<Hoteles> peliculasMasvotadas) {
        this.peliculasMasvotadas = peliculasMasvotadas;
    }

    public ArrayList<Hoteles> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Hoteles> peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<Sitios> getCines() {
        return cines;
    }

    public void setCines(ArrayList<Sitios> cines) {
        this.cines = cines;
    }
    
    

    public static String toArrayJSon(ArrayList<Index> index) {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
        String resp = gson.toJson(index);

        return resp;
    }

}
