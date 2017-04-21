package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Hospedaje;
import modelo.Perro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-21T10:05:37")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Hospedaje> hospedaje;
    public static volatile SingularAttribute<Reserva, Date> fechaTransaccion;
    public static volatile SingularAttribute<Reserva, Perro> perro;
    public static volatile SingularAttribute<Reserva, Date> fechaInicio;
    public static volatile SingularAttribute<Reserva, Long> id;
    public static volatile SingularAttribute<Reserva, Date> fechaFin;

}