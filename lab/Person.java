package lab;

public class Person {

	String Fname,lname;
	int age;
	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public char getG() {
		return G;
	}

	public void setG(char g) {
		G = g;
	}
   
public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	char G;
	public Person() {
		// TODO Auto-generated constructor stub
		Fname="nani";
		lname="varma";
		G='M';
	}

		public Person(String fname, String lname, char g) {
		Fname = fname;
		this.lname = lname;
		G = g;
	}



public Person(String fname) {
			//super();
			Fname = fname;
		}

public Person(String fname, int age) {
			//super();
			Fname = fname;
			this.age = age;
		}

public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Person p=new Person();
		//System.out.println("FirstName"+p.Fname);
		//System.out.println("lastName"+p.lname);
		//System.out.println("gender"+p.G);
		//Person p1=new Person("Gowtham","Varma",'m');
		System.out.println("FirstName:"+p.getFname());
		System.out.println("lastName:"+p.getLname());
		System.out.println("age:"+p.getG());	
		
		//System.out.println("FirstName"+p1.Fname);
		//System.out.println("lastName"+p1.lname);
		//System.out.println("gender"+p1.G); 
	}
}
