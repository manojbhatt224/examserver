package com.manoj.examserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manoj.examserver.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
public User findByUsername(String username);
}
