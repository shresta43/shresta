package com.cg.eis.service;


import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

import java.util.*;

interface EmployeeService
{
	void des();
	void display();
}

public class Services implements EmployeeService 
{
	Employee e = new Employee();
	
	@Override
	public void des()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Salary:");
		int salary = sc.nextInt();
		e.setSalary(salary);
		
		try
		{
			if(salary<=5000 && salary>=3000)
			{
				e.setDesignation("Clerk");
				e.setInsuranceScheme("No Scheme");
			}
			else if(salary>5000 && salary<20000)
			{
				e.setDesignation("System Associate");
				e.setInsuranceScheme("Scheme C");
			}
			
			else if(salary>=20000 && salary<40000)
			{
				e.setDesignation("Programmer");
				e.setInsuranceScheme("Scheme B");
			}
			
			else if(salary>=40000)
			{
				e.setDesignation("Manager");
				e.setInsuranceScheme("Scheme A");
			}
			else
			{
				throw new EmployeeException("Salary cannot be less than 3000");
			}
		}
		catch(EmployeeException ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
	
	@Override
	public void display()
	{
		System.out.println("Employee Salary:"+e.getSalary());
		System.out.println("Employee Designation:"+e.getDesignation());
		System.out.println("Employee Scheme:"+e.getInsuranceScheme());
	}

}
