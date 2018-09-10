package com.study.kurs.domain.repository;

import java.util.Collection;

import javax.annotation.PostConstruct;

import com.study.kurs.domain.Knight;


public class DBKnightRepository implements KnightRepository{
	@Override
	public void createKnight(String name, int age) {
		System.out.println("Używam bazy danych");
	}
	

	@Override
	public Collection<Knight> getAllKnights(){
		System.out.println("Używam bazy danych");
		return null;
	}


	@Override
	public Knight getKnight(String name) {
		System.out.println("Używam bazy danych");
		return null;
	}
	

	@Override
	public void deleteKnight(String name) {
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
}
