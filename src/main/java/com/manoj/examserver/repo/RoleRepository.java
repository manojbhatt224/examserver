package com.manoj.examserver.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manoj.examserver.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
