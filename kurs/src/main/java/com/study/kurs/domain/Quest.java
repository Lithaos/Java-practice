package com.study.kurs.domain;

public class Quest {

	private int id;
	private String description;

	private int reward = 100;

	private int length = 30000;

	private boolean started = false;

	private boolean complited = false;

	public Quest(int id, String description) {
		this.id = id;
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
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isComplited() {
		return complited;
	}

	public void setComplited(boolean complited) {
		this.complited = complited;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
