package net.javaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	   User findByEmail(String email);

}
