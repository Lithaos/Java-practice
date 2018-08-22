
public class SumOfTheSquares extends Main{
	int x;

	public SumOfTheSquares(int x) {
		super();
		this.x = x;
	} 
	long calculate() {
		long sum=0;
		for(int i=1;i<=x;i++)
		{
			sum+=Math.pow(i, 2);
		}
		return sum;
	}
}
