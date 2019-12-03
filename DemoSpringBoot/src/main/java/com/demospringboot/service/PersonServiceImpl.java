package com.demospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demospringboot.model.Person;
import com.demospringboot.repository.IPersonRepository;

@Service
public class PersonServiceImpl implements IPersonService {
	
	@Autowired
	private IPersonRepository personRepository;

	@Override
	public List<Person> findAll() {
		return this.personRepository.findAll();	
	}

	@Override
	public void save(Person person) {
		this.personRepository.save(person);
	}

}
