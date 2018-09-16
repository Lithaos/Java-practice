package com.study.kurs;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.study.kurs.domain.PlayerInformation;
import com.study.kurs.domain.repository.KnightRepository;
import com.study.kurs.domain.repository.PlayerInformationRepository;
import com.study.kurs.domain.repository.QuestRepository;
import com.study.kurs.services.QuestService;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {
	@Autowired
	KnightRepository knightRepository;

	@Autowired
	QuestRepository questRepository;

	@Autowired
	QuestService questService;

	@Autowired
	PlayerInformationRepository playerInformationRepository;

	@Override
	@Transactional
	public void run(String... strings) throws Exception {

		questRepository.createRandomQuest();
		questRepository.createRandomQuest();

		knightRepository.createKnight("Percival", 32);

		playerInformationRepository.createPlayerInfromation(new PlayerInformation());

		questService.assignRandomQuest("Percival");

	}

}