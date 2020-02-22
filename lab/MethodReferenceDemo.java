package lambda.pack;
interface MethodReferenceInterface
{
	MethodReferenceEx display(String a,String b);
}
class MethodReferenceEx 
{
String first,last;
MethodReferenceEx(String first,String last)
{
	this.first=first;
	this.last=last;
	System.out.println(first+" "+last);
}
public String getFirst() {
	return first;
}
public void setFirst(String first) {
	this.first = first;
}
public String getLast() {
	return last;
}
public void setLast(String last) {
	this.last = last;
}
}
public  class MethodReferenceDemo
{
	public static void main(String args[])
	{
		MethodReferenceInterface mr=MethodReferenceEx::new;
		mr.display("nani", "varma");
	}
}

