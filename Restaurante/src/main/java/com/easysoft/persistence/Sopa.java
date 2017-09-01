/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easysoft.persistence;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "sopa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sopa.findAll", query = "SELECT s FROM Sopa s")
    , @NamedQuery(name = "Sopa.findByIdSopa", query = "SELECT s FROM Sopa s WHERE s.idSopa = :idSopa")
    , @NamedQuery(name = "Sopa.findByDescrpcion", query = "SELECT s FROM Sopa s WHERE s.descrpcion = :descrpcion")
    , @NamedQuery(name = "Sopa.findByFechaAlcualizacion", query = "SELECT s FROM Sopa s WHERE s.fechaAlcualizacion = :fechaAlcualizacion")
    , @NamedQuery(name = "Sopa.findByCosto", query = "SELECT s FROM Sopa s WHERE s.costo = :costo")})
public class Sopa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSopa")
    private Integer idSopa;
    @Size(max = 45)
    @Column(name = "descrpcion")
    private String descrpcion;
    @Size(max = 45)
    @Column(name = "fecha_alcualizacion")
    private String fechaAlcualizacion;
    @Size(max = 45)
    @Column(name = "costo")
    private String costo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSopa")
    private List<Menu> menuList;

    public Sopa() {
    }

    public Sopa(Integer idSopa) {
        this.idSopa = idSopa;
    }

    public Integer getIdSopa() {
        return idSopa;
    }

    public void setIdSopa(Integer idSopa) {
        this.idSopa = idSopa;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public String getFechaAlcualizacion() {
        return fechaAlcualizacion;
    }

    public void setFechaAlcualizacion(String fechaAlcualizacion) {
        this.fechaAlcualizacion = fechaAlcualizacion;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
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
        hash += (idSopa != null ? idSopa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sopa)) {
            return false;
        }
        Sopa other = (Sopa) object;
        if ((this.idSopa == null && other.idSopa != null) || (this.idSopa != null && !this.idSopa.equals(other.idSopa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Sopa[ idSopa=" + idSopa + " ]";
    }
    
}
