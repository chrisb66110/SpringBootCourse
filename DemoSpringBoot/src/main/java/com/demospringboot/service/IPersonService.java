package com.demospringboot.service;

import java.util.List;

import com.demospringboot.model.Person;

public interface IPersonService {
	
	List<Person> findAll();
	
	Person find(int idPerson);
	
	Person insert(Person person);
	
	Person edit(Person person);
	
	void delete(int idPerson);
	
}
