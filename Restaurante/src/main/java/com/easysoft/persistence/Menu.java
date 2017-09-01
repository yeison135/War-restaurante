/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easysoft.persistence;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m")
    , @NamedQuery(name = "Menu.findByIdmenu", query = "SELECT m FROM Menu m WHERE m.idmenu = :idmenu")})
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmenu")
    private Integer idmenu;
    @OneToMany(mappedBy = "menuIdmenu")
    private List<Restaurante> restauranteList;
    @JoinColumn(name = "idGranos", referencedColumnName = "idGranos")
    @ManyToOne(optional = false)
    private Granos idGranos;
    @JoinColumn(name = "idcarne", referencedColumnName = "idcarne")
    @ManyToOne(optional = false)
    private Carne idcarne;
    @JoinColumn(name = "idensalada", referencedColumnName = "idensalada")
    @ManyToOne(optional = false)
    private Ensalada idensalada;
    @JoinColumn(name = "idfruta", referencedColumnName = "idfruta")
    @ManyToOne(optional = false)
    private Fruta idfruta;
    @JoinColumn(name = "idjugo", referencedColumnName = "idjugo")
    @ManyToOne(optional = false)
    private Jugo idjugo;
    @JoinColumn(name = "idpedido", referencedColumnName = "idpedido")
    @ManyToOne(optional = false)
    private Pedido idpedido;
    @JoinColumn(name = "idSopa", referencedColumnName = "idSopa")
    @ManyToOne(optional = false)
    private Sopa idSopa;
    @JoinColumn(name = "idtipo_menu", referencedColumnName = "idtipo_menu")
    @ManyToOne(optional = false)
    private TipoMenu idtipoMenu;

    public Menu() {
    }

    public Menu(Integer idmenu) {
        this.idmenu = idmenu;
    }

    public Integer getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Integer idmenu) {
        this.idmenu = idmenu;
    }

    @XmlTransient
    public List<Restaurante> getRestauranteList() {
        return restauranteList;
    }

    public void setRestauranteList(List<Restaurante> restauranteList) {
        this.restauranteList = restauranteList;
    }

    public Granos getIdGranos() {
        return idGranos;
    }

    public void setIdGranos(Granos idGranos) {
        this.idGranos = idGranos;
    }

    public Carne getIdcarne() {
        return idcarne;
    }

    public void setIdcarne(Carne idcarne) {
        this.idcarne = idcarne;
    }

    public Ensalada getIdensalada() {
        return idensalada;
    }

    public void setIdensalada(Ensalada idensalada) {
        this.idensalada = idensalada;
    }

    public Fruta getIdfruta() {
        return idfruta;
    }

    public void setIdfruta(Fruta idfruta) {
        this.idfruta = idfruta;
    }

    public Jugo getIdjugo() {
        return idjugo;
    }

    public void setIdjugo(Jugo idjugo) {
        this.idjugo = idjugo;
    }

    public Pedido getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Pedido idpedido) {
        this.idpedido = idpedido;
    }

    public Sopa getIdSopa() {
        return idSopa;
    }

    public void setIdSopa(Sopa idSopa) {
        this.idSopa = idSopa;
    }

    public TipoMenu getIdtipoMenu() {
        return idtipoMenu;
    }

    public void setIdtipoMenu(TipoMenu idtipoMenu) {
        this.idtipoMenu = idtipoMenu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmenu != null ? idmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idmenu == null && other.idmenu != null) || (this.idmenu != null && !this.idmenu.equals(other.idmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Menu[ idmenu=" + idmenu + " ]";
    }
    
}
