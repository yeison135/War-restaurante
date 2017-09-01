/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easysoft.persistence;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yalvarez
 */
@Entity
@Table(name = "costo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Costo.findAll", query = "SELECT c FROM Costo c")
    , @NamedQuery(name = "Costo.findByIdcosto", query = "SELECT c FROM Costo c WHERE c.idcosto = :idcosto")
    , @NamedQuery(name = "Costo.findByCosto", query = "SELECT c FROM Costo c WHERE c.costo = :costo")})
public class Costo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcosto")
    private Integer idcosto;
    @Column(name = "costo")
    private Integer costo;
    @JoinColumn(name = "pedido_idpedido", referencedColumnName = "idpedido")
    @ManyToOne(optional = false)
    private Pedido pedidoIdpedido;

    public Costo() {
    }

    public Costo(Integer idcosto) {
        this.idcosto = idcosto;
    }

    public Integer getIdcosto() {
        return idcosto;
    }

    public void setIdcosto(Integer idcosto) {
        this.idcosto = idcosto;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Pedido getPedidoIdpedido() {
        return pedidoIdpedido;
    }

    public void setPedidoIdpedido(Pedido pedidoIdpedido) {
        this.pedidoIdpedido = pedidoIdpedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcosto != null ? idcosto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Costo)) {
            return false;
        }
        Costo other = (Costo) object;
        if ((this.idcosto == null && other.idcosto != null) || (this.idcosto != null && !this.idcosto.equals(other.idcosto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.easysoft.persistence.Costo[ idcosto=" + idcosto + " ]";
    }
    
}
