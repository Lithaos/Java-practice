import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class LargeSum {

	public void input() {

		try {
			Scanner scanner = new Scanner(new File("D:\\Work Place\\Problem13\\src\\txt"));
			BigInteger sum = BigInteger.ZERO;
			while (scanner.hasNextLine()) {
				sum = sum.add(new BigInteger(scanner.nextLine()));
			}
			System.out.println(sum.toString().substring(0, 10));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		LargeSum test = new LargeSum();
		test.input();

	}

}
