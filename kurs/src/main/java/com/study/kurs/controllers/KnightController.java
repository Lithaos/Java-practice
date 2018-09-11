package com.study.kurs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/knight")
	public String getKnight(@RequestParam("id") Integer id, Model model) {
		Knight knight = service.getKnight(id);
		model.addAttribute("knight",knight);
		return "knight";
	}
	
	@RequestMapping("/newKnight")
	public String createKnight(Model model) {
		model.addAttribute("knight", new Knight());
		return "knightform";
	}
	
	@RequestMapping(value="/knights", method=RequestMethod.POST)
	public String saveKnights(Knight knight) {
			service.saveKnight(knight);
		return "redirect:/knights";
	}
}
	