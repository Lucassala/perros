package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Dueno;
import modelo.Raza;
import modelo.Tamanio;
import modelo.Vacuna;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-04-21T10:05:37")
@StaticMetamodel(Perro.class)
public class Perro_ { 

    public static volatile SingularAttribute<Perro, Dueno> dueno;
    public static volatile SingularAttribute<Perro, Raza> raza;
    public static volatile SingularAttribute<Perro, String> fotoRuta;
    public static volatile SingularAttribute<Perro, Tamanio> tamanio;
    public static volatile ListAttribute<Perro, Vacuna> vacunacionList;
    public static volatile SingularAttribute<Perro, Long> id;
    public static volatile SingularAttribute<Perro, String> comentario;
    public static volatile SingularAttribute<Perro, String> nombre;

}