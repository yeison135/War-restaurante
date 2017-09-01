package com.easysoft.persistence;

import com.easysoft.persistence.Menu;
import com.easysoft.persistence.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-01T14:30:26")
@StaticMetamodel(Restaurante.class)
public class Restaurante_ { 

    public static volatile SingularAttribute<Restaurante, String> estado;
    public static volatile SingularAttribute<Restaurante, String> direccion;
    public static volatile SingularAttribute<Restaurante, Integer> idrestaurante;
    public static volatile SingularAttribute<Restaurante, Integer> telefono;
    public static volatile SingularAttribute<Restaurante, Menu> menuIdmenu;
    public static volatile SingularAttribute<Restaurante, String> nombre;
    public static volatile SingularAttribute<Restaurante, Usuario> idusuario;

}