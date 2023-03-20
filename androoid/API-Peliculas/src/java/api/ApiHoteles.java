/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import Clases.Index;
import Clases.Hoteles;
import DAO.SitiosDAO;
import DAO.HotelesDAO;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author S1-PC52
 */
@Path("api")
public class ApiHoteles {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApiPeliculas
     */
    public ApiHoteles() {
    }

    /**
     * Retrieves representation of an instance of api.ApiPeliculas
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {

        HotelesDAO peliculaDAO = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculas
                = peliculaDAO.findAll(null);
        
        SitiosDAO cineDAO = new SitiosDAO();
        ArrayList<Hoteles> lstCines
                = peliculaDAO.findAll(null);
        
 

                        // Transformar de ArrayList a JSON
        HotelesDAO peliculaDrama = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculasDrama
                = peliculaDrama.getGeneroDrama(null);

        HotelesDAO peliculaDeporte = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculasDeporte
                = peliculaDeporte.getGeneroDeporte(null);

        HotelesDAO peliculaBiografica = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculasBiografica
                = peliculaBiografica.getGeneroBiografica(null);
        
        HotelesDAO peliculaEpica = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculasEpica
                = peliculaEpica.getGeneroEpica(null);
        
        HotelesDAO peliculaBelica = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculasBelica
                = peliculaBelica.getGeneroBelica(null);
        
        HotelesDAO peliculaComedia = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculasComedia
                = peliculaComedia.getGeneroComedia(null);

                        // Transformar de ArrayList a JSON
        HotelesDAO peliculaAccion = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculasAccion
                = peliculaAccion.getGeneroAccion(null);

        HotelesDAO peliculaMasvotadas = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculasMasvotadas
                = peliculaMasvotadas.pelisMasvotadas(null);

        HotelesDAO peliculaFichatecnica = new HotelesDAO();
        ArrayList<Hoteles> lstPeliculasFicha
                = peliculaFichatecnica.getFichaTecnica(null);

        Index index = new Index();
        index.setPeliculas(lstPeliculas);
        index.setPeliculasDrama(lstPeliculasDrama);
        index.setPeliculasDeporte(lstPeliculasDeporte);
        index.setPeliculasBiografica(lstPeliculasBiografica);
        index.setPeliculasEpica(lstPeliculasEpica);
        index.setPeliculasBelica(lstPeliculasBelica);
        index.setPeliculasComedia(lstPeliculasComedia);
        index.setPeliculasAcion(lstPeliculasAccion);
        index.setPeliculasMasvotadas(lstPeliculasMasvotadas);
        index.setFichatecnica(lstPeliculasFicha);

        ArrayList<Index> lstIndex = new ArrayList<Index>();
        lstIndex.add(index);

        return Index.toArrayJSon(lstIndex);

    }

    /**
     * PUT method for updating or creating an instance of ApiPeliculas
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
