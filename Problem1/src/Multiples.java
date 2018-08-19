
public class Multiples {

	public void multi(long number){
		long sum=0;
		for(int i=1;i<number;i++) {
			if(i%3==0 || i%5==0)
				sum+=i;
		}
		System.out.println("Sum of 3 and 5: "+ sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiples test = new Multiples();
		test.multi(1000);
	}

}
