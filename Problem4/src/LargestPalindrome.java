
public class LargestPalindrome {

	public void palindrome() {
		int max=0;
		int num;
		for(int i=999;i>=100;i--)
		{
			for(int j=999;j>=100;j--)
			{
				if(max>i*j)
					break;
				num=i*j;
				String var = Integer.toString(num);
				String var2="";
				while(num>0)
				{
					var2+=Integer.toString(num%10);
					num/=10;
					
				}
			
				if(var.equals(var2))
				{
					if(max<Integer.parseInt(var2))
					{
						max = Integer.parseInt(var2);
						break;
					}
				}
				
			}
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestPalindrome test = new LargestPalindrome();
		test.palindrome();
	}

}
