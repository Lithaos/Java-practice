
public class prime {
	
	boolean czy_pierwsza(int n)
	{
		if(n<2)
			return false; 
			
		for(int i=2;i*i<=n;i++)
			if(n%i==0)
				return false; 
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime test = new prime();
		long sum=0;
		for(int i=2;i<2000000;i++)
		{
			if(test.czy_pierwsza(i))
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
