package com.kodilla.ecommercee.domain;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@Entity(name = "product")
public class Product extends GenericEntity {

  @NonNull
  @Column(name = "productName")
  private String name;

  @NonNull
  @Column(name = "productDesription")
  private String description;

  @NonNull
  @Column(name = "price")
  private BigInteger price;

  @ManyToMany(mappedBy = "products")
  List<Order> orders;

  @ManyToMany(mappedBy = "products")
  List<Cart> carts;

  @ManyToOne
  @JoinColumn(name = "groupId")
  private Group groupId;
}
