import java.util.Scanner;
class Challenge{

 public static void main(String args[]){
 Scanner scanner=new Scanner(System.in);
 int a,b,c,s;
 System.out.println("Enter 3 values:");
 a=scanner.nextInt();
 b=scanner.nextInt();
 c=scanner.nextInt();
 s=luckySum(a,b,c);
 System.out.println("Lucky sum:"+s);
 Challenge test = new Challenge();
 test.luckySum(a,b,c);
}
public static int luckySum(int a,int b,int c){
     int s=0;
    if(a!=13)
    {
        s+=a;
        if(b!=13)
        {
            s+=b;
        if(c!=13)
        {
            s+=c;
        }
            
        }
        
        
    }
    System.out.println(s);
    return(s);
}

}
