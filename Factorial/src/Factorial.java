import java.io.*;
import java.util.Scanner;

public class Factorial
{
    public static int fact(int i){
        if (i < 1)
        return 1;
        else
        return i * fact(i - 1);
    }
  public static void main(String[] agrs)
  {
        int prod=1,num;
	System.out.println("Enter a number:");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt(); 
	System.out.println("Factorial is:"+fact(num));
      
  }
}




