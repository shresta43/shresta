package lab;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names you want to add:");
		int n = sc.nextInt();
		String dummy = sc.nextLine();
		
		String[] pnames = new String[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter product name:");
			pnames[i] = sc.nextLine();
		}
		Arrays.parallelSort(pnames);
		for(int i=0;i<pnames.length;i++)
			System.out.println(pnames[i]);
	}

}
