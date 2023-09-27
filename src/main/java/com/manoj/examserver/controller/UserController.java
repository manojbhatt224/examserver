package com.manoj.examserver.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manoj.examserver.model.Role;
import com.manoj.examserver.model.User;
import com.manoj.examserver.model.UserRole;
import com.manoj.examserver.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
	
		Set<UserRole> roles=new HashSet<>();
		Role role=new Role();
		role.setRoleName("NORMAL");
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		roles.add(userRole);
		
		return this.userService.createUser(user, roles);
	}

}
