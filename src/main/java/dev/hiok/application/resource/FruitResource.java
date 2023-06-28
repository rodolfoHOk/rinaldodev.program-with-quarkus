package dev.hiok.application.resource;

import dev.hiok.domain.entity.Fruit;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/fruits")
public class FruitResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruit> list() {
        return Fruit.listAll();
    }

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public void create(Fruit fruitInput) {
        var fruit = new Fruit();
        fruit.name = fruitInput.name;
        fruit.quantity = fruitInput.quantity;
        fruit.persist();
    }

}
