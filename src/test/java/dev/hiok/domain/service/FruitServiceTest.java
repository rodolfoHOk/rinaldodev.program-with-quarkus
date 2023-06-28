package dev.hiok.domain.service;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

@QuarkusTest
public class FruitServiceTest {

  @Inject
  FruitService fruitService;

  @Test
  public void testFruitsList() {
    var list = fruitService.list();
    assertFalse(list.isEmpty());
  }

}
