package lab;

class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}
class Person
{
	String name;
	float age;
	
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public float getAge() 
	{
		
			if(age<=15)
			{
				try
				{
					throw new MyException("Age must be above 15");
				}
				catch(MyException e)
				{
					System.out.println(e.getMessage());
				}
			}
			return age;
	}
	public void setAge(float age) 
	{
		this.age = age;
	}
	
}

public class Account4p1 extends Person
{
	long accNo=1234;
	double balance;
	
	public long getAccNo() 
	{
		accNo = accNo+100;
		return accNo;
	}

	public void setAccNo(long accNo) 
	{
		this.accNo = accNo;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
	void deposit(double amt)
	{
		balance+=amt;
	}
	
	void withdraw(double amt)
	{
		if(balance<500)
		{
			System.out.println("Minimum balance is Rs.500");
			System.out.println("Please maintain the minimal amount");
		}
		if(amt>=balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			balance-=amt;
			System.out.println("Amount withdrwan:"+balance);
		}
	}
	void display()
	{
		System.out.println("Account Number:"+getAccNo());
		System.out.println("Account Holder's Name:"+getName());
		System.out.println("Age:"+getAge());
		System.out.println(toString());
		System.out.println("_________________________");
	}
	
	
	@Override
	public String toString() {
		return "[Current_balance=" + balance + "]";
	}

	public static void main(String[] args)
	{
		SavingsAccount s = new SavingsAccount();
		s.setName("Smith");
		s.setBalance(2000);
		s.setAge(14);
		s.deposit(2000);
		s.display();
		s.setName("Kathy");
		s.setBalance(3000);
		s.setAge(65);
		s.withdraw(1000);
		s.display();
		CurrentAccount c = new CurrentAccount();
		c.withdraw(10000);
	}
}

class SavingsAccount extends Account4p1
{
	final double minbal = 500;

	@Override
	void withdraw(double amt)
	{
		if(amt<balance && amt>minbal)
		{
			balance-=amt;
		}
		else
			System.out.println("Insufficient or Minimum Balance");
	}

	
}
class CurrentAccount extends Account4p1
{
	double overdraftlimit = 10000;

	@Override
	void withdraw(double amt) 
	{
		if(amt<=overdraftlimit)
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}
	
}