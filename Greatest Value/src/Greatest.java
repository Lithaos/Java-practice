import java.util.Scanner;
import java.util.ArrayList;
class Challenge{

 public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
    	ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter the number of integers that will be inserted: ");
		int size = scanner.nextInt();
		System.out.println("Enter some integers to insert to the ArrayList: ");
		while (size-- > 0) {
			al.add(scanner.nextInt());
		}
		int max = Integer.MIN_VALUE;
        
        for(int i=0;i<al.size();i++)
        {
            if(max<al.get(i))
            max=al.get(i);
        }
    
    
        System.out.println("The largest value: " + max);
}

}
