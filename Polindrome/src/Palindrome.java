import java.io.*;

public class Palindrome {
	public static void main(String a[]) throws Exception {
		String strn;
		int flag = 0;
		System.out.println("Enter the string:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		strn = br.readLine();
		System.out.println("Result string is:");
		String help = "";
		for (int i = 0; i < strn.length(); i++) {
			help += strn.charAt(strn.length() - i - 1);
		}
		if (strn.equals(help))
			flag = 1;
		if (flag == 1)
			System.out.print("palindrome");
		else
			System.out.print("not a palindrome");

	}
}
