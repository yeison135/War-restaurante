package com.easysoft.persistence;

import com.easysoft.persistence.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-01T14:30:26")
@StaticMetamodel(Granos.class)
public class Granos_ { 

    public static volatile SingularAttribute<Granos, Integer> idGranos;
    public static volatile SingularAttribute<Granos, String> fechaAlcualizacion;
    public static volatile ListAttribute<Granos, Menu> menuList;
    public static volatile SingularAttribute<Granos, String> descrpcion;
    public static volatile SingularAttribute<Granos, Integer> costo;

}