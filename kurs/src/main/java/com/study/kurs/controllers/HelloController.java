package com.study.kurs.controllers;	

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

		@RequestMapping("/hello")
		public String hell()
		{
			return "helloworld.html";
		}
}
