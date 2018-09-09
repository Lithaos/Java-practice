package com.study.kurs.domain.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.study.kurs.domain.Quest;

@Repository
public class QuestRepository {

	List<Quest> questList = new ArrayList<>();

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
		createQuest("Uratuj ksiezniczke");
		createQuest("Wez udzial w turnieju");
	}

	@Override
	public String toString() {
		return "QuestRepository [questList=" + questList + "]";
	}
}
