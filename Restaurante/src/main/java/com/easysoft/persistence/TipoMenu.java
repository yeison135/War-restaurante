/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easysoft.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "tipo_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoMenu.findAll", query = "SELECT t FROM TipoMenu t")
    , @NamedQuery(name = "TipoMenu.findByIdtipoMenu", query = "SELECT t FROM TipoMenu t WHERE t.idtipoMenu = :idtipoMenu")
    , @NamedQuery(name = "TipoMenu.findByNombre", query = "SELECT t FROM TipoMenu t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "TipoMenu.findByFecha", query = "SELECT t FROM TipoMenu t WHERE t.fecha = :fecha")})
public class TipoMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipo_menu")
    private Integer idtipoMenu;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtipoMenu")
    private List<Menu> menuList;

    public TipoMenu() {
    }

    public TipoMenu(Integer idtipoMenu) {
        this.idtipoMenu = idtipoMenu;
    }

    public Integer getIdtipoMenu() {
        return idtipoMenu;
    }

    public void setIdtipoMenu(Integer idtipoMenu) {
        this.idtipoMenu = idtipoMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoMenu != null ? idtipoMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMenu)) {
            return false;
        }
        TipoMenu other = (TipoMenu) object;
        if ((this.idtipoMenu == null && other.idtipoMenu != null) || (this.idtipoMenu != null && !this.idtipoMenu.equals(other.idtipoMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.TipoMenu[ idtipoMenu=" + idtipoMenu + " ]";
    }
    
}
