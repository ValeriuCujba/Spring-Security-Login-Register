package net.javaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	  Role findByName(String name);
}
