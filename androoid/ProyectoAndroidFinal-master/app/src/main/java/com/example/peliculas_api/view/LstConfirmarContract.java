package com.example.peliculas_api.view;

import com.example.peliculas_api.entities.Index;

import java.util.ArrayList;

public interface LstConfirmarContract {
    public  interface  View{
        void successLstConfirmar(ArrayList<Index> lstIndex);
        void failureLstConfirmar(String err);
    }
    public interface  Presenter{
        void lstConfirmar(Index index);
    }
    public interface  Model{
        interface  OnLstConfirmarListener{
            void  onSuccess(ArrayList<Index> index);
            void  onFailure(String error);
        }
        void ConfirmarWS(Index index, OnLstConfirmarListener onLstConfirmarListener);

    }
}
