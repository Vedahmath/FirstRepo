import java.util.*;
class ArraySum
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("How many elements");
int n=s.nextInt();
int a[]=new int [n];
int sum=0;
for(int i=0;i<n;i++)
{
System.out.println("Enter "+i+" element");
a[i]=s.nextInt();
sum+=a[i];
}
System.out.println("Sum of the all array elements is : "+sum);
}
}
