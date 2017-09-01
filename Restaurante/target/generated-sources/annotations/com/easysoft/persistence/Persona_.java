package com.easysoft.persistence;

import com.easysoft.persistence.Pedido;
import com.easysoft.persistence.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-01T14:30:26")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> ciudad;
    public static volatile SingularAttribute<Persona, Integer> idpersona;
    public static volatile SingularAttribute<Persona, String> apellido;
    public static volatile ListAttribute<Persona, Pedido> pedidoList;
    public static volatile SingularAttribute<Persona, Integer> telefono;
    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile SingularAttribute<Persona, Integer> edad;
    public static volatile SingularAttribute<Persona, Usuario> idusuario;

}