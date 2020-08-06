package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.domain.dto.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USERS")
public class User extends GenericEntity{

    @Column(name = "login")
    @NotNull
    private String login;

    @Column(name = "email")
    @NotNull
    private String email;

    private Cart cart;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "carts_id")
    public Cart getCart(){
        return cart;
    }

    private List<Order> orders = new ArrayList<>();


    @OneToMany(
            targetEntity = Order.class,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )

    public List<Order> getOrders(){
        return orders;
    }



}
