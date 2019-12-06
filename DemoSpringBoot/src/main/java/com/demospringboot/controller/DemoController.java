package com.demospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demospringboot.model.Person;
import com.demospringboot.model.UserDataBase;
import com.demospringboot.service.IPersonService;
import com.demospringboot.service.IUserDataBaseService;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonService personaService;
	
	@Autowired
	 private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private IUserDataBaseService userDataBaseService;
	
	@GetMapping("/PathExampleTemplate")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		//Se manda a la vista mediante la siguiente instruccion
		model.addAttribute("name", name);
		return "PathExampleTemplate";
	}
	
	
	@GetMapping("/Person/save")
	public String personSave(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		Person person = new Person();
		person.setIdPerson(2);
		person.setName("Persona 2");
		
		personaService.insert(person);
		
		//Se manda a la vista mediante la siguiente instruccion
		model.addAttribute("name", name);
		return "PathExampleTemplate";
	}
	
	@GetMapping("/registeruser")
	public String registeruser(Model model) {
		UserDataBase user = new UserDataBase();
		user.setId(0);
		user.setUserName("root");
		user.setPassword(bCryptPasswordEncoder.encode("1234"));
		userDataBaseService.insert(user);
		return "User: " + user.getUserName() + "\nPassword: " + user.getPassword();
	}
	
	@GetMapping("/Person/list")
	public String personList(Model model) {
		List<Person> listPersons  = personaService.findAll();
		
		//Se manda a la vista mediante la siguiente instruccion
		model.addAttribute("persons", listPersons);
		return "PathExampleTemplate";
	}

}
