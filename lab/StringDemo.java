package lab;

import java.util.Scanner;

public class StringDemo {
	//String s;

	public StringDemo() {
		// TODO Auto-generated constructor stub
	}
	String concatenation(String str) {
		return str.concat(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo d=new StringDemo();
		//Scanner sc =new Scanner(System.in);
		//String str=sc.nextLine();
		
		System.out.println(d.concatenation("nani"));
	}

}
