import java.util.Scanner;
public class numtostring
{
	
	public static String ones[]={"one","two","three","four","five","six"," seven", "eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","ninteen"};      
        public static String tens[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};       
public static void main(String a[]) throws Exception
	{
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        int num,rem;   

      
         System.out.println("Enter the number:");
          num=sc.nextInt();
        
         System.out.println("Entered number is:");
                if(num<20)
        {
            System.out.println(ones[num-1]);
        }
        else if(num%10==0){
            System.out.println(tens[num/10-2]);
        }
        else
        {
            rem=num%10;
            num=num/10;
            System.out.println(tens[num-2]+" "+ ones[rem-1]);
        }
       
	  
        }//main 


	 
}  