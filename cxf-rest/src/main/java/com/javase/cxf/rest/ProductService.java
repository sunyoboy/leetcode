package com.javase.cxf.rest;

import com.javase.cxf.entity.Product;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

/**
 * Created by root on 11/27/16.
 */
public interface ProductService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/products")
    List<Product> retrieveAllProducts();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/product/{id}")
    Product retrieveProductById(@PathParam("id") long id);

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/products")
    List<Product> retrieveProductByName(@FormParam("name") String name);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/product")
    Product createProduct(Product product);

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("product/{id}")
    Product updateProductById(@PathParam("id") long id, Map<String, Object> fieldMap);

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/product/{id}")
    Product deleteProdcutById(@PathParam("id") long id);

}
