package com.study.kurs.domain;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tournament {

	@Autowired
	List<Knight> knights;

	public Tournament() {

	}

	public void duel() {
		// knight.setAge(knight.getAge()+1);
	}

	public void setKnight(List<Knight> knights) {
		this.knights = knights;
	}

	@Override
	public String toString() {

		return "W turnieju biera udzial rycerze "
				+ knights.stream().map(Object::toString).collect(Collectors.joining(","));
	}
}
