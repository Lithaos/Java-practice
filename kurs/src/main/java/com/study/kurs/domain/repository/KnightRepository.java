package com.study.kurs.domain.repository;

import java.util.Collection;

import com.study.kurs.domain.Knight;

public interface KnightRepository {

	void createKnight(String name, int age);

	Collection<Knight> getAllKnights();

	Knight getKnight(String name);

	void deleteKnight(String name);

	void build();
	
	void createKnight(Knight knight);

}