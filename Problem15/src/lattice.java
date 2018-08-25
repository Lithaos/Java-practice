
public class lattice {

	void path() {
		int gridSize = 20;
		long paths = 1;
		 
		for (int i = 0; i < gridSize; i++) {
		    paths *= (2 * gridSize) - i;
		    paths /= i + 1;
		}
		System.out.println(paths);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lattice test = new lattice();
		test.path();
	}

}
