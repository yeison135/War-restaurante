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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByIdpedido", query = "SELECT p FROM Pedido p WHERE p.idpedido = :idpedido")
    , @NamedQuery(name = "Pedido.findByFechaPedido", query = "SELECT p FROM Pedido p WHERE p.fechaPedido = :fechaPedido")
    , @NamedQuery(name = "Pedido.findByMesa", query = "SELECT p FROM Pedido p WHERE p.mesa = :mesa")
    , @NamedQuery(name = "Pedido.findByPedidocol", query = "SELECT p FROM Pedido p WHERE p.pedidocol = :pedidocol")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpedido")
    private Integer idpedido;
    @Column(name = "fecha_pedido")
    @Temporal(TemporalType.DATE)
    private Date fechaPedido;
    @Size(max = 45)
    @Column(name = "mesa")
    private String mesa;
    @Size(max = 45)
    @Column(name = "pedidocol")
    private String pedidocol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoIdpedido")
    private List<Costo> costoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpedido")
    private List<Menu> menuList;
    @JoinColumn(name = "persona_idpersona", referencedColumnName = "idpersona")
    @ManyToOne(optional = false)
    private Persona personaIdpersona;

    public Pedido() {
    }

    public Pedido(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public Integer getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getPedidocol() {
        return pedidocol;
    }

    public void setPedidocol(String pedidocol) {
        this.pedidocol = pedidocol;
    }

    @XmlTransient
    public List<Costo> getCostoList() {
        return costoList;
    }

    public void setCostoList(List<Costo> costoList) {
        this.costoList = costoList;
    }

    @XmlTransient
    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public Persona getPersonaIdpersona() {
        return personaIdpersona;
    }

    public void setPersonaIdpersona(Persona personaIdpersona) {
        this.personaIdpersona = personaIdpersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpedido != null ? idpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idpedido == null && other.idpedido != null) || (this.idpedido != null && !this.idpedido.equals(other.idpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Pedido[ idpedido=" + idpedido + " ]";
    }
    
}
