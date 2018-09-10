package com.study.kurs.domain;

import java.util.Objects;

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

	public void setQuest(Quest quest) {
		System.out.println("Ustawiam zadanie dla rycerza.");
		this.quest = quest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Rycerz o imieniu " + name + "(" + age + "). Ma za zadanie: " + quest;
	}
}
