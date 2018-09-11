package com.study.kurs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.kurs.components.TimeComponent;
import com.study.kurs.domain.Knight;
import com.study.kurs.domain.PlayerInformation;
import com.study.kurs.services.KnightService;

@Controller
public class KnightController {

	@Autowired
	TimeComponent timeComponent;

	@Autowired
	PlayerInformation playerInformation;

	@Autowired
	KnightService service;

	@RequestMapping("/knights")
	public String getKnights(Model model) {
		List<Knight> allKnights = service.getAllKnights();
		model.addAttribute("knights", allKnights);
		model.addAttribute("timeComponent", timeComponent);
		model.addAttribute("playerInformation", playerInformation);
		return "knights";
	}

	@RequestMapping("/knight")
	public String getKnight(@RequestParam("id") Integer id, Model model) {
		Knight knight = service.getKnight(id);
		model.addAttribute("knight", knight);
		model.addAttribute("timeComponent", timeComponent);
		model.addAttribute("playerInformation", playerInformation);
		return "knight";
	}

	@RequestMapping("/newKnight")
	public String createKnight(Model model) {
		model.addAttribute("knight", new Knight());
		model.addAttribute("timeComponent", timeComponent);
		model.addAttribute("playerInformation", playerInformation);
		return "knightform";
	}

	@RequestMapping(value = "/knights", method = RequestMethod.POST)
	public String saveKnights(Knight knight) {
		service.saveKnight(knight);
		return "redirect:/knights";
	}

	@RequestMapping(value = "/knight/delete/{id}")
	public String deleteKnight(@PathVariable("id") Integer id) {
		service.deleteKnight(id);
		return "redirect:/knights";
	}
}
