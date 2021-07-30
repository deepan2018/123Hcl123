import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate cr=LocalDate.now();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter year,month,date");
		int y=scan.nextInt();
		int m=scan.nextInt();
		int d=scan.nextInt();
		String name=scan.next();
		LocalDate bd=LocalDate.ofYearDay(y, d);
		int agey=Period.between(bd, cr).getYears();
		System.out.println("your age= "+     + agey);
		
		
	}

}
