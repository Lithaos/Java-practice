
public class EvenFibonacci {

	public long fibonacciEven(long num)
	{
		if(num<=1)
			return num;
		else
			return fibonacciEven(num-1)+fibonacciEven(num-2);
	}
	
	
	public static void main(String[] args) {
		EvenFibonacci test = new EvenFibonacci();
		long sum = 0;
		for(int i=2;test.fibonacciEven(i)<4000000;i++)
		{
			if(test.fibonacciEven(i)%2==0)
				sum+=test.fibonacciEven(i);
			System.out.println(test.fibonacciEven(i));
		}
		System.out.println("Sum: " + sum);

	}

}
