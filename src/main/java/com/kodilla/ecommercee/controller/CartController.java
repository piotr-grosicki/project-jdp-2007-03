package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.CartDto;
import com.kodilla.ecommercee.domain.OrderDto;
import com.kodilla.ecommercee.domain.ProductDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/cart")
public class CartController {

  @PostMapping(
      path = "/createCart",
      consumes = APPLICATION_JSON_VALUE
  )
  public void createCart(@RequestBody CartDto cartDto) {
  }

  @GetMapping(
      path = "/{cartId}/products}"
  )
  public List<ProductDto> getProductsByCartId(@RequestParam("cartId") Long cartId) {
    return new ArrayList<>();
  }

  @PutMapping(
      path = "/{cartId}",
      consumes = APPLICATION_JSON_VALUE,
      produces = APPLICATION_JSON_VALUE
  )
  public CartDto updateCart(@RequestBody CartDto cartDto) {
    return new CartDto();
  }

  @DeleteMapping(
      path = "/{cartId}/product/{productId}"
  )
  public void deleteProductFromCart(
      @RequestParam("cartId") Long cartId,
      @RequestParam("productId") Long productId) {
  }

  @PostMapping(
      path = "/{cartId}/order",
      consumes = APPLICATION_JSON_VALUE
  )
  public void createOrderFromCart(
      @RequestParam("cartId") Long cartId,
      @RequestBody OrderDto orderDto) {
  }
}
