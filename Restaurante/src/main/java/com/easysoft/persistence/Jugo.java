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
@Table(name = "jugo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugo.findAll", query = "SELECT j FROM Jugo j")
    , @NamedQuery(name = "Jugo.findByIdjugo", query = "SELECT j FROM Jugo j WHERE j.idjugo = :idjugo")
    , @NamedQuery(name = "Jugo.findByDescrpcion", query = "SELECT j FROM Jugo j WHERE j.descrpcion = :descrpcion")
    , @NamedQuery(name = "Jugo.findByFechaAlcualizacion", query = "SELECT j FROM Jugo j WHERE j.fechaAlcualizacion = :fechaAlcualizacion")
    , @NamedQuery(name = "Jugo.findByCosto", query = "SELECT j FROM Jugo j WHERE j.costo = :costo")})
public class Jugo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idjugo")
    private Integer idjugo;
    @Size(max = 45)
    @Column(name = "descrpcion")
    private String descrpcion;
    @Size(max = 45)
    @Column(name = "fecha_alcualizacion")
    private String fechaAlcualizacion;
    @Column(name = "costo")
    private Integer costo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idjugo")
    private List<Menu> menuList;

    public Jugo() {
    }

    public Jugo(Integer idjugo) {
        this.idjugo = idjugo;
    }

    public Integer getIdjugo() {
        return idjugo;
    }

    public void setIdjugo(Integer idjugo) {
        this.idjugo = idjugo;
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

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
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
        hash += (idjugo != null ? idjugo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugo)) {
            return false;
        }
        Jugo other = (Jugo) object;
        if ((this.idjugo == null && other.idjugo != null) || (this.idjugo != null && !this.idjugo.equals(other.idjugo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Jugo[ idjugo=" + idjugo + " ]";
    }
    
}
