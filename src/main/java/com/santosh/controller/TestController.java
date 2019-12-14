package com.santosh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/")
	public String welcome() {
		return "Spring Security";
	}

	@GetMapping("/login")
	public String login() {
		return "Login page";
	}
}
