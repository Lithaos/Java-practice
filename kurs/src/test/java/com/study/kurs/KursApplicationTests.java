package com.study.kurs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.kurs.domain.Castle;
import com.study.kurs.domain.Knight;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KursApplicationTests {

	@Autowired
	Knight knight;
	
	@Autowired
	Castle castle;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testCastle() {
		String except = "Znajduje sie tu zamek o nazwie Castle Black. Zamieszkały przez rycerza Rycerz o imieniu Lancelot(29). Ma za zadanie: Uratuj ksiezniczke";
		assertEquals(except, castle.toString());
	}

}
