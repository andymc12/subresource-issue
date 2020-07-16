package com.example.demo;

//import javax.inject.Singleton;
import javax.ws.rs.Path;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;


@Path("/hello")
public class HelloController {

    @Context
    ResourceContext resouceContext;

    @Path("/init")
    public SubResource initResource() {
        return resouceContext.initResource(new SubResource());
    }

    @Path("/get")
    public SubResource getResource() {
        return resouceContext.getResource(SubResource.class);
    }
}
