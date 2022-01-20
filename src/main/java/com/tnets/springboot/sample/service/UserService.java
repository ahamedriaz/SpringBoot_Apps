package com.tnets.springboot.sample.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.tnets.springboot.sample.entities.User;
import com.tnets.springboot.sample.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registration);

	User findByEmail(String userName);
}

