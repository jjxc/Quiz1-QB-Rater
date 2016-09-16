package Quiz1;

import java.util.Scanner;

public class QBRating {

	public static void main(String[] args) {

		Scanner datainput = new Scanner(System.in);

		// Variables
		double ATT;
		double COMP;
		double YDS;
		double TD;
		double INT;

		// Questions and Inputs
		System.out.println("Number of passing attempts:");
		ATT = datainput.nextDouble();

		System.out.println("Number of completions:");
		COMP = datainput.nextDouble();

		System.out.println("Passing yards:");
		YDS = datainput.nextDouble();

		System.out.println("Touchdown passes:");
		TD = datainput.nextDouble();

		System.out.println("Interceptions:");
		INT = datainput.nextDouble();

			// Calculations
			double a = ((COMP / ATT) - .3) * 5;
				if (a > 2.375) {
					a = 2.375;
				} else if (a < 0) {
						a = 0;
				} else {
					a = a;
				}
					
			double b = ((YDS / ATT) - 3) * .25;
				if (b > 2.375) {
					b = 2.375;
				} else if (b < 0) {
					b = 0;
				} else {
					b = b;
				}
			double c = (TD / ATT) * 20;
				if (c > 2.375) {
					c = 2.375;
				} else if (c < 0) {
					c = 0;
				} else {
					c = c;
				}
			double d = 2.375 - ((INT/ATT) * 25);
				if (d > 2.375) {
					d = 2.375;
				} else if (d < 0) {
					d = 0;
				} else {
					d = d;
				}
			double PasserRating =
					((a + b+ c +d)/6) * 100;
			
				//Result and Output
				System.out.printf("The player's QB Rating is: %.1f \n",PasserRating);
	}
}