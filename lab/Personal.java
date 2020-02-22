package lab;

import java.util.Scanner;

/**
 * @author Sujani
 *
 */
public class Personal {

String firstname;
String lastname;
//char gender;
String phonenum;
public enum gen {M,F}

public String getPhonenum() {
return phonenum;
}
public void setPhonenum(String phonenum) {
this.phonenum = phonenum;
}
Personal()
{
firstname="venu";
lastname="gopal";
//gender='m';
//phonenum="";
}

public void display()
  {
     System.out.println("firstname:"+firstname);
     System.out.println("lastname:"+lastname);
     //System.out.println("gender:"+gender);
    // System.out.println("Phonenumber:"+phonenum);
  }

@SuppressWarnings("unlikely-arg-type")
public static void main(String[] args) {
// TODO Auto-generated method stub
	Personal p=new Personal();
Scanner sc=new Scanner(System.in);
System.out.println("enter the phone number");
String phonenum=sc.nextLine();
System.out.println("enter the gender");
String gender = sc.nextLine();

p.display();

System.out.println("Phonenumber:"+phonenum);

if (gender.equalsIgnoreCase(gen.M.toString()))
System.out.println("Gender : Male");
else if(gender.equalsIgnoreCase(gen.F.toString()))
System.out.println("Gender : Female");

}
}