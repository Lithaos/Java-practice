package problem12;

public class HighlyDivisible {

	public String run() {

		int num = 0;

		for (int i = 1;; i++) {

			num += i; // num is triangle number i

			if (countDivisors(num) > 500)

				return Integer.toString(num);

		}

	}

	private static int countDivisors(int n) {

		int count = 0;

		int end = (int)Math.sqrt(n);

		for (int i = 1; i < end; i++) {

			if (n % i == 0)

				count += 2;

		}

		if (end * end == n) // Perfect square

			count++;

		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HighlyDivisible test = new HighlyDivisible();
		System.out.println(test.run());
	}

}
