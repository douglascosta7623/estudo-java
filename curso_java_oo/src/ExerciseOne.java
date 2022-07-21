import java.util.Scanner;

public class ExerciseOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value1, value2, result;
		value1 = sc.nextInt();
		
		value2 = sc.nextInt();
		
		result = value1 + value2;
		
		System.out.println("Entrada:");
		System.out.printf("%d%n%d%n", value1, value2);
		System.out.println("Saída:");
		System.out.printf("SOMA = %d", result);
		
		
		sc.close();
	}

}
