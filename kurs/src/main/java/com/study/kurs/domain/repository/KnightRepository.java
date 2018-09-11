package com.study.kurs.domain.repository;

import java.util.Collection;
import java.util.Optional;

import com.study.kurs.domain.Knight;

public interface KnightRepository {

	void createKnight(String name, int age);

	Collection<Knight> getAllKnights();

	Optional<Knight> getKnight(String name);

	void deleteKnight(Integer id);

	void build();

	void createKnight(Knight knight);

	Knight getKnightById(Integer id);
}