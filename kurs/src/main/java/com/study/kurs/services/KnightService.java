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
	
	public List<Knight> getAllKnights(){
		return new ArrayList<>(knightRepository.getAllKnights());
	}
	
	public void saveKnight(Knight knight) {
		knightRepository.createKnight(knight);
	}
	
	public Knight getKnight(Integer id) {
		return knightRepository.getKnightById(id);
	}
}
