package com.example.anisha;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class expenseManagerController {
	
	@GetMapping("/Hi")
	public String sayHello() {
		return "Hello";
	}

}
