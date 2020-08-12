package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.repository.GroupRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupTest {
    @Autowired
    private GroupRepository groupRepository;

    @Test
    public void testGroupFindAll() {
        //Given
        List<Product> products = new ArrayList<>();

        Group group1 = new Group("test1", products);
        Group group2 = new Group("test2", products);

        //When
        groupRepository.save(group1);
        groupRepository.save(group2);
        List<Group> groups = groupRepository.findAll();

        //Then
        assertEquals(2,groups.size());

        //Clean
        groupRepository.delete(group1);
        groupRepository.delete(group2);
    }

    @Test
    public void testGroupSave() {
        //Given
        List<Product> products = new ArrayList<>();

        Group group1 = new Group("test1", products);

        //When
        groupRepository.save(group1);

        //Then
        assertEquals("test1",group1.getName());
        assertEquals(products,group1.getProducts());

        //Clean
        groupRepository.delete(group1);
    }

    @Test
    public void testGroupFindById() {
        //Given
        List<Product> products = new ArrayList<>();

        Group group1 = new Group("test1", products);

        //When
        groupRepository.save(group1);
        Optional<Group> group = groupRepository.findById(group1.getId());

        //Then
        assertEquals(group.get().getId(), group1.getId());

        //Clean
        groupRepository.delete(group1);

    }

    @Test
    public void testDeleteById() {
        //Given
        List<Product> products = new ArrayList<>();

        Group group1 = new Group("test1", products);
        Group group2 = new Group("test2", products);
        Group group3 = new Group("test3", products);

        groupRepository.save(group1);
        groupRepository.save(group2);
        groupRepository.save(group3);

        //When

        groupRepository.deleteById(group3.getId());
        List<Group> groups = groupRepository.findAll();

        //Then
        assertEquals(2,groups.size());

        //Clean
        groupRepository.delete(group1);
        groupRepository.delete(group2);
    }
}