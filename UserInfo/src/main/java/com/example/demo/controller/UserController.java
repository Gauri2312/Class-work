package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class UserController {
	@GetMapping("/user")
	public List<User> getUsers(){
    List<User>users=new ArrayList<>();
    User user1=new User(1,"Gauri","Lakade","gauri@gmail.com");
    User user2=new User(2,"Raj","wagh","rajwagh5gmail.com");
    users.add(user1);
    users.add(user2);
    return users;
   }
}
