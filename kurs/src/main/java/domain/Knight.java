package domain;

public class Knight {

		private String name;
		private int age;
		
		private Quest quest;
		
		public Knight(String name, int age, Quest quest)
		{
			this.name = name;
			this.age = age;
			this.quest = quest;
		}
		
		@Override
		public String toString() {
			return "Rycerz o imieniu " + name + "(" + age + "). Zadanie: " + quest +".";
		}
}
