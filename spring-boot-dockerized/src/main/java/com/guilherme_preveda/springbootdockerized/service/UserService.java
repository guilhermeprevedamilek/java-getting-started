package com.guilherme_preveda.springbootdockerized.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme_preveda.springbootdockerized.model.User;
import com.guilherme_preveda.springbootdockerized.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User add(User user) {
    return userRepository.saveAndFlush(user);
  }

}
