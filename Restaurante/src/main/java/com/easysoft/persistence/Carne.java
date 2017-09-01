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
@Table(name = "carne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Carne.findAll", query = "SELECT c FROM Carne c")
    , @NamedQuery(name = "Carne.findByIdcarne", query = "SELECT c FROM Carne c WHERE c.idcarne = :idcarne")
    , @NamedQuery(name = "Carne.findByDescrpcion", query = "SELECT c FROM Carne c WHERE c.descrpcion = :descrpcion")
    , @NamedQuery(name = "Carne.findByFechaAlcualizacion", query = "SELECT c FROM Carne c WHERE c.fechaAlcualizacion = :fechaAlcualizacion")
    , @NamedQuery(name = "Carne.findByCosto", query = "SELECT c FROM Carne c WHERE c.costo = :costo")})
public class Carne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcarne")
    private Integer idcarne;
    @Size(max = 45)
    @Column(name = "descrpcion")
    private String descrpcion;
    @Size(max = 45)
    @Column(name = "fecha_alcualizacion")
    private String fechaAlcualizacion;
    @Column(name = "costo")
    private Integer costo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcarne")
    private List<Menu> menuList;

    public Carne() {
    }

    public Carne(Integer idcarne) {
        this.idcarne = idcarne;
    }

    public Integer getIdcarne() {
        return idcarne;
    }

    public void setIdcarne(Integer idcarne) {
        this.idcarne = idcarne;
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
        hash += (idcarne != null ? idcarne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carne)) {
            return false;
        }
        Carne other = (Carne) object;
        if ((this.idcarne == null && other.idcarne != null) || (this.idcarne != null && !this.idcarne.equals(other.idcarne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Carne[ idcarne=" + idcarne + " ]";
    }
    
}
