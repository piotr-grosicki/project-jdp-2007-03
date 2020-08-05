package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.domain.dto.Order;
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
@Table(name = "USERS")
public class User{

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "userId", unique = true)
    private Long userId;

    @Column(name = "login")
    @NotNull
    private String login;

    @Column(name = "email")
    @NotNull
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "carts")
    @NotNull
    private List<Order> orders;



}
