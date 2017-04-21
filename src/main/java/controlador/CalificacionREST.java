/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Calificacion;
import persistencia.CalificacionDAO;

/**
 *
 * @author jorge
 */
@Stateless
@Path("calificacion")
public class CalificacionREST {

    private CalificacionDAO calificacionDAO;

    public CalificacionREST() throws Exception {
        calificacionDAO = new CalificacionDAO();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Calificacion> obtenerCalificaciones() {
        return calificacionDAO.findAll();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void guardarCalificacion(Calificacion calif){
        calificacionDAO.create(calif);
    }
    
}
