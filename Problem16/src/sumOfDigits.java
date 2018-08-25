import java.math.BigInteger;

public class sumOfDigits {

	public void sum() {
		BigInteger power = new BigInteger("2").pow(1000);
		long sumDigits = 0;
		String NumberString = power.toString();
		for (int i = 0; i < NumberString.length(); i++) {
			String o = Character.toString(NumberString.charAt(i));
			sumDigits += Integer.parseInt(o);
		}
		System.out.println(sumDigits);
	}

	public static void main(String[] args) {
		sumOfDigits test = new sumOfDigits();
		test.sum();
	}

}
