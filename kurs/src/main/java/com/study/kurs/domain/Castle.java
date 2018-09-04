package com.study.kurs.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Castle {

	private String name = "East Watch";

	public Castle() {

	}

	@PostConstruct
	public void build() {
		System.out.println("Wybudowano zamek " + name);
	}

	@PreDestroy
	public void tearDown() {
		System.out.println("Zaraz wyburzymy zamek " + name);
	}
	
	@Override
	public String toString()
	{
			return "Znajduje sie tu zamek o nazwie " +this.name;
	}
}
