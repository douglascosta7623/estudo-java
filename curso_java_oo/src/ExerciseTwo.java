import java.util.Locale;
import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double area, pi, radius, resultRadius;
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		pi = 3.14159;
		
		radius = sc.nextDouble();
		
		resultRadius = Math.pow(radius, 2);
		
		String testeDouble = Double.toString(radius);
		
		area = pi * resultRadius;
		System.out.println(testeDouble);
		System.out.printf("Entrada:%n %.2f%n", radius);
		System.out.printf("Saída:%n %.4f%n", area);
		
		
		
		sc.close();

	}

}
