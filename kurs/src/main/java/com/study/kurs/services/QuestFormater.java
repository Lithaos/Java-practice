package com.study.kurs.services;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Service;

import com.study.kurs.domain.Quest;
import com.study.kurs.domain.repository.QuestRepository;

@Service
public class QuestFormater implements Formatter<Quest> {

	@Autowired
	QuestRepository repository;

	@Override
	public Quest parse(String idAssStr, Locale locale) throws ParseException {
		Integer id = Integer.parseInt(idAssStr);
		repository.getQuest(id);
		return repository.getQuest(id);
	}

	@Override
	public String print(Quest object, Locale locale) {
		// TODO Auto-generated method stub
		return object.toString();
	}

}
