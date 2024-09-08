package com.heartwoodlabs.esame.rs;

import com.heartwoodlabs.esame.dao.ProdottoDao;
import com.heartwoodlabs.esame.dto.ProdottoDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/prodotti")
public class ProdottoResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllProdotti() {
        ProdottoDao dao = new ProdottoDao();
        List<ProdottoDto> prodotti = dao.getAll();
        dao.close();
        return Utility.buildOkResponse(prodotti);
    }


}
