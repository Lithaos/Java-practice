import java.io.*;

class digitsum {

	public static void main(String arg[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date(ddmmyy):");
		int number = Integer.parseInt(br.readLine());
		int sum = 0;
		do {
			sum += number % 10;
			number = number / 10;
			if (number == 0 && sum >= 10) {
				number = sum;
				sum = 0;
			}
		} while (number > 0);
		number = sum;
		System.out.println("Your lucky number is:");
		System.out.println(number);

	}

}
