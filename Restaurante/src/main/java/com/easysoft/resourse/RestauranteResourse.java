/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.easysoft.resourse;

import com.easysoft.entitymanager.EMF;
import com.easysoft.filtroDTO.FiltroDTO;
import com.easysoft.manager.RestauranteManager;
import com.easysoft.persistence.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author yalvarez
 */
@Path("restaurante")
public class RestauranteResourse {

    EntityManager em = EMF.createEntityManager();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of RestauranteResourse
     */
    public RestauranteResourse() {
    }

    /**
     * Retrieves representation of an instance of com.easysoft.resourse.RestauranteResourse
     * @return an instance of java.lang.String
     */
     @GET
    @Path("ConsultaPersonas")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Persona> consultarPersonas() {
        
       RestauranteManager consultaUsuarios = new RestauranteManager();     
       List<Persona> user = consultaUsuarios.consultar(em);
                
        return user;
    }
    
    @POST 
    @Path("ConsultaPersona")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Persona consultarPersona(FiltroDTO filtro) {
        
       RestauranteManager manager = new RestauranteManager();
       Persona user = new Persona();
       if(filtro.getFiltroUno()!=null){
          user = manager.consultarPersona(filtro, em);       
       }                       
        return user;
    }
    
    @POST 
    @Path("consultarUsuario")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Boolean consultarUsuario(FiltroDTO filtro) {
        
       RestauranteManager manager = new RestauranteManager();
       Boolean user = false;
       if(filtro.getFiltroUno()!= null && filtro.getFiltroDos() != null){
          user = manager.consultarUsuario(filtro, em);       
       }                       
        return user;
    }
}
