package com.demospringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demospringboot.model.UserDataBase;
import com.demospringboot.repository.IUserDataBaseRepository;

@Service
public class UserDataBaseServiceImpl implements IUserDataBaseService, UserDetailsService {
	
	@Autowired
	private IUserDataBaseRepository userRepository;

	@Override
	public List<UserDataBase> findAll() {
		return userRepository.findAll();
	}

	@Override
	public UserDataBase find(int idUser) {
		return userRepository.findById(idUser).orElse(null);
	}

	@Override
	public UserDataBase insert(UserDataBase user) {
		return userRepository.save(user);
	}

	@Override
	public UserDataBase edit(UserDataBase user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(int idUser) {
		userRepository.deleteById(idUser);
	}

	//UserDetailsService method to manage users from Spring Security
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDataBase user = userRepository.findByUserName(username);
		
		//Must be go to database roles
		List<GrantedAuthority> autoritiesRoles = new ArrayList<>();
		autoritiesRoles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDetails = new User(user.getUserName(), user.getPassword(), autoritiesRoles);
		
		return userDetails;
	}

	

}
