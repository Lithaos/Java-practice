package com.study.kurs.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
public class Knight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	@Size(min = 2, max = 40, message = "Imie rycerza musi miec miedzy 2, a 40 znakow")
	private String name;

	@NotNull
	@Range(min = 18, max = 60, message = "Rycerz musi miec conajmniej 18 lat, a nie wiecej niz 60")
	private int age;

	private int level = 1;

	private int experience = 0;

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@OneToOne
	private Quest quest;

	public Knight() {

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
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
		this.level = 1;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public Quest getQuest() {
		return quest;
	}

	public void setQuest(Quest quest) {
		if (quest != null) {
			quest.setStarted(true);
		}
		this.quest = quest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Rycerz o imieniu " + name + "(" + age + "). Ma za zadanie: " + quest;
	}
}
