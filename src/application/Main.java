package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Program that, given three values, calculates a few areas ***");
		System.out.print("Enter the first value: ");
		double A = scanner.nextDouble();
		System.out.print("Enter the second value: ");
		double B = scanner.nextDouble();
		System.out.print("Enter the third value: ");
		double C = scanner.nextDouble();
		
		double triangule = (A * 0.5) * C;
		double circle = Math.pow(C, 2) * 3.14159;
		double trapeze = ((A + B) / 2) * C;
		double square = Math.pow(B, 2);
		double rectangle = A * B;
		
		System.out.println();
		System.out.printf("Triangule = %.3f%n", triangule);
		System.out.printf("Circle = %.3f%n", circle);
		System.out.printf("Trapeze = %.3f%n", trapeze);
		System.out.printf("Square = %.3f%n", square);
		System.out.printf("Rectangle = %.3f%n", rectangle);
		
		scanner.close();
		
	}

}
