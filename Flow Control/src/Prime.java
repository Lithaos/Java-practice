import java.util.Scanner;

class flow {
  private static Scanner sc;

public static void main(String[] args) {
	  
	sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
    int num = sc.nextInt();
        Boolean tn=true;
    for(int i = num-1; i>1;i--)
    {
        if(num%i==0)
        tn=false;
    }
    if(tn)
    System.out.print("The number is prime.");
    else
    System.out.print("The number is not prime.");

}
}
