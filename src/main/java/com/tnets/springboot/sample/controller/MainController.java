package com.tnets.springboot.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tnets.springboot.sample.entities.User;

@Controller
public class MainController {

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

}
