package com.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demospringboot.model.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer>{

}
