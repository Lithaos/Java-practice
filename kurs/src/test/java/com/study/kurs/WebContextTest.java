package com.study.kurs;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.study.kurs.controllers.QuestController;
import com.study.kurs.domain.Knight;
import com.study.kurs.domain.PlayerInformation;
import com.study.kurs.domain.Quest;
import com.study.kurs.services.KnightService;
import com.study.kurs.services.QuestService;

@RunWith(SpringRunner.class)
@WebAppConfiguration
public class WebContextTest {

	@Mock
	KnightService knightService;

	@Mock
	QuestService questService;

	@Mock
	PlayerInformation playerInformation;

	@InjectMocks
	QuestController questController;

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(questController).build();
	}

	@Test
	public void testCheckQuest() throws Exception {

		Quest quest = new Quest(1, "Zadanie testowe");
		Knight percival1 = new Knight("Percival1", 33);
		Knight percival2 = new Knight("Percival2", 34);

		percival1.setQuest(quest);

		List<Knight> knights = new ArrayList<>(2);
		knights.add(percival1);
		knights.add(percival2);

		when(knightService.getAllKnights()).thenReturn(knights);

		mockMvc.perform(get("/checkQuests"));
	}

	@Test
	public void contextLoads() {
	}

}
