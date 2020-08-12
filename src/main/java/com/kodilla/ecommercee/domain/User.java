package com.kodilla.ecommercee.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name="users")
public class User extends GenericEntity{

    @OneToMany(
            targetEntity = Order.class,
            mappedBy = "users",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Order> orders;

    @OneToOne(mappedBy = "users")
    private Cart cart;
}
