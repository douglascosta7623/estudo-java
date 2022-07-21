import java.util.Locale;
import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		int numberFun = 0;
		double salaryForHour, hourWork, salary;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		numberFun = sc.nextInt();
		hourWork = sc.nextDouble();
		salaryForHour = sc.nextDouble();
		salary = hourWork * salaryForHour;
		
		System.out.printf("NUMBER = %d%nSALARY =  U$ %.2f", numberFun, salary);
		
		sc.close();
		
		

	}

}
