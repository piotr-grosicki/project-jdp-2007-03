package com.kodilla.ecommercee.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
