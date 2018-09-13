package com.study.kurs.domain.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import com.study.kurs.domain.Quest;
import com.study.kurs.utils.Ids;

@Repository
public class QuestRepository {

	Map<Integer, Quest> quests = new HashMap<>();

	Random rand = new Random();

	public void createQuest(String description) {
		int newId = Ids.getNewId(quests.keySet());
		Quest newQuest = new Quest(newId, description);
		quests.put(newId, newQuest);
	}

	public List<Quest> getAll() {
		return new ArrayList<>(quests.values());
	}

	public void deleteQuest(Quest quest) {
		quests.remove(quest.getId());

	}

	@PostConstruct
	public void init() {

	}

	@Override
	public String toString() {
		return "QuestRepository [quests=" + quests + "]";
	}

	@Scheduled(fixedDelay = 50000)
	public void createRandomQuest() {
		List<String> descriptions = new ArrayList<>();

		descriptions.add("Uratuj ksiezniczke");
		descriptions.add("Wez udzial w turnieju");
		descriptions.add("Zabij bande goblinow");
		descriptions.add("Zabij smoka");

		String description = descriptions.get(rand.nextInt(descriptions.size()));
		createQuest(description);

	}

	public void update(Quest quest) {
		quests.put(quest.getId(), quest);
	}

	public Quest getQuest(Integer id) {
		return quests.get(id);

	}
}
