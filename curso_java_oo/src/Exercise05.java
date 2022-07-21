import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		int piece01, piece02, qtdPiece01, qtdPiece02;
		double valuePiece01, valuePiece02, amountToPay;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		piece01 = sc.nextInt();
		qtdPiece01 = sc.nextInt();
		valuePiece01 = sc.nextDouble();
		piece02 = sc.nextInt();
		qtdPiece02 = sc.nextInt();
		valuePiece02 = sc.nextDouble();
		
		amountToPay = qtdPiece01 * valuePiece01 + qtdPiece02 * valuePiece02;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", amountToPay);
		
		sc.close();
		
	}

}
