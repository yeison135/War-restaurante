package com.easysoft.persistence;

import com.easysoft.persistence.Persona;
import com.easysoft.persistence.Restaurante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-01T14:30:26")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, Restaurante> restauranteList;
    public static volatile SingularAttribute<Usuario, String> estado;
    public static volatile ListAttribute<Usuario, Persona> personaList;
    public static volatile SingularAttribute<Usuario, String> categoria;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile SingularAttribute<Usuario, String> usuariocol;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;

}