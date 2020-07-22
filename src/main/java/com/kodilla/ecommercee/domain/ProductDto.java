package com.kodilla.ecommercee.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ProductDto {
    private Long id;
    private String name;
    private double price;
    private String pictureUrl;
    private String manufacturer;
}
