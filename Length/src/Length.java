import java.util.Scanner; 
 
class Length { 
 
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in); 

		System.out.println("Enter a string:"); 
		String input = scanner.nextLine();
		int length = input.length();
		System.out.println("Length of the string is:" + length); 
 
	} 
 
} 
