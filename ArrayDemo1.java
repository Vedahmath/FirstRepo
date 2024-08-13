import java.util.*;
class ArrayDemo1
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("How many elements");
int n=s.nextInt();
int a[]=new int [n];
for(int i=0;i<n;i++)
{
System.out.println("Enter "+i+" element");
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
System.out.println(i+" Element is : "+a[i]);
}
}