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
@Table(name = "fruta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fruta.findAll", query = "SELECT f FROM Fruta f")
    , @NamedQuery(name = "Fruta.findByIdfruta", query = "SELECT f FROM Fruta f WHERE f.idfruta = :idfruta")
    , @NamedQuery(name = "Fruta.findByDescrpcion", query = "SELECT f FROM Fruta f WHERE f.descrpcion = :descrpcion")
    , @NamedQuery(name = "Fruta.findByFechaAlcualizacion", query = "SELECT f FROM Fruta f WHERE f.fechaAlcualizacion = :fechaAlcualizacion")
    , @NamedQuery(name = "Fruta.findByCosto", query = "SELECT f FROM Fruta f WHERE f.costo = :costo")})
public class Fruta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfruta")
    private Integer idfruta;
    @Size(max = 45)
    @Column(name = "descrpcion")
    private String descrpcion;
    @Size(max = 45)
    @Column(name = "fecha_alcualizacion")
    private String fechaAlcualizacion;
    @Column(name = "costo")
    private Integer costo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idfruta")
    private List<Menu> menuList;

    public Fruta() {
    }

    public Fruta(Integer idfruta) {
        this.idfruta = idfruta;
    }

    public Integer getIdfruta() {
        return idfruta;
    }

    public void setIdfruta(Integer idfruta) {
        this.idfruta = idfruta;
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
        hash += (idfruta != null ? idfruta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fruta)) {
            return false;
        }
        Fruta other = (Fruta) object;
        if ((this.idfruta == null && other.idfruta != null) || (this.idfruta != null && !this.idfruta.equals(other.idfruta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Fruta[ idfruta=" + idfruta + " ]";
    }
    
}
