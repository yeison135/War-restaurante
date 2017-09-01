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
@Table(name = "granos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Granos.findAll", query = "SELECT g FROM Granos g")
    , @NamedQuery(name = "Granos.findByIdGranos", query = "SELECT g FROM Granos g WHERE g.idGranos = :idGranos")
    , @NamedQuery(name = "Granos.findByDescrpcion", query = "SELECT g FROM Granos g WHERE g.descrpcion = :descrpcion")
    , @NamedQuery(name = "Granos.findByFechaAlcualizacion", query = "SELECT g FROM Granos g WHERE g.fechaAlcualizacion = :fechaAlcualizacion")
    , @NamedQuery(name = "Granos.findByCosto", query = "SELECT g FROM Granos g WHERE g.costo = :costo")})
public class Granos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idGranos")
    private Integer idGranos;
    @Size(max = 45)
    @Column(name = "descrpcion")
    private String descrpcion;
    @Size(max = 45)
    @Column(name = "fecha_alcualizacion")
    private String fechaAlcualizacion;
    @Column(name = "costo")
    private Integer costo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGranos")
    private List<Menu> menuList;

    public Granos() {
    }

    public Granos(Integer idGranos) {
        this.idGranos = idGranos;
    }

    public Integer getIdGranos() {
        return idGranos;
    }

    public void setIdGranos(Integer idGranos) {
        this.idGranos = idGranos;
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
        hash += (idGranos != null ? idGranos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Granos)) {
            return false;
        }
        Granos other = (Granos) object;
        if ((this.idGranos == null && other.idGranos != null) || (this.idGranos != null && !this.idGranos.equals(other.idGranos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Granos[ idGranos=" + idGranos + " ]";
    }
    
}
