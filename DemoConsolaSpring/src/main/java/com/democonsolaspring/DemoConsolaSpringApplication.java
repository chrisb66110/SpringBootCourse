package com.democonsolaspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.democonsolaspring.service.IPersonaService;

@SpringBootApplication
public class DemoConsolaSpringApplication implements CommandLineRunner {
	
	private static Logger Log = LoggerFactory.getLogger(DemoConsolaSpringApplication.class);
	
	@Autowired
	private IPersonaService servicePersona;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Log.info("Hola desde Logger-info");
		//Log.warn("Hola desde Logger-warm");
		
		servicePersona.registrar("Christofer");
	}

}
