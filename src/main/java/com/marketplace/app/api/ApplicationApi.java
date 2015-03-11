package com.marketplace.app.api;

import com.marketplace.app.domain.entities.Application;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author edmundas
 */
@Produces("application/json")
public interface ApplicationApi {
    @GET
    @Path("/test")
    List<Application> applications();
}