
public class Pythagorean {

	void finder() {
		int MAX = 1000;
		int a, b, c;
		int a1 = 1, b1 = 1, c1 = 1;
		for (a = 1; a < MAX; a++) {
			for (b = a; b < MAX; b++) {
				for (c = b; c < MAX; c++) {
					if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
						if (a + b + c == 1000) {
							a1 = a;
							b1 = b;
							c1 = c;
						}
						System.out.printf("%d %d %d\n", a, b, c);
					}
				}
			}
		}
		System.out.println("A: " + a1 + " B: " + b1 + " C: " + c1);
		System.out.println(a1 * b1 * c1);
	}

	public static void main(String[] args) {
		Pythagorean test = new Pythagorean();
		test.finder();

	}

}
