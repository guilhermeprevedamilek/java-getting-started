package com.guilherme_preveda.springbootdockerized.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme_preveda.springbootdockerized.model.User;
import com.guilherme_preveda.springbootdockerized.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping
  public List<User> findAll() {
    return userService.findAll();
  }

  @PostMapping
  public User add(@RequestBody User user) {
    return userService.add(user);
  }

}
