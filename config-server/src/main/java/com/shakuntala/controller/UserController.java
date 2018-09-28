package com.shakuntala.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/api")
public class UserController {
	
	
	@GetMapping(value="/home")
	public String getHome() {
		return "This is the home page";
	}

}
