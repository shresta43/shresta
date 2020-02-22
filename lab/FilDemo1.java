package lab;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FilDemo1 {
	public void readTextFileUsingScanner(String file) {
	    try {
	      Scanner sc = new Scanner(new File(file));
	      while (sc.hasNext()) {
	        String str = sc.nextLine();
	        System.out.println(str);
	       /* int i=Integer.parseInt(str);
	        if(i%2==0)
	        System.out.println(i);*/
	      }
	      sc.close();
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilDemo1 d=new FilDemo1();
		
		//StringTokenizer st = new StringTokenizer("d.readTextFileUsingScanner"number.txt"),",");
	  //   while (st.hasMoreTokens()) {
	  //       System.out.println(st.nextToken());
	 //    }
		String[] result = "number.txt".split("\\,");
	     for (int x=0; x<result.length; x++)
	         System.out.println(result[x]);
	}

}
