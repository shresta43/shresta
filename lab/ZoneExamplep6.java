package lab;

import java.util.*;
import java.time.*;
public class ZoneExamplep6 
{
	void zone()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a zoneId:");
		String s = sc.nextLine();
		System.out.println(s);
		if(s.equals("Europe/London"))
		{
			ZonedDateTime zp = ZonedDateTime.now(ZoneId.of("Europe/London"));
			System.out.println(zp);
		}
		else if(s.equals("America/New_York"))
		{
			ZonedDateTime za = ZonedDateTime.now(ZoneId.of("America/New_York"));
			System.out.println(za);
		}
		else if(s.equals("Asia/Tokyo"))
		{
			ZonedDateTime as = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
			System.out.println(as);
		}
		else if(s.equals("US/Pacific"))
		{
			ZonedDateTime us = ZonedDateTime.now(ZoneId.of("US/Pacific"));
			System.out.println(us);
		}
		else if(s.equals("Africa/Cairo"))
		{
			ZonedDateTime af = ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
			System.out.println(af);
		}
		else if(s.equals("Australia/Sydney"))
		{
			ZonedDateTime sy = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
			System.out.println(sy);
		}
		else
		{
			System.out.println("Please enter a valid zoneid");
			System.out.println("Zoneids are case-sensitive");
		}
		
	}
	public static void main(String[] args)
	{
		ZoneExamplep6 z= new ZoneExamplep6();
		System.out.println("Available Zoneids:");
		System.out.println("Europe/London");
		System.out.println("America/New_York");
		System.out.println("Asia/Tokyo");
		System.out.println("US/Pacific");
		System.out.println("US/Pacific");
		System.out.println("Africa/Cairo");
		System.out.println("Australia/Sydney");
		z.zone();
	}
}
