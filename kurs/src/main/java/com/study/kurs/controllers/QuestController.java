package com.study.kurs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.kurs.domain.Knight;
import com.study.kurs.domain.PlayerInformation;
import com.study.kurs.domain.Quest;
import com.study.kurs.services.KnightService;
import com.study.kurs.services.QuestService;

@Controller
public class QuestController {

	@Autowired
	KnightService knightService;

	@Autowired
	QuestService questService;

	@Autowired
	PlayerInformation playerInformation;

	@RequestMapping("/assignQuest")
	public String assignQuest(@RequestParam("knightId") Integer id, Model model) {
		Knight knight = knightService.getKnight(id);
		List<Quest> notStartedQuests = questService.getAllNotStartetQuests();
		model.addAttribute("knight", knight);
		model.addAttribute("notStartedQuests", notStartedQuests);
		return "assignQuest";

	}

	@RequestMapping(value = "/assignQuest", method = RequestMethod.POST)
	public String assignQuest(Knight knight) {
		knightService.updateKnight(knight);
		Quest quest = knight.getQuest();
		questService.update(quest);
		return "redirect:/knights";

	}

	@RequestMapping(value = "/checkQuests")
	public String checkQuest() {

		List<Knight> allKnights = knightService.getAllKnights();
		allKnights.forEach(knight -> {
			knight.getQuest().isComplited();
		});

		int currentGold = playerInformation.getGold();

		playerInformation.setGold(currentGold + knightService.collectRewards());

		return "redirect:/knights";

	}
}
