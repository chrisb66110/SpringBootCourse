package com.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
	@GetMapping("/PathExampleTemplate")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		//Se manda a la vista mediante la siguiente instruccion
		model.addAttribute("name", name);
		return "PathExampleTemplate";
	}

}
