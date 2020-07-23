package com.kodilla.ecommercee;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
  /*
  utworzenie pustego koszyka
  pobranie elementów z pustego koszyka
  dodanie elementów (produktów) do koszyka
  usunięcie konkretnego produktu z koszyka
  utworzenie zamówienia na podstawie koszyka
  */
  public void createCart(CartDto cartDto) {

  }

  public List<ProductDto> getProducts() {
    return new ArrayList<>();
  }

  public CartDto updateCart(CartDto cartDto) {
    return new CartDto();
  }

  public void deleteProduct(Long productId) {

  }

  public void createOrder(OrderDto orderDto){

  }
}
