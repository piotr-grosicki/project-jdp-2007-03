package com.kodilla.ecommercee.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity(name="USERS")
public class User extends GenericEntity{

    @OneToMany(
            targetEntity = Order.class,
            mappedBy = "users",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Order> orders;
}