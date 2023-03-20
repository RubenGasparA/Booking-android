package com.example.peliculas_api.entities;


import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Index {
/*    @SerializedName("cines")
    private ArrayList<Cines> cines;*/

    @SerializedName("peliculas")
    private ArrayList<Hoteles> peliculas;

    public ArrayList<Hoteles> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Hoteles> peliculas) {
        this.peliculas = peliculas;
    }

   @SerializedName("peliculasDrama")
    private ArrayList<Hoteles> peliculasdrama;

    public ArrayList<Hoteles> getPeliculasDrama() {
        return peliculasdrama;
    }

    public void setPeliculasDrama(ArrayList<Hoteles> peliculasdrama) {
        this.peliculasdrama = peliculasdrama;
    }

    @SerializedName("peliculasDeporte")
    private ArrayList<Hoteles> peliculasdeporte;

    public ArrayList<Hoteles> getPeliculasDeporte() {
        return peliculasdeporte;
    }

    @SerializedName("peliculasBiografica")
    private ArrayList<Hoteles> peliculasbiografica;

    public ArrayList<Hoteles> getPeliculasBiografica() {
        return peliculasbiografica;
    }

    public void setPeliculasBiografica(ArrayList<Hoteles> peliculasbiografica) {
        this.peliculasbiografica = peliculasbiografica;
    }

    @SerializedName("peliculasEpica")
    private ArrayList<Hoteles> peliculasepica;

    public ArrayList<Hoteles> getPeliculasEpica() {
        return peliculasepica;
    }

    public void setPeliculasEpica(ArrayList<Hoteles> peliculasepica) {
        this.peliculasepica = peliculasepica;
    }

    @SerializedName("peliculasBelica")
    private ArrayList<Hoteles> peliculasbelica;

    public ArrayList<Hoteles> getPeliculasBelica() {
        return peliculasbelica;
    }

    public void setPeliculasBelica(ArrayList<Hoteles> peliculasbelica) {
        this.peliculasbelica = peliculasbelica;
    }

    @SerializedName("peliculasComedia")
    private ArrayList<Hoteles> peliculascomedia;

    public ArrayList<Hoteles> getPeliculasComedia() {
        return peliculascomedia;
    }

    public void setPeliculasComedia(ArrayList<Hoteles> peliculascomedia) {
        this.peliculascomedia = peliculascomedia;
    }

    @SerializedName("peliculasAcion")
    private ArrayList<Hoteles> peliculasaccion;

    public ArrayList<Hoteles> getPeliculasAccion() {
        return peliculasaccion;
    }

    public void setPeliculasAccion(ArrayList<Hoteles> peliculasaccion) {
        this.peliculasaccion = peliculasaccion;
    }

    @SerializedName("peliculasMasvotadas")
    private ArrayList<Hoteles> peliculasMasvotadas;

    public ArrayList<Hoteles> getPeliculasMasvotadas() {
        return peliculasMasvotadas;
    }

    public void setPeliculasMasvotadas(ArrayList<Hoteles> peliculasMasvotadas) {
        this.peliculasMasvotadas = peliculasMasvotadas;
    }

    @SerializedName("fichatecnica")
    private ArrayList<Hoteles> peliculasFicha;

    public ArrayList<Hoteles> getPeliculasFicha() {
        return peliculasFicha;
    }

    public void setPeliculasFicha(ArrayList<Hoteles> peliculasFicha) {
        this.peliculasFicha = peliculasFicha;
    }
}
