/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Reserva;
import persistencia.ReservaDAO;

/**
 *
 * @author jorge
 */
@Stateless
@Path("reserva")
public class ReservaREST {
    
    private ReservaDAO reservaDAO;

    public ReservaREST() throws Exception {
        reservaDAO = new ReservaDAO();
    }
    
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Reserva> findAll() throws Exception {
        List<Reserva> findAll = reservaDAO.findAll();
        return findAll;
    }
}
