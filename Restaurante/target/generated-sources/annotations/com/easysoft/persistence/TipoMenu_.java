package com.easysoft.persistence;

import com.easysoft.persistence.Menu;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-01T14:30:26")
@StaticMetamodel(TipoMenu.class)
public class TipoMenu_ { 

    public static volatile SingularAttribute<TipoMenu, Date> fecha;
    public static volatile ListAttribute<TipoMenu, Menu> menuList;
    public static volatile SingularAttribute<TipoMenu, String> nombre;
    public static volatile SingularAttribute<TipoMenu, Integer> idtipoMenu;

}