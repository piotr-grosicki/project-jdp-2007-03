package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.repository.OrderRepository;
import com.kodilla.ecommercee.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {
  @Autowired OrderRepository orderRepository;
  @Autowired UserRepository userRepository;

  //userId, list of products
  @Test
  public void findAllOrders() {
    //Given
    User user = new User("tom", "tom@foo.pl",new Cart(),new ArrayList<>());
    User user2 = new User("johnsnow", "john@snow.pl",new Cart(),new ArrayList<>());
    List<Product> products = new ArrayList<>();
    Order order = new Order(user, products);
    Order order2 = new Order(user2, products);
    //When
    userRepository.save(user);
    userRepository.save(user2);
    orderRepository.save(order);
    orderRepository.save(order2);
    List<Order> orders = orderRepository.findAll();
    //Then
    Assert.assertEquals(2, orders.size());
    //Cleanup
    userRepository.deleteAll();
    orderRepository.deleteAll();
  }

  @Test
  public void saveOrder() {
    //Given
    User user = new User("tom", "tom@foo.pl",new Cart(),new ArrayList<>());
    User user2 = new User("johnsnow", "john@snow.pl",new Cart(),new ArrayList<>());
    List<Product> products = new ArrayList<>();
    Order order = new Order(user, products);
    Order order2 = new Order(user2, products);
    //When
    userRepository.save(user);
    userRepository.save(user2);
    orderRepository.save(order);
    orderRepository.save(order2);
    //Then
    Assert.assertEquals(user, order.getUser());
    Assert.assertEquals(products, order.getProducts());
    Assert.assertEquals(2, orderRepository.findAll().size());
    //Cleanup
    userRepository.deleteAll();
    orderRepository.deleteAll();
  }

  @Test
  public void findOrderById() {
    //Given
    User user = new User("tom", "tom@foo.pl",new Cart(),new ArrayList<>());
    List<Product> products = new ArrayList<>();
    Order order = new Order(user, products);
    //When
    userRepository.save(user);
    orderRepository.save(order);
    Long id = order.getId();
    Optional<Order> orderById = orderRepository.findById(id);
    //Then
    Assert.assertEquals(orderById.get().getId(), order.getId());
    //Cleanup
    userRepository.deleteAll();
    orderRepository.deleteAll();
  }

  @Test
  public void deleteOrderById() {
    //Given
    User user = new User("tom", "tom@foo.pl",new Cart(),new ArrayList<>());
    User user2 = new User("johnsnow", "john@snow.pl",new Cart(),new ArrayList<>());
    List<Product> products = new ArrayList<>();
    Order order = new Order(user, products);
    Order order2 = new Order(user2, products);
    userRepository.save(user);
    userRepository.save(user2);
    orderRepository.save(order);
    orderRepository.save(order2);
    Long id = order2.getId();
    //When
    orderRepository.deleteById(id);
    List<Order> orders = orderRepository.findAll();
    //Then
    Assert.assertEquals(1, orders.size());
    //Cleanup
    userRepository.deleteAll();
    orderRepository.deleteAll();
  }
}
