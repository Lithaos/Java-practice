package com.study.kurs.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String description;

	private int reward = 100;

	protected int lengthInSeconds = 10;

	private boolean started = false;

	private boolean complited = false;

	protected LocalDateTime startDate;

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public Quest(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public Quest() {

	}

	public Quest(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReward() {
		return reward;
	}

	public void setReward(int reward) {
		this.reward = reward;
	}

	public int getLength() {
		return lengthInSeconds;
	}

	public void setLength(int length) {
		this.lengthInSeconds = length;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		if (started) {
			this.startDate = LocalDateTime.now();
		}
		this.started = started;
	}

	public boolean isComplited() {

		if (this.complited) {
			return this.complited;
		} else {
			LocalDateTime now = LocalDateTime.now();

			LocalDateTime questEndDate = this.startDate.plusSeconds(this.lengthInSeconds);

			boolean isAfter = now.isAfter(questEndDate);
			if (isAfter) {
				this.complited = true;
			}

			return isAfter;
		}

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
