package lab;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	static String a[];
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	public ArrayDemo() {
		// TODO Auto-generated constructor stub
		
		a=new String[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.next();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDemo ab=new ArrayDemo();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
