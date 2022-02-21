package com.gray.login_reg.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.gray.login_reg.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	Optional<User> findByEmail(String email);

}
