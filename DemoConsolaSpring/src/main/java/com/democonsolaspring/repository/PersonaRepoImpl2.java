package com.democonsolaspring.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.democonsolaspring.DemoConsolaSpringApplication;

@Repository
@Qualifier("personarepo2")
public class PersonaRepoImpl2 implements IPersonaRepo {
	
	private static Logger Log = LoggerFactory.getLogger(DemoConsolaSpringApplication.class);

	@Override
	public void registrar(String nombre) {
		Log.info("SE REGISTRO POR PERSONAREPO2: " + nombre);
	}

}
