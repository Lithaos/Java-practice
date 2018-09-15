package com.study.kurs.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.study.kurs.domain.Knight;
import com.study.kurs.domain.repository.KnightRepository;

@Component
public class KnightService {

	@Autowired
	KnightRepository knightRepository;

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
		int sum = knightRepository.getAllKnights().stream().filter(knight -> knight.getQuest().isComplited())
				.mapToInt(knight -> knight.getQuest().getReward()).sum();
		knightRepository.getAllKnights().stream().filter(knight -> knight.getQuest().isComplited()).forEach(knight -> {
			knight.setQuest(null);
		});

		return sum;
	}
}
