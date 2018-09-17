package com.study.kurs.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.study.kurs.domain.Knight;
import com.study.kurs.domain.PlayerInformation;
import com.study.kurs.domain.repository.KnightRepository;
import com.study.kurs.domain.repository.PlayerInformationRepository;
import com.study.kurs.domain.repository.QuestRepository;

@Component
public class KnightService {

	@Autowired
	KnightRepository knightRepository;

	@Autowired
	QuestRepository questRepository;

	@Autowired
	PlayerInformationRepository playerInformation;

	public List<Knight> getAllKnights() {
		return new ArrayList<>(knightRepository.getAllKnights());
	}

	public void saveKnight(Knight knight) {
		knightRepository.createKnight(knight);
	}

	public Knight getKnight(Integer id) {
		return knightRepository.getKnightById(id);
	}

	public void deleteKnight(Integer id) {
		knightRepository.deleteKnight(id);
	}

	public void updateKnight(Knight knight) {
		knightRepository.updateKnight(knight.getId(), knight);
	}

	public int collectRewards() {
		Predicate<Knight> knightPredicate = knight -> {
			if (knight.getQuest() != null) {
				return knight.getQuest().isComplited();
			} else {
				return false;
			}
		};

		int sum = knightRepository.getAllKnights().stream().filter(knightPredicate)
				.mapToInt(knight -> knight.getQuest().getReward()).sum();
		knightRepository.getAllKnights().stream().filter(knightPredicate).forEach(knight -> {
			knight.setQuest(null);
		});

		return sum;
	}

	public int collectExperience() {
		Predicate<Knight> knightPredicate = knight -> {
			if (knight.getQuest() != null) {
				return knight.getQuest().isComplited();
			} else {
				return false;
			}
		};

		int exp = knightRepository.getAllKnights().stream().filter(knightPredicate)
				.mapToInt(knight -> knight.getQuest().getExperience()).sum();
		return exp;
	}

	public void checkExperience() {
		knightRepository.getAllKnights().stream().forEach(knight -> {
			int knightExp = knight.getExperience();
			if (knightExp >= 100) {
				knight.setLevel(knight.getLevel() + 1);
				knight.setExperience(0);
			}
		});
	}

	@Transactional
	public void getMyGold() {
		List<Knight> allKnights = getAllKnights();
		allKnights.forEach(knight -> {
			if (knight.getQuest() != null) {
				boolean completed = knight.getQuest().isComplited();
				if (completed) {
					questRepository.update(knight.getQuest());
				}
			}
		});

		PlayerInformation first = playerInformation.getFirst();

		int currentGold = first.getGold();
		int currentExp = first.getExperience();
		first.setExperience(currentExp + collectExperience());
		first.setGold(currentGold + collectRewards());
	}

}
