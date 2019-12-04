package com.demospringboot.service;

import java.util.List;

import com.demospringboot.model.UserDataBase;

public interface IUserDataBaseService {
	
	List<UserDataBase> findAll();
	
	UserDataBase find(int idPerson);
	
	UserDataBase insert(UserDataBase person);
	
	UserDataBase edit(UserDataBase person);
	
	void delete(int idPerson);
	
}
