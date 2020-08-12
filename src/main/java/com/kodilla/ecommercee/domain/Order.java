package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Entity(name = "orders")
public class Order extends GenericEntity {

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "userid")
  private User users;

  @ManyToMany(mappedBy = "orders")
  private List<Product> products;
}
