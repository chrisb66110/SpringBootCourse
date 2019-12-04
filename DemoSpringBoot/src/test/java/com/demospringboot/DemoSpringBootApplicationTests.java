package com.demospringboot;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.demospringboot.model.UserDataBase;
import com.demospringboot.repository.IUserDataBaseRepository;

@SpringBootTest
class DemoSpringBootApplicationTests {
	
	@Autowired
	private IUserDataBaseRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Test
	public void createUserRepositoryTest() {
		UserDataBase user = new UserDataBase();
		user.setId(4);
		user.setUserName("User4");
		user.setPassword(bCryptPasswordEncoder.encode("Password4"));
		UserDataBase userReturned = userRepository.save(user);
		
		assertTrue(bCryptPasswordEncoder.matches("Password4", userReturned.getPassword()));
	}

}
