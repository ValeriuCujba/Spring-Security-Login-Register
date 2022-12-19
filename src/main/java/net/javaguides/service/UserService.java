package net.javaguides.service;

import java.util.List;

import net.javaguides.dto.UserDto;
import net.javaguides.entity.User;

public interface UserService {
	void saveUser(UserDto userDto);

	User findUserByEmail(String email);

	List<UserDto> findAllUsers();
}
