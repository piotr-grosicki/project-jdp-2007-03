package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.repository.GroupRepository;
import com.kodilla.ecommercee.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTest {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    GroupRepository groupRepository;

    @Test
    public void testProductFindAll() {
        //Given
        Group group = new Group();
        Group group1 = new Group();
        Product product = new Product(new ArrayList<>(), group, new ArrayList<>());
        Product product1 = new Product(new ArrayList<>(), group1, new ArrayList<>());



        //When
        groupRepository.save(group);
        groupRepository.save(group1);
        productRepository.save(product);
        productRepository.save(product1);
        List<Product> products = productRepository.findAll();

        //Then
        assertEquals(2,products.size());

        //Clean
        productRepository.deleteAll();
        groupRepository.deleteAll();
    }

    @Test
    public void testGroupSave() {
        //Given
        Group group = new Group();
        group.setName("Loki");
        Product product = new Product(new ArrayList<>(), group, new ArrayList<>());



        //When
        groupRepository.save(group);
        productRepository.save(product);
        List<Product> products = productRepository.findAll();


        //Then
        assertEquals(1,products.size());
        assertEquals("Loki", products.get(0).getGroup().getName());

        //Clean
        productRepository.deleteAll();
        groupRepository.deleteAll();
    }

    @Test
    public void testProductFindById() {
//Given
        Group group = new Group();
        group.setName("xxx");
        Group group1 = new Group();
        Product product = new Product(new ArrayList<>(), group, new ArrayList<>());
        Product product1 = new Product(new ArrayList<>(), group1, new ArrayList<>());
        groupRepository.save(group);
        groupRepository.save(group1);
        productRepository.save(product);
        productRepository.save(product1);


        //When
        long id = product.getId();
        Optional<Product> product2 = productRepository.findById(id);




        //Then
        assertEquals("xxx",product2.get().getGroup().getName());

        //Clean
        productRepository.deleteAll();
        groupRepository.deleteAll();

    }

    @Test
    public void testDeleteProductById() {
        Group group = new Group();
        Group group1 = new Group();
        Product product = new Product(new ArrayList<>(), group, new ArrayList<>());
        Product product1 = new Product(new ArrayList<>(), group1, new ArrayList<>());
        groupRepository.save(group);
        groupRepository.save(group1);
        productRepository.save(product);
        productRepository.save(product1);

        //When

        productRepository.deleteById(product.getId());
        List<Product> products = productRepository.findAll();

        //Then
        assertEquals(1,products.size());

        //Clean
        productRepository.deleteAll();
        groupRepository.deleteAll();
    }
}