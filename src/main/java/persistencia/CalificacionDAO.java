/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import modelo.Calificacion;
import modelo.Dueno;
import modelo.Raza;
import modelo.Reserva;

/**
 *
 * @author agile
 */
public class CalificacionDAO extends DAO<Calificacion> {

    public CalificacionDAO() throws Exception {
        super(Calificacion.class);
        cargarDatos();
    }

    private void cargarDatos() throws Exception {
        if (count() == 0) {

            ReservaDAO reservaDAO = new ReservaDAO();
            List<Reserva> findAllReservas = reservaDAO.findAll();

            Calificacion califiacion = new Calificacion();
            califiacion.setPuntaje(5);
            califiacion.setComentario("Muy recomendadro porque volvio mi perro contento");
            califiacion.setReserva(findAllReservas.remove(0));

            create(califiacion);

        }
    }

}
