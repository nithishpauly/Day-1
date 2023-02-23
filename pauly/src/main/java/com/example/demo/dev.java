package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dev {
	@GetMapping("hii")
	public String welcome()
	{
		return "welcome string boot";
	}
	

}
