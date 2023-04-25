package com.wipro.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Welcome")
public class Welcome {

	@GetMapping("/get/{name}")
	public String getMessage(@PathVariable String name) {
		return name + "Welcome to Docker";
		
	}
}
