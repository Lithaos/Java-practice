package com.study.kurs.services;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.kurs.domain.Quest;
import com.study.kurs.domain.repository.KnightRepository;
import com.study.kurs.domain.repository.QuestRepository;

@Service
public class QuestService {

	@Autowired
	KnightRepository knightRepository;

	QuestRepository questRepository;

	final static Random rand = new Random();

	public void assignRandomQuest(String knightName) {

		List<Quest> allQuests = questRepository.getAll();
		Quest randomQuest = allQuests.get(rand.nextInt(allQuests.size()));
		knightRepository.getKnight(knightName).ifPresent(knight -> knight.setQuest(randomQuest));

		questRepository.deleteQuest(randomQuest);
	}

	public List<Quest> getAllNotStartetQuests() {
		return questRepository.getAll().stream().filter(quest -> !quest.isStarted()).collect(Collectors.toList());
	}

	@Autowired
	public void setQuestRepository(QuestRepository questRepository) {
		this.questRepository = questRepository;
	}

	public void update(Quest quest) {
		questRepository.update(quest);
	}

}
