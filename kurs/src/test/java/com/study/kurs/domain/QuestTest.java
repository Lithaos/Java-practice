package com.study.kurs.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuestTest {

	@Test
	public void settingStartedFlagToFalseShouldSetStartDate() {
		Quest quest = new Quest(1, "Testowe zadanie");

		quest.setStarted(true);

		assertNotNull(quest.startDate);
	}

	@Test
	public void questShouldBeCompleted() {
		Quest quest = new Quest(1, "Testowe zadanie");

		quest.setStarted(true);
		quest.lengthInSeconds = -60;
		assertTrue(quest.isComplited());
		assertTrue(quest.isComplited());

	}

	@Test
	public void questShouldNotBeCompleted() {
		Quest quest = new Quest(1, "Testowe zadanie");

		quest.setStarted(true);
		quest.lengthInSeconds = 20000;
		assertFalse(quest.isComplited());
		assertFalse(quest.isComplited());

	}
}
