package com.easysoft.persistence;

import com.easysoft.persistence.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-01T14:30:26")
@StaticMetamodel(Ensalada.class)
public class Ensalada_ { 

    public static volatile SingularAttribute<Ensalada, Integer> idensalada;
    public static volatile SingularAttribute<Ensalada, String> fechaAlcualizacion;
    public static volatile ListAttribute<Ensalada, Menu> menuList;
    public static volatile SingularAttribute<Ensalada, String> descrpcion;
    public static volatile SingularAttribute<Ensalada, Integer> costo;

}