package lab;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Products3p5 
{
	
	void warrantys()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product purchase date in the form of dd/mm/yyyy");
		String s= sc.nextLine();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate loc = LocalDate.parse(s, df);
		LocalDate pd = LocalDate.of(loc.getYear(),loc.getMonthValue(),loc.getDayOfMonth());
		System.out.println("Enter product warranty period in the form of dd/mm/yyyy");
		String w= sc.nextLine();
		LocalDate l = LocalDate.parse(w,df);
		LocalDate exp = LocalDate.of(l.getYear(), l.getMonthValue(), l.getDayOfMonth());
		Period p = Period.between(pd,exp);
		System.out.println("");
	}
	
	
	public static void main(String[] args)
	{
		Products3p5  p = new Products3p5();
		p.warrantys();
	}
}
