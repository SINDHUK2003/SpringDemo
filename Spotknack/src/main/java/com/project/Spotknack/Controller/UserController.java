package com.project.Spotknack.Controller;

import com.project.Spotknack.Entity.User;
import com.project.Spotknack.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/User/createUser")
    public User createUser(@RequestBody User user){
        return userService.CreateUser(user);
    }

    @GetMapping("/User/getUser")
    public List<User> getUser(){
        return userService.getUser();
    }

//    @GetMapping("/User/getByName/{username}")
//    public List<User> getByNmae(@PathVariable String username){
//        return userService.getbyname(username);
    }

    @GetMapping("/User/getUsername/{userid}")
    public List<User> getUsername(@PathVariable Integer userid){
        return userService.getbyname();

    }


}
