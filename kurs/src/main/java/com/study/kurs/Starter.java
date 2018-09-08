package com.study.kurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.study.kurs.domain.Castle;
import com.study.kurs.domain.Tournament;

@Component
@Scope("prototype")
public class Starter implements CommandLineRunner {

	@Autowired
	Castle castle;

	@Autowired
	Tournament tournament;

	@Override
	public void run(String... strings) throws Exception {

		System.out.println(castle);
		tournament.duel();
		System.out.println(tournament);
	}
}
