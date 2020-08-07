package com.kodilla.ecommercee.domain;

import javax.persistence.*;

@Entity(name = "products")
public class Product extends GenericEntity {
    @ManyToOne
    @JoinColumn(name = "groupId")
    private Group group;
}
