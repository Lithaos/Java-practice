import java.util.Scanner;

class Case {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Uppercase letter:");
        String uppercase = scanner.nextLine();
        System.out.print(uppercase.toLowerCase());
		
	}
}
