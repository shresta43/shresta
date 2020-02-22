package lab;
import java.io.*;
public class CopyDataThread 
{
	public CopyDataThread(FileReader fi,FileWriter fw)throws Exception
	{
		BufferedReader br = new BufferedReader(fi);
		BufferedWriter bw = new BufferedWriter(fw);
		String data = null;
		int j=10;
		while((data=br.readLine())!=null)
		{
			char[] c = data.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				bw.write(c[i]);
				if(i==j)
				{
					j+=10;
					System.out.println("10 characters copied");
					Thread.sleep(5000);
				}	
			}
			
		}
		br.close();
		bw.close();
		fi.close();
		fw.close();
	}
}
