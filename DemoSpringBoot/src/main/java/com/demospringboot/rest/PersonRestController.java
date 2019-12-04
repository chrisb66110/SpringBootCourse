package com.demospringboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demospringboot.model.Person;
import com.demospringboot.service.IPersonService;

@RestController
@RequestMapping("/persons")
public class PersonRestController {
	
	@Autowired
	private IPersonService personService;
	
	@GetMapping("/findall")
	public List<Person> list(){
		return personService.findAll();
	}
	
	@GetMapping("/find/{idPerson}")
	public Person find(@PathVariable("idPerson") int idPerson) {
		return personService.find(idPerson);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody Person person){
		personService.insert(person);
	}
	
	@PutMapping("/edit")
	public Person edit(@RequestBody Person person) {
		return personService.edit(person);
	}

	@DeleteMapping("/delete/{idPerson}")
	public void delete(@PathVariable("idPerson") int idPerson) {
		personService.delete(idPerson);
	}

}
