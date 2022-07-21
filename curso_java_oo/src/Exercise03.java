import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro número");
		a = sc.nextInt();
		
		System.out.println("");
		
		System.out.println("Digite o valor do segundo número");
		System.out.println("");
		b = sc.nextInt();
		
		
		
		

		
		System.out.println("Digite o valor do terceiro número");
		c = sc.nextInt();
		System.out.println("");
		
		System.out.println("Digite o valor do quarto número");
		d = sc.nextInt();
		
		
		int differenceProducts;
		differenceProducts = (a*b - c*d);
		
		System.out.printf("Diferença =  %d", differenceProducts);
		
		
		
		sc.close();
	}

}
