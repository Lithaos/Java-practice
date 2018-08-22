
public class SumOfPrimes {

    public static final int num = 2000000;

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            if(isPrime(i)) {
                sum += i;
                System.out.println("Prime:"+i);
            }
        }
        System.out.println("Sum: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
