package com.study.kurs.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KnightTest {

	
		@Test
		public void testIfQuestMarketAsStarted()
		{
			Knight knight = new Knight("Percival", 25);
			Quest quest = new Quest("Testowe zadanie");
			
			knight.setQuest(quest);
			
			assertTrue(knight.getQuest().isStarted());
		}
}
