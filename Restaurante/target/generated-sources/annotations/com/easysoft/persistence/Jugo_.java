package com.easysoft.persistence;

import com.easysoft.persistence.Menu;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-01T14:30:26")
@StaticMetamodel(Jugo.class)
public class Jugo_ { 

    public static volatile SingularAttribute<Jugo, Integer> idjugo;
    public static volatile SingularAttribute<Jugo, String> fechaAlcualizacion;
    public static volatile ListAttribute<Jugo, Menu> menuList;
    public static volatile SingularAttribute<Jugo, String> descrpcion;
    public static volatile SingularAttribute<Jugo, Integer> costo;

}