
package lab;

public class ClassObjectArray {

		   public static void main(String[] args) {
		      
		      int[] vowels = {1,2,23,4};
		      char[] cfrom= {'s','a','a'};
		      char[] to= {'s','a','i','v'};
		      System.arraycopy(cfrom,2,to,0,1);
		      System.out.println(new String(to));
		      for (int i :vowels) {
		         System.out.println(i);
		      }
		   }
		}
