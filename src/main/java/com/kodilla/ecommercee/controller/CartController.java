package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.dto.CartDto;
import com.kodilla.ecommercee.domain.dto.OrderDto;
import com.kodilla.ecommercee.domain.dto.ProductDto;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cart")
public class CartController {

  @GetMapping("/{cartId}/products}")
  public List<ProductDto> getProductsByCartId(@PathVariable("cartId") Long cartId) {
    return new ArrayList<>();
  }

  @DeleteMapping("/{cartId}/product/{productId}")
  public void deleteProductFromCart(
      @PathVariable("cartId") Long cartId,
      @PathVariable("productId") Long productId) {
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
      @PathVariable("cartId") Long cartId,
      @RequestBody OrderDto orderDto) {
  }
}
