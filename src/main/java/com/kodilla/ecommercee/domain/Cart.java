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
@Entity(name = "carts")
public class Cart extends GenericEntity {

  @ManyToMany(mappedBy = "carts")
  private List<Product> products;
}
