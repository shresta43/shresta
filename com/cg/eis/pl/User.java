package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Services;

import java.util.*;

public class User  extends Employee
{
	/*Scanner sc=new Scanner(System.in);
	
	public void addEmployee(HashMap<String,Employee> map, Employee emp)	{
		//code to add employee
		String key=sc.next();
		map.put(key,emp);
		System.out.println(map.keySet());
	}*/
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		HashMap<String,Employee> map = new HashMap();
		//Services s = new Services();
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter Employee Name");
		//String name = sc.nextLine();
		//e.setName(name);
		e1.addEmployee(map,e1);
		e2.addEmployee(map,e2);
		e3.addEmployee(map,e3);
		System.out.println(map.keySet());
		//System.out.println("Enter Employee Id:");
		//int id = sc.nextInt();
		//e.setId(id);
		//e1.getDesignation();
		//s.des();
		Set<String> s=map.keySet();
		Iterator<String> i=s.iterator();

		while(i.hasNext()) 
		{
		     String dept=i.next();
		     HashMap<String,Employee> employees=map.get(dept);
		     for(int j=0;j<employees.size();j++)
		     {
		         System.out.print("\n"+employees.get(j)+"\n\n"); 
		     }  
		}
		
		//System.out.println("Employee id:"+e.getId());
		//System.out.println("Employee name:"+e.getName());
		//s.display();
		
		
	}
}
