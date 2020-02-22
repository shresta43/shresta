package lab;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class DateDemo {

	public DateDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime d=LocalDateTime.now();
		System.out.println(d);
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyy-hh:mm:ss");
		System.out.println(d.format(f));
		
		
		
		LocalDate start = LocalDate.of(1998,Month.OCTOBER,8);
		LocalDate end = LocalDate.now();
		
		Period period = start.until(end);
		
		System.out.println("Days:"+ period.getDays());
		System.out.println("Months:"+period.getMonths());
		System.out.println("Years:"+ period.getYears());
		
	}

}
