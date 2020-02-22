package lab;

import java.util.*; 
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList <String>a=new ArrayList<>();
    a.add("nani");
    a.add("varma");
    a.add("1varma1");
    a.add("2varma2");
    Collections.sort(a);
    for(String ele: a ) {
    	System.out.println(ele);
    }
    
	}
	

}
