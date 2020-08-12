package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

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

