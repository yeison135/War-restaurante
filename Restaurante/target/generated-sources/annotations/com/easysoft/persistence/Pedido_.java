package com.easysoft.persistence;

import com.easysoft.persistence.Costo;
import com.easysoft.persistence.Menu;
import com.easysoft.persistence.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-01T14:30:26")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile ListAttribute<Pedido, Menu> menuList;
    public static volatile SingularAttribute<Pedido, String> pedidocol;
    public static volatile SingularAttribute<Pedido, String> mesa;
    public static volatile SingularAttribute<Pedido, Integer> idpedido;
    public static volatile ListAttribute<Pedido, Costo> costoList;
    public static volatile SingularAttribute<Pedido, Date> fechaPedido;
    public static volatile SingularAttribute<Pedido, Persona> personaIdpersona;

}