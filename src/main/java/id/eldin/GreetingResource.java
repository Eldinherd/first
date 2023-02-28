package id.eldin;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/sample")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "This is a sample GET endpoint";
    }


}