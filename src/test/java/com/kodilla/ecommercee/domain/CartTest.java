package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.repository.CartRepository;
import com.kodilla.ecommercee.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartTest {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    UserRepository userRepository;


    @Test
    public void testCartFindAll() {

        //Given
        List<Product> products = new ArrayList<>();

        User user = new User();
        user.setLogin("jarek");
        user.setEmail("czyny@nie.cuda");
        user.setOrders(new ArrayList<>());
        Cart cart = new Cart();
        cart.setUser(user);
        cart.setProducts(products);
        user.setCart(cart);


        //When
        userRepository.save(user);
        cartRepository.save(cart);

        List<Cart> carts = cartRepository.findAll();

        //Then
        Assert.assertEquals(1, carts.size());

        //Clean
        cartRepository.deleteAll();
        userRepository.deleteAll();
    }

    @Test
    public void testCartSave() {

        //Given
        List<Product> products = new ArrayList<>();

        User user = new User();
        user.setLogin("jarek");
        user.setEmail("czyny@nie.cuda");
        user.setOrders(new ArrayList<>());
        Cart cart = new Cart();
        cart.setUser(user);
        cart.setProducts(products);
        user.setCart(cart);


        //When
        userRepository.save(user);
        cartRepository.save(cart);

        List<Cart> carts = cartRepository.findAll();

        //Then
        Assert.assertEquals(user, cart.getUser());
        Assert.assertEquals(1, carts.size());

        //Clean
        cartRepository.deleteAll();
        userRepository.deleteAll();
    }

    @Test
    public void testCartFindById() {
        //Given
        List<Product> products = new ArrayList<>();

        User user = new User();
        user.setLogin("jarek");
        user.setEmail("czyny@nie.cuda");
        user.setOrders(new ArrayList<>());
        Cart cart = new Cart();
        cart.setUser(user);
        cart.setProducts(products);
        user.setCart(cart);


        //When
        userRepository.save(user);
        cartRepository.save(cart);

        long id = cart.getId();
        Optional<Cart>cartResult = cartRepository.findById(id);

        //Then
        Assert.assertEquals(cart.getId(), cartResult.get().getId());

        //Clean
        cartRepository.deleteAll();
        userRepository.deleteAll();

    }

    @Test
    public void testDeleteById() {
        //Given
        List<Product> products = new ArrayList<>();

        User user = new User();
        user.setLogin("jarek");
        user.setEmail("czyny@nie.cuda");
        user.setOrders(new ArrayList<>());
        Cart cart = new Cart();
        cart.setUser(user);
        cart.setProducts(products);
        user.setCart(cart);
        Cart cart1=new Cart(new User(),new ArrayList<>());

        userRepository.save(user);
        cartRepository.save(cart);

        //When
        long id = cart.getId();
        cartRepository.deleteById(id);
        List<Cart> carts = cartRepository.findAll();


        //Then
        Assert.assertEquals(0, carts.size());

        //Clean
        cartRepository.deleteAll();
        userRepository.deleteAll();
    }
}