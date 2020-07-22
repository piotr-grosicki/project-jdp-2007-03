package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@Entity(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "pictureUrl")
    private String pictureUrl;

    @Column(name = "manufacturer")
    private String manufacturer;
}
