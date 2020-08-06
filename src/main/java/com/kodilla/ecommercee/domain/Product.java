package com.kodilla.ecommercee.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Entity(name="PRODUCT")
public class Product extends GenericEntity{

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_ORDER_USER",
            joinColumns = {@JoinColumn(name = "Product_id")},
            inverseJoinColumns = {@JoinColumn(name = "Order_id")}
    )
    private List<Order> orders;

}