package com.study.kurs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.kurs.domain.Knight;
import com.study.kurs.domain.Quest;
import com.study.kurs.services.KnightService;
import com.study.kurs.services.QuestService;

@Controller
public class QuestController {

	@Autowired
	KnightService knightService;
	
	@Autowired
	QuestService questService;
	
	@RequestMapping("/assignQuest")
	public String assignQuest(@RequestParam("knightId") Integer id, Model model) {
		Knight knight = knightService.getKnight(id);
		List<Quest> notStartedQuests = questService.getAllNotStartetQuests(); 
		model.addAttribute("knight",knight);
		model.addAttribute("notStartedQuests",notStartedQuests);
		return "assignQuest";
		
	}
}
