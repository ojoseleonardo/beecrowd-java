package beginner;

import java.util.Locale;
import java.util.Scanner;

public class Consumption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		float X = scanner.nextFloat();
		float Y = scanner.nextFloat();
		
		float total = X / Y;
		
		System.out.printf("%.3f km/l\n", total);
		

	}

}
