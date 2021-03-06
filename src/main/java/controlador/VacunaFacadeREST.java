/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Vacuna;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import persistencia.VacunaDAO;
import java.util.List;


@RestController
@RequestMapping(value = "/api/vacunas")
public class VacunaFacadeREST {

    public VacunaFacadeREST() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Vacuna> findAll() throws Exception {
        return new VacunaDAO().findAll();
    }

    
}
