package com.manoj.examserver;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.manoj.examserver.model.Role;
import com.manoj.examserver.model.User;
import com.manoj.examserver.model.UserRole;
import com.manoj.examserver.service.UserService;

@SpringBootApplication
public class ExamserverApplication implements CommandLineRunner{
	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user=new User();
//		user.setFirstName("Manoj");
//		user.setLastName("Bhatt");
//		user.setUsername("manojbhatt224");
//		user.setPassword("12345");
//		user.setPhone("9810609258");
//		user.setEmail("manojbhatt224@gmail.com");
//		user.setProfile("default.png");
//		Role role=new Role();
//		role.setRoleName("ADMIN");
//		Set<UserRole> userRoleset=new HashSet<>();
//		UserRole userRole=new UserRole();
//		userRole.setRole(role);
//		userRole.setUser(user);
//				userRoleset.add(userRole);
//				User user1=this.userService.createUser(user, userRoleset);
//			System.out.println("Congratulations "+user1.getFirstName());
	}

}
