package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
  @Override
  List<Order> findAll();

  @Override
  Order save(Order order);

  @Override
  Optional<Order> findById(Long Id);

  @Override
  void deleteById(Long id);
}
