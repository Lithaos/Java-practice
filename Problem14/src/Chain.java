
public class Chain {
	public float count = 0;

	void chain(long n) {
		count = 0;
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			count++;
		}
	}

	public static void main(String[] args) {
		Chain test = new Chain();
		float max = 0;
		for (int i = 1; i < 1000000; i++) {
			test.chain(i);
			if (max < test.count) {
				max = test.count;
				System.out.println(i);
			}

		}
	}

}
