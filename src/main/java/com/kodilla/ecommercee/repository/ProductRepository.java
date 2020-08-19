package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
  @Override
  List<Product> findAll();

  @Override
  Product save(Product product);

  @Override
  Optional<Product> findById(Long Id);

  @Override
  void deleteById(Long id);
}
