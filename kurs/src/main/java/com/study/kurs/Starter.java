package com.study.kurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.study.kurs.domain.Castle;

@Component("starter")
public class Starter implements CommandLineRunner {


	
	@Autowired
	Castle castle;
	
	@Override
	public void run(String... strings) throws Exception {

		
		System.out.println(castle);
		
	}
}
