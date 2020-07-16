package com.example.demo;

import javax.ws.rs.GET;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

public class SubResource {

    @Context
    UriInfo uriInfo;

    @GET
    public String checkContextInjection() {
        return uriInfo == null ? "Failed" : "Worked";
    }
}