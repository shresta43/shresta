package lab;
import java.util.*;
import java.text.*;
import java.time.*;

public class DateOperationp4 
{
	void diff()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day of the year1:");
		int d1 = sc.nextInt();
		System.out.println("Enter month of the year1:");
		int m1 = sc.nextInt();
		System.out.println("Enter the year1:");
		int y1 = sc.nextInt();
		System.out.println("Enter day of the year2:");
		int d2 = sc.nextInt();
		System.out.println("Enter month of the year2:");
		int m2 = sc.nextInt();
		System.out.println("Enter the year2:");
		int y2 = sc.nextInt();
		
		LocalDate l1 = LocalDate.of(y1, m1, d1);
		LocalDate l2 = LocalDate.of(y2, m2, d2);
		Period p = Period.between(l1,l2);
		
		System.out.println("Difference in days:"+p.getDays());
		System.out.println("Difference in months:"+p.getMonths());
		System.out.println("Difference in years:"+p.getYears());
	}
	public static void main(String[] args)
	{
		DateOperationp4 dop = new DateOperationp4();
		dop.diff();
	}
}
