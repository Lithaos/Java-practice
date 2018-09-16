package com.study.kurs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.study.kurs.domain.repository.DBKnightRepository;
import com.study.kurs.domain.repository.InMemoryRepository;
import com.study.kurs.domain.repository.KnightRepository;

@Configuration
public class MainConfig {

	@Bean(name = "inMemoryKnightRepository")
	@Profile("dev")
	public KnightRepository createInMemoryRepo() {

		KnightRepository repo = new InMemoryRepository();
		return repo;
	}

	@Bean(name = "DBKnightRepository")
	@Profile("prod")
	public KnightRepository createDBRepo() {

		KnightRepository repo = new DBKnightRepository();
		return repo;
	}
}
