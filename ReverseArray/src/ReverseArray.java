import java.util.*;

public class ReverseArray {
	public static void main(String a[]) throws Exception {
		// write your logic here

		int arr[] = new int[10];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the array elements[" + i + "]:");
			arr[i] = scan.nextInt();
		}
		for (int i = 9; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}
}