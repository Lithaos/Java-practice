package com.study.kurs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.study.kurs.domain.repository.DBKnightRepository;
import com.study.kurs.domain.repository.InMemoryRepository;
import com.study.kurs.domain.repository.KnightRepository;

@Configuration
public class MainConfig {

	@Bean(name = "inMemoryKnightRepository")
	@Primary
	public KnightRepository createInMemoryRepo() {

		KnightRepository repo = new InMemoryRepository();
		return repo;
	}

	@Bean(name = "DBKnightRepository")
	public KnightRepository createDBRepo() {

		KnightRepository repo = new DBKnightRepository();
		return repo;
	}
}
