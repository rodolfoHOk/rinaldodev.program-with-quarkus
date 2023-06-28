package dev.hiok.application.resource;

import dev.hiok.domain.entity.Fruit;
import dev.hiok.domain.service.FruitService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/fruits")
public class FruitResource {

    @Inject
    FruitService fruitService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruit> list() {
        return fruitService.list();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void create(Fruit fruitInput) {
        fruitService.create(fruitInput);
    }

}
