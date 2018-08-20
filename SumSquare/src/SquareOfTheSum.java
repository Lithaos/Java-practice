
public class SquareOfTheSum extends Main{
	int x;

	public SquareOfTheSum(int x) {
		super();
		this.x = x;
	} 
	long calculate() {
		long sum=0;
		for(int i=1;i<=x;i++)
		{
			sum+=i;
		}
		return (long)Math.pow(sum, 2);
	}
}
