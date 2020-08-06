package com.kodilla.ecommercee.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="ORDER")
public class Order extends GenericEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_id")
    private User user;

    @ManyToMany(mappedBy = "orders")
    private List<Product> products;
}