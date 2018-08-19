import java.io.Console;

public class LargestPrime {

	public long largest(long x) {
		int i, e;
		i = 2;
		e = (int) (Math.sqrt(x));
		while (i <= e) {
			while ((x % i) == 0) {
				x /= i;
				e = (int) (Math.sqrt(x));
				System.out.print(" " + i);
			}
			i++;
		}
		if (x > 1)
			System.out.print(" " + x);
		return x;
	}

	public static void main(String[] args) {
		LargestPrime test = new LargestPrime();
		System.out.println(test.largest(600851475143L));

	}

}
