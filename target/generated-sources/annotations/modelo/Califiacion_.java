package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Reserva;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-21T10:05:37")
@StaticMetamodel(Califiacion.class)
public class Califiacion_ { 

    public static volatile SingularAttribute<Calificacion, Integer> puntaje;
    public static volatile SingularAttribute<Calificacion, Long> id;
    public static volatile SingularAttribute<Calificacion, String> comentario;
    public static volatile SingularAttribute<Calificacion, Reserva> reserva;

}