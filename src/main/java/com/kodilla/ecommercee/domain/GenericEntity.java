package com.kodilla.ecommercee.domain;
import javax.persistence.*;

@MappedSuperclass
public class GenericEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public GenericEntity() {
    }

    public Long getId() {

        return id;
    }

}
