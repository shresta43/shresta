package lambda.pack;
import java.util.function.*;
@FunctionalInterface
interface NumberTest
{ 
	public double exp(double x,double y);
} 
public class NumberExponent 
{
public static void main(String[] args)
{
   BiFunction<Double,Double,Double> bi=(x,y)->Math.pow(x,y);
  
   System.out.println("exponent is: "+bi.apply(5.0, 2.0));
	
}
}
