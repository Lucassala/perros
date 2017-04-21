package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cuidador;
import modelo.Direccion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-21T10:05:37")
@StaticMetamodel(Hospedaje.class)
public class Hospedaje_ { 

    public static volatile SingularAttribute<Hospedaje, Direccion> direccion;
    public static volatile SingularAttribute<Hospedaje, Cuidador> cuidador;
    public static volatile SingularAttribute<Hospedaje, Long> id;
    public static volatile SingularAttribute<Hospedaje, String> nombre;

}