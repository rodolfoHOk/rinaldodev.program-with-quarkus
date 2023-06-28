package dev.hiok.domain.service;

import dev.hiok.core.util.TransactionIdentifier;
import dev.hiok.domain.entity.Fruit;
import io.quarkus.arc.Lock;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Lock
@ApplicationScoped
public final class FruitService {

  @Inject
  TransactionIdentifier transactionIdentifier;

  @Lock(value = Lock.Type.READ, time = 3, unit = TimeUnit.SECONDS)
  public List<Fruit> list() {
    System.out.println(transactionIdentifier.getTransactionIdentifier());
    return Fruit.listAll();
  }

  @Transactional
  public void create(Fruit fruit) {
    System.out.println(transactionIdentifier.getTransactionIdentifier());
    var newFruit = new Fruit();
    newFruit.name = fruit.name;
    newFruit.quantity = fruit.quantity;
    newFruit.persist();
  }

}
