package com.marketplace.app.api;

import com.marketplace.app.domain.entities.Application;
import java.util.List;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.springframework.data.domain.Page;

/**
 *
 * @author edmundas
 */
@Produces("application/json")
public interface ApplicationApi {
    @GET
    @Path("/applications")
    Page<Application> getApplications(@DefaultValue("1") @QueryParam("page") int page);
    
    @GET
    @Path("/application/{id}")
    Application getApplication(@PathParam("id") long id);
}