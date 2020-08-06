package com.kodilla.ecommercee.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="ORDERS")
public class Order extends GenericEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User users;

    @ManyToMany(mappedBy = "orders")
    private List<Product> products;
}