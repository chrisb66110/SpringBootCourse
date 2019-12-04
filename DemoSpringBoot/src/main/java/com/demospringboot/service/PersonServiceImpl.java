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
		return personRepository.findAll();
	}

	@Override
	public Person find(int idPerson) {
		return personRepository.findById(idPerson).orElse(null);
	}

	@Override
	public Person insert(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person edit(Person person) {
		return personRepository.save(person);
	}

	@Override
	public void delete(int idPerson) {
		personRepository.deleteById(idPerson);
	}

	

}
