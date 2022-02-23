package com.gray.bookclub.services;

import java.util.Optional;


import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.gray.bookclub.models.LoginUser;
import com.gray.bookclub.models.User;
import com.gray.bookclub.repositories.UserRepository;

@Service
public class RegistrationService {
//	Do not have to initialize with Autowired. Need for each Repo
	@Autowired
	private UserRepository userRepo;

	// TO-DO: Write register and login methods!
	public User register(User newUser, BindingResult result) {
//    	Checking to see if email from form can be found in Db
		Optional<User> potentialUser = userRepo.findByEmail(newUser.getEmail());

		if (potentialUser.isPresent()) {
			result.rejectValue("email", "Email Taken", "Email already in use, choose another");
		}

		if (!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("confirm", "Password", "Passwords do not match, re-enter passwords");
		}

		if (result.hasErrors()) {
			return null;
		} else {
			String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());

			newUser.setPassword(hashed);
			return userRepo.save(newUser);

		}

	}

	public User login(LoginUser newLoginObject, BindingResult result) {
		Optional<User> potentialUser = userRepo.findByEmail(newLoginObject.getEmail());
		
		if(!potentialUser.isPresent()) {
			result.rejectValue("email", "Email not found", "Email not found, try again!");

		} else {
			if(!BCrypt.checkpw(newLoginObject.getPassword(), potentialUser.get().getPassword())) {
			    result.rejectValue("password", "Doesn't match", "Invalid Password!");
			}

		}

		if(result.hasErrors()) {
			return null;
		} else {
			return potentialUser.get();
		}
		
	}
	
	public User findOneUer(Long id) {
		return this.userRepo.findById(id).orElse(null);
	}

}
