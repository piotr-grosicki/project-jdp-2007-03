package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.CartDto;
import com.kodilla.ecommercee.domain.OrderDto;
import com.kodilla.ecommercee.domain.ProductDto;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/cart")
public class CartController {

  @RequestMapping(
      method = RequestMethod.POST,
      value = "",
      consumes = APPLICATION_JSON_VALUE
  )
  public void createCart(@RequestBody CartDto cartDto) {
  }

  @RequestMapping(
      method = RequestMethod.GET,
      value = "/{cartId}/products}"
  )
  public List<ProductDto> getProductsByCartId(@PathParam("cartId") Long cartId) {
    return new ArrayList<>();
  }

  @RequestMapping(
      method = RequestMethod.PUT,
      value = "",
      consumes = APPLICATION_JSON_VALUE,
      produces = APPLICATION_JSON_VALUE
  )
  public CartDto updateCart(@RequestBody CartDto cartDto) {
    return new CartDto();
  }

  @RequestMapping(
      method = RequestMethod.DELETE,
      value = "/{cartId}/product/{productId}"
  )
  public void deleteProductFromCart(
      @PathParam("cartId") Long cartId,
      @PathParam("productId") Long productId) {
  }

  @RequestMapping(
      method = RequestMethod.POST,
      value = "/{cartId}/order",
      consumes = APPLICATION_JSON_VALUE
  )
  public void createOrderFromCart(
      @PathParam("cartId") Long cartId,
      @RequestBody OrderDto orderDto) {
  }
}
