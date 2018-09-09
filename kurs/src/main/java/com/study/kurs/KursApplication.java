package com.study.kurs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:castle.properties")
public class KursApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursApplication.class, args);

		
	}
}
