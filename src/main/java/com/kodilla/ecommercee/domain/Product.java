package com.kodilla.ecommercee.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity(name="products")
public class Product extends GenericEntity{

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_ORDER_USER",
            joinColumns = {@JoinColumn(name = "productid")},
            inverseJoinColumns = {@JoinColumn(name = "orderid")}
    )
    private List<Order> orders;

    @ManyToOne
    @JoinColumn(name = "groupId")
    private Group group;
}

