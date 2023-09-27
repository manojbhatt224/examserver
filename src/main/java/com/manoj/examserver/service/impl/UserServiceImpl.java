package com.manoj.examserver.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manoj.examserver.model.User;
import com.manoj.examserver.model.UserRole;
import com.manoj.examserver.repo.RoleRepository;
import com.manoj.examserver.repo.UserRepository;
import com.manoj.examserver.service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository userRepo;
@Autowired
private RoleRepository roleRepo;
	
//creating user
@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User local=this.userRepo.findByUsername(user.getUsername());
		if(local!=null)
		{
			
			System.out.println("User is already there!!");
			throw new Exception("User already present!!");
		}
		else
			{
			for (UserRole ur:userRoles) {
				roleRepo.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local=this.userRepo.save(user);
			}
		return local;
	}

}
