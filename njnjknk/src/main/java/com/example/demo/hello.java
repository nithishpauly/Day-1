package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;



@Controller

public class hello {
	@RequestMapping("hello")
	public String Red(HttpServletRequest req) {
		String name =req.getParameter("name");
		HttpSession session=req.getSession();
		session.setAttribute("myname",name);
		return "NewFile.jsp";
	}

}
