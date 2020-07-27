package com.kodilla.ecommercee.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET, value = "getUsers")
    public List<UserDto> getUsers(){

        return new ArrayList<>();
    }

    @RequestMapping(method = RequestMethod.GET, value = "getUser")
    public UserDto getUser(@RequestParam Long userId) {

        return new UserDto ();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteUser")
    public void deleteUser (@RequestParam Long productId){

    }

    @RequestMapping(method = RequestMethod.PUT,value = "updateUser")
    public UserDto updateUser(@RequestBody UserDto userDto){
        return new UserDto ();
    }

    @RequestMapping(method = RequestMethod.POST, value = "createUser", consumes = APPLICATION_JSON_VALUE)
    public void createUser(@RequestBody UserDto userDto) {

    }
}
