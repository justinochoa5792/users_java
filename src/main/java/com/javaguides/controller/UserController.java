package com.javaguides.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaguides.model.User;
import com.javaguides.repository.UserRepo;

@RestController
@RequestMapping("api/")
public class UserController {

@Autowired
private UserRepo userRepo;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepo.findAll();
    }
    
}
