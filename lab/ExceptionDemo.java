package lab;

public class ExceptionDemo {
	 String firstName;
	 String lastName;
	char gender;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public  String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}	
	ExceptionDemo()
	{
		firstName="gowtham";
		lastName="varma";
		gender='M';
	}
	ExceptionDemo(String firstName,String lastName,char gender)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.gender=gender;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo p=new ExceptionDemo();
		
		System.out.println("Person Details ");
		
		ExceptionDemo p1=new ExceptionDemo("nani","varma",'M');
		System.out.println("__________________ ");
		System.out.println("First Name: "+p1.firstName);
		System.out.println("Last Name: "+p1.lastName);
		System.out.println("Gender: "+p1.gender);
		/*Scanner s= new Scanner(System.in);
		 int phone = s.nextInt();
		System.out.println("Phone: "+phone);*/
		ExceptionDemo p2=new ExceptionDemo( null,null ,'M');
		 try
         {
          if(p2.getFirstName()==null && p2.getLastName()==null)
          {
         	 throw new MyException("not given");
          }
          else
         	 
          {
         	 System.out.println(p2.getFirstName()+" "+p2.getLastName());
          }
			
         }
		 catch(MyException e)
         {
         	System.out.println("name not given");
         	System.out.println(e);	
         }
	}
	}
	class MyException  extends Exception
{
	MyException(String s)
	{  
		  super(s);  
	}  
}

