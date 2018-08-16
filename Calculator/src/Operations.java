public class Operations extends JFrame{
	static int firstVar;
	static int secondVar;
	static double result;
	static int operation=0;
	public static int add()
	{
		return firstVar+secondVar;
	}
	public static int substract()
	{
		return firstVar-secondVar;
	}
	public static int multiple()
	{
		return firstVar*secondVar;
	}
	public static int divide()
	{
		return firstVar/secondVar;
	}
	static public void switcher(int operation)
	{
		switch(operation)
		{
		case 1:
			result=add();
		case 2:
			result=substract();
		case 3:
			result=multiple();
		case 4:
			result=divide();
		}
	}
	
}
