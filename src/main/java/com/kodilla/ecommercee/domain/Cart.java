package com.kodilla.ecommercee.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity(name = "carts")
public class Cart extends GenericEntity {

  @ManyToMany(mappedBy = "carts")
  List<Product> products;
}
