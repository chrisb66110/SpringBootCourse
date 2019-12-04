package com.demospringboot;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.demospringboot.model.User;
import com.demospringboot.repository.IUserRepository;

@SpringBootTest
class DemoSpringBootApplicationTests {
	
	@Autowired
	private IUserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Test
	public void createUserRepositoryTest() {
		User user = new User();
		user.setId(3);
		user.setUserName("Usuario3");
		user.setPassword(bCryptPasswordEncoder.encode("Password3"));
		User userReturned = userRepository.save(user);
		
		assertTrue(bCryptPasswordEncoder.matches("Password3", userReturned.getPassword()));
	}

}
