package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.dto.CartDto;
import com.kodilla.ecommercee.domain.dto.OrderDto;
import com.kodilla.ecommercee.domain.dto.ProductDto;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cart")
public class CartController {

  @GetMapping("/{cartId}/products}")
  public List<ProductDto> getProductsByCartId(@PathParam("cartId") Long cartId) {
    return new ArrayList<>();
  }

  @DeleteMapping("/{cartId}/product/{productId}")
  public void deleteProductFromCart(
      @PathParam("cartId") Long cartId,
      @PathParam("productId") Long productId) {
  }

  @PutMapping("")
  public CartDto updateCart(@RequestBody CartDto cartDto) {
    return new CartDto();
  }

  @PostMapping("")
  public void createCart(@RequestBody CartDto cartDto) {
  }

  @PostMapping("/{cartId}/order")
  public void createOrderFromCart(
      @PathParam("cartId") Long cartId,
      @RequestBody OrderDto orderDto) {
  }
}
