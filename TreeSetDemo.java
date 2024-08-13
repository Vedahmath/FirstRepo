 import java.io.*;
import java.util.*;
class TreeSetDemo
{
public static void main(String ar[])throws IOException
{
TreeSet s1=new TreeSet();
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
System.out.println("Enter the number of items to be put on tree");
int n=Integer.parseInt(br.readLine());
String s=null;
for(int i=1;i<=n;i++)
{
System.out.println("Enter the "+i+" char");
s=br.readLine();
s1.add(s);
}
System.out.println("\n The items on tree are" +s1);
System.out.println("THe first element on tree is : "+s1.first());
System.out.println("THe total elements on tree are: "+s1.size());
System.out.println("enter the element to be removed");
String rem=br.readLine();
s1.remove(rem);
System.out.println("The items on tree are "+s1);
}
}
