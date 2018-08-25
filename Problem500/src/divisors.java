
public class divisors {
	public void calculate(double num) {
		double i = 2;
		double count = 0;
		double amount = 1;
		while (num != 1) {

			if (num % i == 0) {
				count++;
				System.out.println(count+" "+num);
				num /= i;
				if(num==1)
				{
					amount *= count + 1;
				}
			} else {
				
				i++;
				if(count!=0)
				amount *= count + 1;
				count = 0;
				
			}

		}

		System.out.println(amount);

	}

	public static void main(String[] args) {
		divisors test = new divisors();
		test.calculate(500500);

	}

}
