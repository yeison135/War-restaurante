/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easysoft.persistence;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "restaurante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restaurante.findAll", query = "SELECT r FROM Restaurante r")
    , @NamedQuery(name = "Restaurante.findByIdrestaurante", query = "SELECT r FROM Restaurante r WHERE r.idrestaurante = :idrestaurante")
    , @NamedQuery(name = "Restaurante.findByNombre", query = "SELECT r FROM Restaurante r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Restaurante.findByDireccion", query = "SELECT r FROM Restaurante r WHERE r.direccion = :direccion")
    , @NamedQuery(name = "Restaurante.findByTelefono", query = "SELECT r FROM Restaurante r WHERE r.telefono = :telefono")
    , @NamedQuery(name = "Restaurante.findByEstado", query = "SELECT r FROM Restaurante r WHERE r.estado = :estado")})
public class Restaurante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrestaurante")
    private Integer idrestaurante;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "telefono")
    private Integer telefono;
    @Size(max = 45)
    @Column(name = "estado")
    private String estado;
    @JoinColumn(name = "menu_idmenu", referencedColumnName = "idmenu")
    @ManyToOne
    private Menu menuIdmenu;
    @JoinColumn(name = "idusuario", referencedColumnName = "idusuario")
    @ManyToOne(optional = false)
    @JsonManagedReference
    private Usuario idusuario;

    public Restaurante() {
    }

    public Restaurante(Integer idrestaurante) {
        this.idrestaurante = idrestaurante;
    }

    public Integer getIdrestaurante() {
        return idrestaurante;
    }

    public void setIdrestaurante(Integer idrestaurante) {
        this.idrestaurante = idrestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Menu getMenuIdmenu() {
        return menuIdmenu;
    }

    public void setMenuIdmenu(Menu menuIdmenu) {
        this.menuIdmenu = menuIdmenu;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrestaurante != null ? idrestaurante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restaurante)) {
            return false;
        }
        Restaurante other = (Restaurante) object;
        if ((this.idrestaurante == null && other.idrestaurante != null) || (this.idrestaurante != null && !this.idrestaurante.equals(other.idrestaurante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Restaurante[ idrestaurante=" + idrestaurante + " ]";
    }
    
}
