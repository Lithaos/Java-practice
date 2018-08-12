import java.util.Scanner;

public class checkbinary {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int count = 0;
		int help = num;
		boolean bin = true;
		while (help > 0) {
			if (help % 10 > 1)
				bin = false;
			help /= 10;
			count++;
		}

		System.out.println("The number is:");
		if (bin)
			System.out.print("Binary");
		else
			System.out.print("Not Binary");

	}
}
