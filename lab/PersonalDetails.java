package lab;

import java.util.Scanner;


public class PersonalDetails {
 
	String Fname,lname;
	char G;
	int age;
	double weight;
	PersonalDetails(){
	Fname="nani";
	lname="varma";
	G='M';
	age=5;
	weight=55.7;
	}
	
	
	public PersonalDetails(String fname, String lname, int age) {
		super();
		Fname = fname;
		this.lname = lname;
		this.age = age;
	}


	public PersonalDetails(String fname, String lname, char g, int age, double weight) {
		super();
		Fname = fname;
		this.lname = lname;
		G = g;
		this.age = age;
		this.weight = weight;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fname= sc.nextLine();
		String lname= sc.nextLine();
		int age= sc.nextInt();
		PersonalDetails pd1=new PersonalDetails();
		PersonalDetails pd=new PersonalDetails(fname,lname,age);
		System.out.println("PersonalDetails");
		System.out.println("---------------");
		System.out.println("FirstName"+pd.Fname);
		System.out.println("lastName"+pd.lname);
		//System.out.println("gender"+pd.G);
		System.out.println("age"+pd.age);
		//System.out.println("weight"+pd.weight);
		
		
		
		System.out.println("PersonalDetails");
		System.out.println("---------------");
		System.out.println("FirstName"+pd1.Fname);
		System.out.println("lastName"+pd1.lname);
		System.out.println("gender"+pd1.G);
		System.out.println("age"+pd1.age);
		System.out.println("weight"+pd1.weight);
	}

}
