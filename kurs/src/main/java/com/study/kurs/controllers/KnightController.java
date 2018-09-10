package com.study.kurs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.kurs.domain.Knight;
import com.study.kurs.services.KnightService;

@Controller
public class KnightController {
	
	@Autowired
	KnightService service;
	
	@RequestMapping("/knights")
	public String getKnights(Model model) {
			List<Knight> allKnights = service.getAllKnights();
			model.addAttribute("knights",allKnights);
		return "knights";
	}
}
	