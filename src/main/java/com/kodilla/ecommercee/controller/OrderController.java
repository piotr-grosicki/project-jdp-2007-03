package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.dto.OrderDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @GetMapping("/orders")
    public List<OrderDto> getOrders() {
        return new ArrayList<>();
    }


    @GetMapping("/{orderId}")
    public OrderDto getOrder(@PathVariable("orderId") Long orderId) {
        return new OrderDto();
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable("orderId") Long orderId) {
    }

    @PutMapping("")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        return new OrderDto();
    }

    @PostMapping("")
    public void createOrder(@RequestBody OrderDto orderDto) {

    }

}
