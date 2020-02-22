package lab;

import java.util.Scanner;


	class Saving extends Account{
		

		public Saving(long accNum, double balance, Person p) {
			super(accNum, balance, p);
			// TODO Auto-generated constructor stub
		}

		final double minbal=500;
		void withdraw(double w) {
	    	if(getBalance()>=minbal) {
	    		balance= balance-w;
	    	 System.out.println("withdrawl"+balance);

	    	} 
	    	else
	    		System.out.println("cant withdrawl");
	
	    	}
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Smith");
		Saving sav=new Saving(Account.x,2000,p1);
		sav.withdraw(2101);
	}

}
