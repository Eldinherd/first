package kawahedukasi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Hello World GET";
    }
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String post() {

        return "Hello World POST";
    }
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String put() {
        return "Hello World PUT";
    }
    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    public String delete() {
        return "Hello World DELETE";
    }


    public static class PesertaController {
    }
}