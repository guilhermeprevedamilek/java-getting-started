package com.guilherme_preveda.springbootdockerized.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme_preveda.springbootdockerized.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
