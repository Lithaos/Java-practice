import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;

public class amicable
{
 public static void main(String[] aths)
 {
  int big_total=0;
  int num;
  System.out.println("Enter a number:");
  Scanner sc = new Scanner(System.in);
  num = sc.nextInt();
    for(int i=2;i<num;i++)
    {
        if(num%i==0)
        big_total+=i;
    }
  System.out.println("The total is: "+big_total);

 }
}



