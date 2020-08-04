package com.kodilla.ecommercee.controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

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

    public void deleteUserById (@PathVariable("userId") Long userId){
    }

    @GetMapping("/{userId}")

    public UserDto getUser(@PathVariable("userId") Long userId) {

        return new UserDto ();
    }

}
