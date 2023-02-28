package id.eldin;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class GreetingResource {

    @GET
    @Path("/info")
    @Produces(MediaType.TEXT_PLAIN)
    public String info() {
        return "info : This is a sample GET endpoint";
    }
    @GET
    @Path("/about")
    @Produces(MediaType.TEXT_PLAIN)
    public String about() {
        return "about : This is a sample GET endpoint";
    }
    @GET
    @Path("/home")
    @Produces(MediaType.TEXT_PLAIN)
    public String home() {
        return "home : This is a sample GET endpoint";
    }


}