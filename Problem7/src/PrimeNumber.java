
public class PrimeNumber {
	void primeNum(int nr) {
		int i = 0;
		int count = 0;
		int num = 0;
		int number=0;

		while(count<nr) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				count++;
				number = i;
			}
			i++;
		}
		System.out.println(number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber test = new PrimeNumber();
		test.primeNum(10001);
	}

}
