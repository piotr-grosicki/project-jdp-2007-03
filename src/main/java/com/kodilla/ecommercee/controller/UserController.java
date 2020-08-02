package com.kodilla.ecommercee.controller;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @PostMapping("")

    public void createUser(@RequestBody UserDto userDto) {

    }

    @GetMapping("/users")

    public List<UserDto> getUsers(){

        return new ArrayList<>();
    }

    @PutMapping("")

    public UserDto updateUser(@RequestBody UserDto userDto){
        return new UserDto ();
    }

    @DeleteMapping("/{userId}")

    public void deleteUserById (@PathParam("userId") Long productId){
    }

    @GetMapping("/{userId}")

    public UserDto getUser(@PathParam("userId") Long userId) {

        return new UserDto ();
    }

}
