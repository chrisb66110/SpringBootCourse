package com.democonsolaspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.democonsolaspring.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepo repoPersona;
	
	@Override
	public void registrar(String nombre) {
		repoPersona.registrar(nombre);
	}

}
