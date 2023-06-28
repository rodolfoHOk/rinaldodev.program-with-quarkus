package dev.hiok.domain.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Fruit extends PanacheEntityBase {

  @Id
  @SequenceGenerator(
    name = "fruitSequenceGenerator",
    sequenceName = "fruit_sequence",
    allocationSize = 1,
    initialValue = 1
  )
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fruitSequenceGenerator")
  public Long id;

  public String name;

  public Integer quantity;

}
