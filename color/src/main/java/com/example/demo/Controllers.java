package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {
	     @GetMapping("color")
	     public String color()
	     {
	    	 String color ="Blue";
	    	 return "My favourite color is :"+color;
	     }
	     
}
