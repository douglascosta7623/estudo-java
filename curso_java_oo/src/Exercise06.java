import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double a, b, c, triagulo, circulo, trapezio, quadrado, retangulo, expoResult;

		double pi = 3.14159;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		expoResult = Math.pow(c, 2);

		triagulo = (a * c) / 2;
		circulo = pi * expoResult;
		trapezio = ((a + b) * c) / 2;
		quadrado = b * b;
		retangulo = a * b;

		System.out.printf("TRIAGULO: %.3f%n", triagulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);

	}

}
