package lab;
import java.util.Arrays;
import java.util.Scanner;

public class StringPositive
{
	public static String sortString(String input) 
    { 
        char tempArray[] = input.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
	public String add(String str1) {
        String str="";
		int i=0;
		for(i=0;i<str1.length();i++)
		{
			
			if(i%2==0)
			{
			str= str+Character.toUpperCase(str1.charAt(i));
			}
			else
			{
				str= str+str1.charAt(i);
			}
		}
		return str;
	}
	public String rep(String str) {
		for(int i=0;i<str.length();i+=2) {
			str=str.replace( str.charAt(i),'#');
		}
		return str;
	}
      
	public static void main(String[] args) 
	{
		String input="abcdef";
		String str = sortString(input); 
		StringPositive p=new StringPositive();
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String up= p.add(str1);
		String symbol=p.rep(str);
		System.out.println("output String : " + str); 
		if(input.equals(str))
		{
			System.out.println("Positive String");
		}
		else
		{
			System.out.println("negative String");
		}
			
		System.out.println("upperCase : " + up);
		System.out.println("Symbol : " + symbol); 
	}


}
