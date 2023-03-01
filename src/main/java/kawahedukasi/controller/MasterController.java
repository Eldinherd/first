package kawahedukasi.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/master")
@Produces(MediaType.TEXT_PLAIN)
public class MasterController {
    @Path("/city")
    @GET
    public String city(){
        return "Jakarta, Bandung, Jogja";
    }
    @Path("/province")
    @GET
    public String province(){
        return "DKI Jakarta, Jawa Barat, Jawa Tengah";
    }
    @Path("/district")
    @GET
    public String district(){
        return "Kebayoran Lama, Lengkoas, Bangkoang";
    }



}
