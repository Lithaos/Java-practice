
public class PrimeNumber {
	Boolean primeNum(int nr) {
		for (int i = 2; i < nr; i++) {
			if (nr % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber test = new PrimeNumber();
		int count = 0;
		for (int i = 2; i <= Integer.MAX_VALUE; i++) {
			if (test.primeNum(i)) {
				count++;
			}
			if (count == 10001) {
				System.out.println(i);
				break;

			}
		}
	}

}
