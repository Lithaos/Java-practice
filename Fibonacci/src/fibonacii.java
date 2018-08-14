import java.io.*;
import java.util.Scanner;
public class fibonacii
{
	public static void main(String a[]) throws Exception
	{
		int number;

  		Scanner sc=new Scanner(System.in);
     		System.out.println("Enter the number:");
                number=sc.nextInt();
               System.out.println("First terms of fibonacci series are:");

                
        
   //just add the remaining logic here to complete the problem statement.
	int f1=0;
	int f2=1;
	int f3=0;
	System.out.println(f1);
	System.out.println(f2);
	for(int i=2;i<number;i++){
	    f3=f1+f2;
	    System.out.println(f3);
	    f1=f2;
	    f2=f3;
	    
	}
	}
	
}  


