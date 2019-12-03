package com.demospringboot.service;

import java.util.List;

import com.demospringboot.model.Person;

public interface IPersonService {
	
	List<Person> findAll();
	
	void save(Person persona);
	
}
