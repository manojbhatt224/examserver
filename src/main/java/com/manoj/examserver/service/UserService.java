package com.manoj.examserver.service;

import java.util.Set;

import com.manoj.examserver.model.User;
import com.manoj.examserver.model.UserRole;

public interface UserService {
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;

}
