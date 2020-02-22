package pl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bean.Customer;
import bean.Mobile;
import bean.Purchase;
import exception.MyException;
import service.Services;

public class User {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		Mobile m=new Mobile();
		Purchase p=new Purchase();
		Services s=new Services();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Select option:\n1.insert customer and purchase details\n2.update mobile quantity\n3.view details of mobiles available\n4.delete mobile details\n5.search mobile based on price range\n6.exit");
		switch(sc.nextInt())
		{
		case 1:System.out.println("enter the name of the customer:");
				String dummy= sc.nextLine();
				String customername=sc.nextLine();
				String cap = customername.substring(0, 1).toUpperCase() + customername.substring(1).toLowerCase();
				c.setName(cap);
				
				System.out.println("Enter E-mailID of the customer:");
				String cemail=sc.nextLine();
				String regex="^[A-Za-z0-9+_.-]+@(.+)$";
				Pattern pattern = Pattern.compile(regex);
				Matcher matcher = pattern.matcher(cemail);
				while(!matcher.matches())
				{
					System.out.println("invalid email enter correct email:");
					cemail=sc.nextLine();
					matcher = pattern.matcher(cemail);
				}
				c.setEmail(cemail);
				
				System.out.println("enter phone number of the customer:");
				String phno=sc.nextLine();
				if(phno.length()<10 || phno.length()>10)
				{
					System.out.println("****incorrect phone number********\nEnter correct phone number:");
					phno=sc.nextLine();
				}
				c.setPhno(phno);
				System.out.println("enter the mobile id purchased");
				int mid=sc.nextInt();
				m.setMobileId(mid);
				s.insert(c,m);
				break;
		case 2: s.update(c,m);
				break;
		case 3: s.display();
				break;
				
		case 4: 
				System.out.println("Enter the mobile Id:");
				int mobileId=sc.nextInt();
				s.delete(mobileId);
				break;
		case 5: System.out.println("Enter the range:");
				int range1=sc.nextInt();
				int range2=sc.nextInt();
				s.SearchOnPrice(range1,range2);
				break;
				
		case 6: System.out.println("exit sucessful");
				System.exit(0);
				break;
		}
		}
		
	}

}
