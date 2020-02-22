package lambda.pack;

import java.util.Scanner;
import java.util.function.Function;

public class Factorial
{
public static int factorial(int n)
{
	int res=1;
	for(int i=1;i<=n;i++)
	{
		res=res*i;
	}
	return res;
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num");
	int n=sc.nextInt();
	Function<Integer,Integer> fact=Factorial::factorial;
	System.out.println("factorial of " +n+ " is= "+fact.apply(n));
	sc.close();
}
	
}
