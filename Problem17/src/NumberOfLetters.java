import java.math.BigInteger;

public class NumberOfLetters {
	int wyn=21124;
	public void counter(int num) {
		long sum = 0;
		int countHun=0;
		String[] tensNames = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		String[] numNames = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		
		int letters1to9 = 0;
		int letters10to19 = 0;
		int letters20to99 = 0;
				for (int i = 1; i <= 9; i++) {
					if (i < 20) {
						sum += numNames[i].length();
					}
					if (i >= 20 && i < 100) {
						sum += tensNames[i / 10].length();
						if (i % 10 != 0) {
							sum += numNames[i % 10].length();

						}
					}
				letters1to9+=sum;
				sum=0;
				}
		for (int i = 10; i <= 19; i++) {
			if (i < 20) {
				sum += numNames[i].length();
			}
			if (i >= 20 && i < 100) {
				sum += tensNames[i / 10].length();
				if (i % 10 != 0) {
					sum += numNames[i % 10].length();

				}
			}
		}
		letters10to19+=sum;
		sum=0;
		for (int i = 20; i <= 99; i++) {
			if (i < 20) {
				sum += numNames[i].length();
			}
			if (i >= 20 && i < 100) {
				sum += tensNames[i / 10].length();
				if (i % 10 != 0) {
					sum += numNames[i % 10].length();

				}
			}
		}
		letters20to99+=sum;
		sum=0;
		sum+=100*letters1to9;

		sum+=9*854;

		sum+=7*9;

		sum+=891*10 + 854 + 11;
		System.out.println(sum);
}

	public static void main(String[] args) {
		NumberOfLetters test = new NumberOfLetters();
		test.counter(1000);
	}

}
