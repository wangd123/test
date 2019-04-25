package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController1 {
	@GetMapping("/test")
	public String show() {
		
		
		return "我是user11111111";
	}

}
