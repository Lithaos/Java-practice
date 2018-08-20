
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		SumOfTheSquares sum = new SumOfTheSquares(x);
		SquareOfTheSum square = new SquareOfTheSum(x);
		double a = square.calculate();
		double b = sum.calculate();
		System.out.println(a-b);
		
	}

}
