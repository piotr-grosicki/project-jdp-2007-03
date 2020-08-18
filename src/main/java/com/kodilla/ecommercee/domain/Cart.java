
package com.kodilla.ecommercee.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "CARTS")
public class Cart extends GenericEntity {

  @OneToOne(mappedBy = "cart", fetch = FetchType.EAGER)
  private User user;

  @ManyToMany(mappedBy = "carts")
  private List<Product> products;
}

