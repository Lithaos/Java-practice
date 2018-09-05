package com.study.kurs.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:castle.properties")
public class Castle {

	@Value("${my.castle.name:East Watch}")
	private String name = "East Watch";

	
	
	Knight knight;
	
	@Autowired
	public Castle(Knight knight)
	{
		this.knight = knight;
	}
	
	Castle(Knight knight, String name) {
		this.knight = knight;
		this.name = name;
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
			return "Znajduje sie tu zamek o nazwie " + name + ". Zamieszkały przez rycerza " + knight;
	}
}
