package lambda.pack;

@FunctionalInterface
interface Space
{
public String space(String s);
}

public class SpaceBetChar 
{
public static void main(String[] args)
{
Space s1 =(s)-> { StringBuilder result = new StringBuilder();
for (int i = 0; i < s.length(); i++) {
  if (i > 0) {  
     result.append(" ");
   }
  result.append(s.charAt(i));
}
return result.toString();

};
String str = s1.space("asdfgh");
System.out.println(str);
}

}

