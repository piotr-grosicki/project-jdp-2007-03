package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USER")
public class User extends GenericEntity{

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "users", unique = true)
    private Long userId;

    @Column(name = "login")
    @NotNull
    private String login;

    @Column(name = "email")
    @NotNull
    private String email;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "cardId")
    @NotNull
    private Cart cart;

    @OneToMany(mappedBy = "cart")
    @NotNull
    private List<Order> orders;



}
