package com.study.kurs.domain;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

public class Knight {

	private String name;
	private int age;
	private Quest quest;

//    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;
//    }

	public Knight() {
		this.name = "Lancelot";
		this.age = 29;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Knight knight = (Knight) o;
		return age == knight.age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	public Knight(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Autowired
	public void setQuest(Quest quest) {
		System.out.println("Ustawiam zadanie dla rycerza.");
		this.quest = quest;
	}

	@Override
	public String toString() {
		return "Rycerz o imieniu " + name + "(" + age + "). Ma za zadanie: " + quest;
	}
}
