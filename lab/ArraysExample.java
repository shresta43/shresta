package lab;
import java.util.*;

public class ArraysExample 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names you want to add:");
		int n = sc.nextInt();
		String dummy = sc.nextLine();
		
		
		ArrayList a = new ArrayList();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter  product name:");
			a.add(sc.nextLine());
		}
		Collections.sort(a);
		
		for(Object na : a)
		{
			System.out.print(na+",");
		}
		
		
	}
}
