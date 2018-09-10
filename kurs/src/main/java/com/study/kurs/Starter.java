package com.study.kurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.study.kurs.domain.repository.KnightRepository;
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


	@Override
	public void run(String... strings) throws Exception {

		questRepository.createRandomQuest();
		questRepository.createRandomQuest();

	}
}
