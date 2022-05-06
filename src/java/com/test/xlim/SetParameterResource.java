/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package com.test.xlim;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author sotoguerrero
 */
@Path("setParameter")
public class SetParameterResource {

    @Context
    private UriInfo context;
    
    private String parameter_ = "MeNeeMyNeeM";

    /**
     * Creates a new instance of SetParameterResource
     */
    public SetParameterResource() {
    }

    /**
     * Retrieves representation of an instance of com.test.xlim.SetParameterResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHtml() { 
       return "<html><body> You have reached the get parameter service. <br> Parameter value is: " + parameter_ + "</html></body>";
    }

    /**
     * PUT method for updating or creating an instance of SetParameterResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(@PathParam("content") String content) {
        parameter_ = new String("mqkdfj");
        System.out.println("I received "+ content);
    }
}
