package com.study.kurs.domain.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import com.study.kurs.domain.Quest;

@Repository
public class QuestRepository {

	List<Quest> questList = new ArrayList<>();

	Random rand = new Random();
	public void createQuest(String description) {
		questList.add(new Quest(description));
	}

	public List<Quest> getAll() {
		return questList;
	}

	public void deleteQuest(Quest quest) {
		questList.remove(quest);

	}

	@PostConstruct
	public void init() {
		
	}

	@Override
	public String toString() {
		return "QuestRepository [questList=" + questList + "]";
	}
	
	@Scheduled(fixedDelay= 50000)
	public void createRandomQuest() {
		List<String> descriptions = new ArrayList<>();
		
		descriptions.add("Uratuj ksiezniczke");
		descriptions.add("Wez udzial w turnieju");
		descriptions.add("Zabij bande goblinow");
		descriptions.add("Zabij smoka");
		
		String description = descriptions.get(rand.nextInt(descriptions.size()));
		createQuest(description);
		
	}
}
