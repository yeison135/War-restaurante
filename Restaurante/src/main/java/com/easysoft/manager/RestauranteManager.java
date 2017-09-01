/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easysoft.manager;

import com.easysoft.filtroDTO.FiltroDTO;
import com.easysoft.persistence.Persona;
import com.easysoft.persistence.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author yalvarez
 */
public class RestauranteManager {
    
     public List<Persona> consultar(EntityManager em) {
        Query consulta = em.createNamedQuery("Persona.findAll");
        List<Persona> Personas = consulta.getResultList();
        return Personas;
    }

    public Persona consultarPersona(FiltroDTO filtro, EntityManager em) {
        StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT p FROM Persona p WHERE p.nombre =:nombre");
        Query query = em.createQuery(queryString.toString());
        if (filtro.getFiltroUno() != null) {
            query.setParameter("nombre", filtro.getFiltroUno());
        }
        Persona persona = (Persona) query.getSingleResult();

        return persona;
    }
    
    public Boolean consultarUsuario(FiltroDTO filtro, EntityManager em) {
        Boolean resultado = false;
        Usuario user = new Usuario();
        StringBuilder queryString = new StringBuilder();
        queryString.append("SELECT u FROM Usuario u WHERE u.usuario =:usuario"
                + " AND u.contrasena =:contrasena");
        Query query = em.createQuery(queryString.toString());
        if (filtro.getFiltroUno() != null && filtro.getFiltroUno() != null) {
            query.setParameter("usuario", filtro.getFiltroUno());
            query.setParameter("contrasena", filtro.getFiltroDos());
        }
        try {
           user = (Usuario) query.getSingleResult();
        } catch (Exception e) {
           resultado = false; 
        }
       
        if (user.getIdusuario() != null) {
            resultado = true;
        }
        return resultado;
    }
    
    
}
