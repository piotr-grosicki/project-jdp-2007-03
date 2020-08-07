package com.kodilla.ecommercee.domain;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@Entity(name = "orders")
public class Order extends GenericEntity {

  @ManyToMany(mappedBy = "orders")
  private List<Product> products;
}
