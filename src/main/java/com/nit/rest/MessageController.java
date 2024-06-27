package com.nit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	
	@GetMapping("/msg/{name}")
	public String sendMessage(@PathVariable String name) {
		return "Hello Guys , Good Morning from "+name;
	}

}
