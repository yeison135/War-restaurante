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
@Table(name = "ensalada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ensalada.findAll", query = "SELECT e FROM Ensalada e")
    , @NamedQuery(name = "Ensalada.findByIdensalada", query = "SELECT e FROM Ensalada e WHERE e.idensalada = :idensalada")
    , @NamedQuery(name = "Ensalada.findByDescrpcion", query = "SELECT e FROM Ensalada e WHERE e.descrpcion = :descrpcion")
    , @NamedQuery(name = "Ensalada.findByFechaAlcualizacion", query = "SELECT e FROM Ensalada e WHERE e.fechaAlcualizacion = :fechaAlcualizacion")
    , @NamedQuery(name = "Ensalada.findByCosto", query = "SELECT e FROM Ensalada e WHERE e.costo = :costo")})
public class Ensalada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idensalada")
    private Integer idensalada;
    @Size(max = 45)
    @Column(name = "descrpcion")
    private String descrpcion;
    @Size(max = 45)
    @Column(name = "fecha_alcualizacion")
    private String fechaAlcualizacion;
    @Column(name = "costo")
    private Integer costo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idensalada")
    private List<Menu> menuList;

    public Ensalada() {
    }

    public Ensalada(Integer idensalada) {
        this.idensalada = idensalada;
    }

    public Integer getIdensalada() {
        return idensalada;
    }

    public void setIdensalada(Integer idensalada) {
        this.idensalada = idensalada;
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
        hash += (idensalada != null ? idensalada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ensalada)) {
            return false;
        }
        Ensalada other = (Ensalada) object;
        if ((this.idensalada == null && other.idensalada != null) || (this.idensalada != null && !this.idensalada.equals(other.idensalada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Ensalada[ idensalada=" + idensalada + " ]";
    }
    
}
