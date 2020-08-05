package com.kodilla.ecommercee.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity(name = "orders")
public class Order extends GenericEntity {

  @ManyToMany(mappedBy = "orders")
  List<Product> products;
}
