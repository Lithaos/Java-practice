
public class NumbersOf {

	
	void formAB(int n){
		int a = 2; // Must be greater than 2.
		int b = 2; // Must be greater than 2.
		int count = 0; // Counter of such forms.
		
		while(sumOfPows(a,b)<=n)
		{
			
			while(sumOfPows(a,b)<=n)
			{
				    if(sumOfPows(a,b)<=n)
					count++;
					System.out.println("A:"+a+" "+"B:"+b+" "+(int)sumOfPows(a,b));
				a++;
			}
			a=2;
			b++;	
		}
		
		
		System.out.println("F("+n+") = "+count);
	}
	double sumOfPows(int a, int b) {
		return Math.pow(a, 2)*Math.pow(b, 3);
	}
	
	public static void main(String [] args)
	{
		NumbersOf test = new NumbersOf();
		test.formAB(20000);
	}

}


