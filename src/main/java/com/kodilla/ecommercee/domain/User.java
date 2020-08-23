package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USERS")
public class User extends GenericEntity {

  @Column(name = "login")
  @NotNull
  private String login;

  @Column(name = "email")
  @NotNull
  private String email;

  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "cart_id")
  private Cart cart;

  @OneToMany(
      targetEntity = Order.class,
      mappedBy = "user",
      cascade = CascadeType.ALL,
      fetch = FetchType.LAZY
  )
  private List<Order> orders = new ArrayList<>();
}
