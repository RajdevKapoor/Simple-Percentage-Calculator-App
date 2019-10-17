import java.io.*;
import java.util.*;
interface A
{
abstract void reversal();
}
public class String_reversal implements A
{
public void reversal(String str)
{
String reverse;
int i=0;
for(i = str. length() - 1; i >= 0; i--)
{
reverse = reverse + str. charAt(i);
} 
System.out.println(reverse);
}
}
class Main
{
public static void main(String args[]) throws IOException
{
Scanner sc=new Scanner(System.in);
String_reversal obj=new String_reversal();
System.out.println("enter word");
String s=sc.nextLine();
obj.reversal(s);
}
}

