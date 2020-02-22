package com.cg.eis.bean;

import java.util.HashMap;
import java.util.Scanner;

public class Employee 
{
	private int id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
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
		this.insuranceScheme = insuranceScheme;
	}
	
Scanner sc=new Scanner(System.in);
	
	public void addEmployee(HashMap<String,Employee> map , Employee emp)	{
		//code to add employee
		System.out.println("enter values");
		String key=sc.next();
		map.put(key,emp);
		
	}
/*		public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		HashMap<String,Employee> map = new HashMap();

}*/
}