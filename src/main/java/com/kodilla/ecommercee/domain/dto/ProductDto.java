package com.kodilla.ecommercee.domain.dto;

import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {
  private Long productId;
  private String name;
  private String description;
  private BigInteger price;
}
