package com.kodilla.ecommercee.controller;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @PostMapping()

    public void createUser(@RequestBody UserDto userDto) {

    }

    @GetMapping()

    public List<UserDto> getUsers(){

        return new ArrayList<>();
    }

    @PutMapping(

            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE)

    public UserDto updateUser(@RequestBody UserDto userDto){
        return new UserDto ();
    }

    @DeleteMapping("/{userId}")

    public void deleteUser (
            @PathParam("userId") Long productId){

    }

    @GetMapping(
            value = "/{userId}")

    public UserDto getUser(
            @PathParam("userId") Long userId) {

        return new UserDto ();
    }
}
