package com.demospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demospringboot.model.UserDataBase;

public interface IUserDataBaseRepository extends JpaRepository<UserDataBase, Integer>{
	
	//findByColumnName(type columnName), JPA automatically queries for that column
	UserDataBase findByUserName(String userName);

}
