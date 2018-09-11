package com.study.kurs.domain.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import com.study.kurs.domain.Knight;

public class DBKnightRepository implements KnightRepository {

	Map<Integer, Knight> knights = new HashMap<>();

	@Override
	public void createKnight(String name, int age) {
		System.out.println("Używam bazy danych");
	}

	@Override
	public Collection<Knight> getAllKnights() {
		System.out.println("Używam bazy danych");
		return null;
	}

	@Override
	public Optional<Knight> getKnight(String name) {
		Optional<Knight> knightByName = knights.values().stream().filter(knight -> knight.getName().equals(name))
				.findAny();
		return knightByName;
	}

	@Override
	public void deleteKnight(Integer id) {
		System.out.println("Używam bazy danych");
	}

	@Override
	@PostConstruct
	public void build() {

	}

	@Override
	public void createKnight(Knight knight) {
		// TODO Auto-generated method stub

	}

	@Override
	public Knight getKnightById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
