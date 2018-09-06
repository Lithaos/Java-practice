package com.study.kurs.domain;

public class Castle {

	private String name;

	Knight knight;
	

	public Castle(Knight knight)
	{
		this.knight = knight;
	}
	
	Castle(Knight knight, String name) {
		this.knight = knight;
		this.name = name;
	}


	public void build() {
		System.out.println("Wybudowano zamek " + name);
	}


	public void tearDown() {
		System.out.println("Zaraz wyburzymy zamek " + name);
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString()
	{
			return "Znajduje sie tu zamek o nazwie " + name + ". Zamieszkały przez rycerza " + knight;
	}
}
