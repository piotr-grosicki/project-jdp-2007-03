
package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@Entity(name = "carts")
public class Cart extends GenericEntity{


  @OneToOne(cascade =  CascadeType.ALL,fetch = FetchType.EAGER)
  @JoinColumn(name = "userid")
  private User users;

  @ManyToMany(mappedBy = "carts")
  private List<Product> products;

}