package lab;

import java.util.Scanner;

public class Account {
	
	static long x = 101 ;
	long accNum;
	double balance;
	Person p;
	
	public Account(long accNum, double balance, Person p) {
		//super();
		this.accNum = accNum;
		this.balance = balance;
		this.p = p;
		x++;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
	    this.accNum = x;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void deposit(double d)
	{
		balance=(getBalance()+d);
		System.out.println("after deposit balance is"+ balance);
	}
	void withdraw(double d)
	{
		balance=(getBalance()-d);
		System.out.println("after withdrawal balance is"+balance);
	}
	
	@Override
	public String toString() {
		return "Account p=" + p.getFname() + ", AccNum=" + getAccNum() + ", Balance=" + getBalance() ;
	}
	public static void main(String args[])
	{
	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Enter acc holder name");
	//	String name = sc.nextLine();
	//	System.out.println("Enter acc holder age");
	//	int age = sc.nextInt();
		Person p1 = new Person("Smith");
		Account a1 = new Account(Account.x,2000,p1);
		Person p2 = new Person("kathy");
		Account a2 = new Account(Account.x,3000,p2);
		a1.deposit(2000);
		a2.withdraw(2000);
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}
}
