package lab;

public class Exception2
{
	
	 	String name;
	 	float age;
	 	public void details(String name,float age)
	 	{
	 		try
	 		{
	 			if(age<=15)
	 			{
	 				throw new UserException("");
	 			}
	 			else
	 			{
	 				System.out.println(name);
	 				System.out.println(age);
	 			}
	 		}
	 		catch(UserException e)
	 		{
	 			System.out.println("Age of a person should be above 15");
	 		}
	 	}
	 	public static void main(String[] args) 
		{
	 		Exception2 e=new Exception2();
	 		e.details("nani", 22);
	 		System.out.println("--------");
	 		e.details("asdf",10);
	 		
	 		
		}

}
class UserException extends Exception
{
	UserException(String s)
	{
		super(s);
	}
}