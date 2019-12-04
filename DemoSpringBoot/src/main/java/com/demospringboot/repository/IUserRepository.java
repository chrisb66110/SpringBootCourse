package com.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demospringboot.model.User;

public interface IUserRepository extends JpaRepository<User, Integer>{

}
