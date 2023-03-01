package kawahedukasi.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/peserta")
public class PesertaController {

    @Path("/{nama}")
    @GET
    public String inputPathParameter(@PathParam("nama") String nama){
            return "Peserta dengan nama input path parameter  : " + nama;
    }
    @GET
    public String inputQueryPathParameter(@QueryParam("nama") String nama,@QueryParam("nim") String nim ){
        return "Peserta nama dengan input query parameter : " + nama + "\nnim: " + nim;
    }

}
