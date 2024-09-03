
import java.util.*;
class Fibo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int f1=0,f2=1,f3,i,n;
System.out.println("Enter the n value:");
n=sc.nextInt();
System.out.print(f1+"  "+f2+"  ");
for(i=2;i<=n;i++)
{
	f3=f1+f2;
	f1=f2;
	f2=f3;
	System.out.print(" "+f3);
}
}
}