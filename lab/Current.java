package lab;

public class Current extends Account {
     public Current(long accNum, double balance, Person p) {
		super(accNum, balance, p);
		// TODO Auto-generated constructor stub
	}
	double od=1000;
	void withdraw(double w) {
		System.out.println("value  "+od);
    		if(od<=getBalance()) {
    		 System.out.println("user can withdraw");

    	}  
    	else
    		System.out.println("cant withdrawl");

    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Smith");   
		Current c=new Current(Account.x,2000,p1);
    c.withdraw(2014);
	}

}
