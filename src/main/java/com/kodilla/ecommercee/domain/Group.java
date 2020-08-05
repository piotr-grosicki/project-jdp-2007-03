package com.kodilla.ecommercee.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import lombok.NonNull;

@Entity(name = "groups")
public class Group extends GenericEntity {

  @NonNull
  @OneToMany(
      targetEntity = Product.class,
      cascade = CascadeType.ALL,
      fetch = FetchType.LAZY
  )
  private List<Product> products = new ArrayList<>();
}
