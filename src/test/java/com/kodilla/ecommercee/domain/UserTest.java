package com.kodilla.ecommercee.domain;

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

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testUserFindAll() {
        //Given

        User user1 = new User("mali1", "mali1@g.com",new Cart(), new ArrayList<>());
        User user2 = new User("mali2", "mali2@g.com",new Cart(), new ArrayList<>());

        //When
        userRepository.save(user1);
        userRepository.save(user2);
        List<User> users = userRepository.findAll();
        //Then
        Assert.assertEquals(2, users.size());
        //Clean up
        userRepository.deleteAll();
    }

    @Test
    public void testUserSave() {
        //Given

        User user1 = new User("mali1", "mali1@g.com",new Cart(), new ArrayList<>());
        User user2 = new User("mali2", "mali2@g.com",new Cart(), new ArrayList<>());

        //When
        userRepository.save(user1);
        userRepository.save(user2);

        //Then
        Assert.assertEquals(2, userRepository.findAll().size());

        //Clean up
        userRepository.deleteAll();
    }

    @Test
    public void testUserFindById() {
        //Given

        User user1 = new User("mali1", "mali1@g.com",new Cart(), new ArrayList<>());
        User user2 = new User("mali2", "mali2@g.com",new Cart(), new ArrayList<>());

        //When
        userRepository.save(user1);
        userRepository.save(user2);

        Optional<User> users = userRepository.findById(user1.getId());

        //Then
        assertEquals(users.get().getId(), user1.getId());

        //Clean up
        userRepository.deleteAll();
    }

    @Test
    public void testUserDeleteById() {
        //Given

        User user1 = new User("mali1", "mali1@g.com",new Cart(), new ArrayList<>());
        User user2 = new User("mali2", "mali2@g.com",new Cart(), new ArrayList<>());
        userRepository.save(user1);
        userRepository.save(user2);

        //When

        userRepository.deleteById(user2.getId());
        List<User> users = userRepository.findAll();
        //Then
        Assert.assertEquals(1, users.size());
        //Clean up
        userRepository.deleteAll();
    }

}
