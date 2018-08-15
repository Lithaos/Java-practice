import java.io.*;
import java.util.Scanner;

public class AmstrongNumber
{
	public static void main(String a[]) throws Exception
	{
		int i,num,sum=0;
   
                System.out.println("Enter a number:");
                Scanner scan=new Scanner(System.in);
                num=scan.nextInt();
                i=num;
                while(num!=0)
                  {
                     sum+=Math.pow(num%10,3);
                     num/=10;
                  }
                if(sum==i)
                   System.out.print("Number is a Armstrong number");
                else
                   System.out.print("Number is not a Armstrong number");			
	}
	
}

