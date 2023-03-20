/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Sitios;
import Clases.Hoteles;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Motor;

/**
 *
 * @author S1-PC52
 */
public class SitiosDAO implements DAO<Sitios, Integer > {
    
    private static final String SQL_SELECT = "SELECT * FROM CINES WHERE 1=1";

    private Motor motor = null;

    @Override
    public void visualizar(Sitios bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Sitios> findAll(Sitios bean) {
         String sql_filtro = "";
        String sql_final = "";
        ArrayList<Sitios> lstCines = null;
          try {
            this.motor.connect();
            /*Parametrizar la consulta para que pueda filtrar por cualquier campo*/
            /*if(bean!=null){
                /*Quieres filtrar
                if(bean.getId()>0){
                    sql_filtro+=" AND ID=" + bean.getId()+"";
                }//FALSE
                if(bean.getNombre()!= null && bean.getNombre().length()>0){
                    sql_filtro+=" AND NOMBRE='" + bean.getNombre() + "'";

                }
                 if(bean.getSinopsis()!= null && bean.getSinopsis().length()>0){
                    sql_filtro+=" AND SINOPSIS LIKE '%" + bean.getSinopsis()+ "%' ";
                }
                //SELECT * FROM `pelicula` WHERE `SINOPSIS` LIKE '%Wallace%'
            }*/
            sql_final = SQL_SELECT + sql_filtro;
            // SELECT * FROM PELICULA WHERE 1=! AND NOMBRE='300' AND SINOPOSIS etc!!!
            ResultSet resultset = 
                    this.motor.executeQuery(sql_final);
             
            // TRANSFORMADOR
            if(resultset!=null){
                    lstCines = new ArrayList();

                    while(resultset.next()){// 300, Braveheart
                        Sitios cine = new Sitios();
                        cine.setIdCine(resultset.getInt(1));
                        cine.setDireccion(resultset.getString(2));
                        cine.setCapacidad(resultset.getInt(3));
                        cine.setButacasLibres(resultset.getInt(4));
                        cine.setButacasOcupadas(resultset.getInt(5));
                        lstCines.add(cine);
                    }
            }
            this.motor.disconnect();
        } catch (Exception ex) {
                
        }
        return lstCines;
    }

    @Override
    public void find(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
