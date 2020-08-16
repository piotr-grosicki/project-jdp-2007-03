package com.kodilla.ecommercee.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Entity(name = "groups")
public class Group extends GenericEntity {

    public Group() {
    }

    public Group(Long id, String name, List<Product> products) {
        super(id);
        this.name = name;
        this.products = products;
    }


    @Column(name = "name")
    private String name;


    @OneToMany(
            targetEntity = Product.class,
            mappedBy = "group",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Product> products = new ArrayList<>();

}
