package com.kodilla.ecommercee.domain;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Entity(name = "products")
public class Product extends GenericEntity {

  @Column(name = "productName")
  private String name;

  @Column(name = "productDesription")
  private String description;

  @Column(name = "price")
  private BigInteger price;

  @ManyToMany(cascade = CascadeType.ALL)
  private List<Order> orders;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable
  private List<Cart> carts;

  @ManyToOne
  @JoinColumn(name = "groupId")
  private Group group;
}
