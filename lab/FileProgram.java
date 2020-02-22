package lab;
import java.io.FileReader;
import java.io.FileWriter;
public class FileProgram extends Thread 
{
	public static void main(String[] args)throws Exception 
	{
		FileReader fi = new FileReader("F:\\source.txt");
		FileWriter fw = new FileWriter("F:\\target.txt");
		CopyDataThread c = new CopyDataThread(fi,fw);
	}
}
