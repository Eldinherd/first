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
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String post(){
        return "This is a sample POST endpoint ";
    }
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String put(){
       return "This is a sample POST endpoint " ;
    }
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public String delet(){
        return "This is a sample POST endpoint " ;
    }

}