import java.io.*;
class perfect{

public static void main(String arg[])throws Exception{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number:");
int number =Integer.parseInt(br.readLine());
int result=0;
/*Write down your logic here*/
for(int i=number-1;i>0;i--)
{
    if(number%i==0)
    result+=i;
}



if(result==number)
System.out.println("given number is a perfect number");
else
System.out.println("given number is not a perfect number");

}
 

}
