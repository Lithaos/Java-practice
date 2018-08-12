import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		double temp, wind_speed, wind_chill = 0;

		System.out.println("Enter temperature and wind speed:");
		Scanner sc = new Scanner(System.in);
		temp = sc.nextDouble();
		wind_speed = sc.nextDouble();
		double bp = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind_speed, 0.16);
		wind_chill = bp;
		System.out.println("Wind chill is: " + wind_chill);

	}

}
