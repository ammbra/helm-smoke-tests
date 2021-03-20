package org.acme.example.endpoint.v2;
//
//import com.example.smokify.model.Location;
//import org.acme.example.service.LocationService;
//import org.eclipse.microprofile.faulttolerance.Retry;
//import org.eclipse.microprofile.faulttolerance.Timeout;
import org.acme.example.model.Location;
import org.acme.example.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Path("/v2/location")
@RequestScoped
public class LocationEndpoint {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocationEndpoint.class);

    @Inject
    LocationService locationService;

    @GET
    @Path("/address/{address}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Location getByAdress(@PathParam("address") String address) {
        return locationService.findByAddress(address,false);
    }

}
