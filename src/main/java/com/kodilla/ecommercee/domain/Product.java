package com.kodilla.ecommercee.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter

@Entity(name = "products")
public class Product extends GenericEntity {

  @ManyToMany
  @JoinTable(
      name = "join_order_user",
      joinColumns = {@JoinColumn(name = "productid")},
      inverseJoinColumns = {@JoinColumn(name = "orderid")}
  )
  private List<Order> orders;

  @ManyToOne
  @JoinColumn(name = "groupId")
  private Group group;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(
      name = "join_cart_product",
      joinColumns = {@JoinColumn(name = "productid")},
      inverseJoinColumns = {@JoinColumn(name = "cartid")}
  )
  private List<Cart> carts;
}
