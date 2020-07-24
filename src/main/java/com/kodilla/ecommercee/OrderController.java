package com.kodilla.ecommercee;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @RequestMapping(method = RequestMethod.GET, value = "getOrders")
    public List<OrderDto> getOrders() {
        return new ArrayList<>();
    }


    @RequestMapping(method = RequestMethod.GET, value = "getOrder")
    public OrderDto getOrder(@RequestParam Long orderId) {
        return new OrderDto();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteOrder")
    public void deleteOrder(@RequestParam Long orderId) {

    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateOrder")
    public OrderDto updateOrder(@RequestBody OrderDto orderDto) {
        return new OrderDto();
    }

    @RequestMapping(method = RequestMethod.POST, value = "createOrder")
    public void createOrder(@RequestBody OrderDto orderDto) {

    }

}
