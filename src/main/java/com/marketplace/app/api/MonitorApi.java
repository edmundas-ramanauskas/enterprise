package com.marketplace.app.api;

import com.marketplace.app.domain.beans.SiteStatusBean;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author edmundas
 */
@Produces("application/json")
@Path("/monitor")
public interface MonitorApi {
    @GET
    @Path("/status")
    SiteStatusBean checkStatus(@QueryParam("url") String url);
}