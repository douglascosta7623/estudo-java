import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		x = sc.next(); 
		
		System.out.println(x);
		
		String nameOne;
		int ageR;
		double renda;
		
		nameOne = sc.next();
		ageR = sc.nextInt();
		renda = sc.nextDouble();
		
		System.out.println("Dados digitados foi: ");
		System.out.println(nameOne);
		System.out.println(ageR);
		System.out.println(renda);
		
		sc.close();
	}

}
