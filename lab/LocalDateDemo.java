package lab;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * This program demonstrates on use of LocalDate class
 *
 */
public class LocalDateDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    String s=sc.nextLine();
	   
	    LocalDate currentDate1 = LocalDate.parse(s,f);
		LocalDate currentDate = LocalDate.now();
        Period period =currentDate .until(currentDate1);
		
		System.out.println("Days:"+ period.getDays());
		//LocalDate independanceDay = LocalDate.of(2021,Month.MARCH,15);
		System.out.println("Today:"+ currentDate);
		//System.out.println("Waranty end date:"+ independanceDay);
		System.out.println(" end date:"+ currentDate1);
		//System.out.println("Months:"+period.getDays());
		//System.out.println("Tomorrow:"+ currentDate.plusDays(1));
		//System.out.println("Last Month:"+currentDate.minusMonths(1));
		//System.out.println("Is Leap?:"+ currentDate.isLeapYear());
		//System.out.println("Move to 30th day of month:"+ currentDate.withDayOfMonth(29));
		//System.out.println("Number of days in this month:"+ currentDate.lengthOfMonth());
		sc.close();
	}
}
