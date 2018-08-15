import java.util.Scanner; 
class EvenNumbers{ 
 
 public static void main(String args[]){ 
 Scanner scanner=new Scanner(System.in); 
 int [] arr = new int[5];
 for(int i=0;i<5;i++)
 {
	 System.out.println("Enter number "+(i+1));
     arr[i]=scanner.nextInt();
 }
 Boolean found = false;
 for(int i=0;i<5;i++)
 {
     if(arr[i]%2==0)
     {
     System.out.println(arr[i]);
     found=true;
     }
 }
 if(!found)
 System.out.println("Even number not found in array.");

} 

 
} 
