package lab;
import java.util.*;

public class StringOperation1 
{
	static String s;
	static int ch;
	
	void operations(String s,int ch)
	{
		this.s=s;
		this.ch=ch;
		
		if(ch==1)
		{
			String s1 = s;
			s1=s+s1;
			System.out.println(s1);
		}
		
		if(ch==2)
		{
			String sr = s;
			int n=sr.length()-1;
			for(int i=0;i<n;i+=2)
			{
					sr=sr.replace(sr.charAt(i), '#');
			}
			System.out.println(sr);
		}
		
		if(ch==4)
		{
			String su = s;
			for(int i=0;i<su.length()-1;i+=2)
			{
					char c = su.charAt(i);
					su = su.replace(c, Character.toUpperCase(c));
			}
			System.out.println(su);
		}
		
		if(ch==3)
		{
			String sd = s;
			char[] c = sd.toCharArray();
			int index=0;
			for(int i=0;i<c.length;i++)
			{
				int j;
				for(j=0;j<i;j++)
				{
					if(c[i]==c[j])
					{
						break;
					}
				}
				if(i==j)
				{
					c[index++]=c[i];
				}
			}
			System.out.println(String.valueOf(Arrays.copyOf(c, index)));
		}
	}
	
	public static void main(String[] args)
	{
		StringOperationp1 so = new StringOperationp1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		s=sc.nextLine();
		System.out.println("Choose an option:");
		System.out.println("1.Concatination");
		System.out.println("2.Replace odd positions with #");
		System.out.println("3.Removing duplicate characters");
		System.out.println("4.Replace odd positions with upper case characters");
		ch=sc.nextInt();
		so.operations(s, ch);
		
	}
}
