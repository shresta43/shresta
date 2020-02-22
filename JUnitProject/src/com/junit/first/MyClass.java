package com.junit.first;

public class MyClass
{
	public int multiply(int x, int y)
	{
		if (x > 999)
			throw new IllegalArgumentException("X should be less tham 999");
			
		
		return x * y;
	}
}