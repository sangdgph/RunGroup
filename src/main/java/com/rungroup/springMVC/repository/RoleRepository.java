package com.rungroup.springMVC.repository;

import com.rungroup.springMVC.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}