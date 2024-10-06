package com.project.Spotknack.Service;

import com.project.Spotknack.Entity.User;
import com.project.Spotknack.Repository.UserRepo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User CreateUser(User user){
        return userRepo.save(user);
    }

    public List<User> getUser(){
        return userRepo.findAll();
    }

    public List<User> getbyname(Integer userid){
        return userRepo.findUsername(userid);
    }
}
