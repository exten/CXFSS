package com.it.h2.m0.api.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by flower9 on 23/11/2016.
 */
@Path("/test")
public interface ITestData {

    /**
     *
     * @param name
     */
    @GET
    @Path("/testData")
    void testData(String name);
}
