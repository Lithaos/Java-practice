package com.study.kurs.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.study.kurs.domain.Knight;
import com.study.kurs.domain.Quest;

@Configuration
//@ImportResource("classpath:config/castle-config.xml")
public class MainConfig {

	@Autowired
	Quest quest;

	@Bean(name = "lancelot")
	@Primary
	public Knight lancelot() {
		Knight lancelot = new Knight("Lancelot", 29);
		lancelot.setQuest(quest);
		return lancelot;
	}

	@Bean(name = "percival")
	public Knight createKnightBean() {
		Knight persival = new Knight("Percival", 25);
		persival.setQuest(quest);
		return persival;
	}

//	@Bean(name="zamek", initMethod = "build", destroyMethod = "tearDown")
//	@Value("${my.castle.name:East Watch}")
//	public Castle castle(String name) {
//		Castle castle = new Castle(knight());
//		castle.setName(name);
//		return castle;
//	}
//
//	

}
