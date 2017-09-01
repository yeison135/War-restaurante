package com.easysoft.persistence;

import com.easysoft.persistence.Carne;
import com.easysoft.persistence.Ensalada;
import com.easysoft.persistence.Fruta;
import com.easysoft.persistence.Granos;
import com.easysoft.persistence.Jugo;
import com.easysoft.persistence.Pedido;
import com.easysoft.persistence.Restaurante;
import com.easysoft.persistence.Sopa;
import com.easysoft.persistence.TipoMenu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-01T14:30:26")
@StaticMetamodel(Menu.class)
public class Menu_ { 

    public static volatile ListAttribute<Menu, Restaurante> restauranteList;
    public static volatile SingularAttribute<Menu, Granos> idGranos;
    public static volatile SingularAttribute<Menu, Ensalada> idensalada;
    public static volatile SingularAttribute<Menu, Jugo> idjugo;
    public static volatile SingularAttribute<Menu, Carne> idcarne;
    public static volatile SingularAttribute<Menu, Pedido> idpedido;
    public static volatile SingularAttribute<Menu, Integer> idmenu;
    public static volatile SingularAttribute<Menu, Sopa> idSopa;
    public static volatile SingularAttribute<Menu, Fruta> idfruta;
    public static volatile SingularAttribute<Menu, TipoMenu> idtipoMenu;

}