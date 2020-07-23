package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.CartDto;
import com.kodilla.ecommercee.domain.OrderDto;
import com.kodilla.ecommercee.domain.ProductDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/cart/")
public class CartController {

  @RequestMapping(method = RequestMethod.POST, value = "createCart", consumes = APPLICATION_JSON_VALUE)
  public void createCart(@RequestBody CartDto cartDto) {
    //service.saveCart(cartMapper.mapToCart(cartDto));
  }

  @RequestMapping(method = RequestMethod.GET, value = "getProducts")
  public List<ProductDto> getProducts() {
    //return productMapper.mapToProductDtoList(service.getAllProducts());
    return new ArrayList<>();
  }

  @RequestMapping(method = RequestMethod.PUT, value = "updateCart")
  public CartDto updateCart(@RequestBody CartDto cartDto) {
    //return cartMapper.mapToCartDto(service.saveCart(cartMapper.mapToCart(cartDto)));
    return new CartDto();
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "deleteProduct")
  public void deleteProduct(@RequestParam Long productId) {
    //service.deleteProductById(productId);
  }

  @RequestMapping(method = RequestMethod.POST, value = "createOrder", consumes = APPLICATION_JSON_VALUE)
  public void createOrder(@RequestBody OrderDto orderDto) {
    //service.saveTask(orderMapper.mapToTask(orderDto));
  }
}
