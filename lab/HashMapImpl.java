package vjit;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapImpl {
	
	
	static int i=101;
	private int id;
    private	String fname;
	private String lname;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	
	public HashMapImpl(int id, String fname, String lname, double salary, String designation) {
		//super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.designation = designation;
	//	this.insuranceScheme= insuranceScheme;
		i++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		id = i;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
	this.insuranceScheme =insuranceScheme;

	}
	@Override
	public String toString() {
		return "id=" + id + ", Name=" + fname+" "+lname + ", salary=" + salary + ", designation="
				+ designation ;
	}
	
	public void insurance() {
		// TODO Auto-generated method stub
		//Employee e = new Employee() ;
//		Scanner sc = new Scanner(System.in);
			String designation = getDesignation();
			double salary = getSalary();
	if(designation.equalsIgnoreCase("System Associate") && (salary>5000 && salary<20000))
	{
		setInsuranceScheme("SCHEME C");
	}
	else if(designation.equalsIgnoreCase("Programmer") && (salary>=20000 && salary<40000))
	{
		setInsuranceScheme("SCHEME B");
	}
	else if(designation.equalsIgnoreCase("Manager") && salary>=40000 )
	{
		 setInsuranceScheme("SCHEME A");
	}
	else if(designation.equalsIgnoreCase("Clerk") && salary<5000)
	{
		setInsuranceScheme("NO SCHEME");
		}
	}
	public void addElements(HashMap<String, HashMapImpl> list,HashMapImpl e)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key name");
		String s = sc.next();
		list.put(s,e);
		//sc.close();
	}
	public static void removeElement(HashMap<String,HashMapImpl> list,int id)
	{
		

		if(list.containsValue(id))
		{
			
			//list.remove()
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		HashMapImpl e1 = new HashMapImpl(i,"Dimple","tiwari",40000,"nager");
		HashMapImpl e2 = new HashMapImpl(i,"a","tiwari",20000,"mger");
		HashMapImpl e3 = new HashMapImpl(i,"d","wari",4000,"manag");
		HashMapImpl e4 = new HashMapImpl(i,"ie","tiri",30000,"maer");
		HashMapImpl e5 = new HashMapImpl(i,"Dim","ari",4000,"m");
		//int id, String fname, String lname, double salary, String designation
		HashMap<String,HashMapImpl> list = new HashMap<String,HashMapImpl>(); 
		e1.addElements(list, e1);
		e2.addElements(list, e2);
		e3.addElements(list, e3);
		e4.addElements(list, e4);
		e5.addElements(list, e5);
		//System.out.println(list.keySet());
		//System.out.println("Enter the id of employee you want to ");
		//int i = sc.nextInt();
		//removeElement(list,i);
		System.out.println(list);

		
		
		
		
	}

}
