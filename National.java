import java.util.*;
class National
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of rows");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j==1 || j==n || i==j)
System.out.print(" *");
else
System.out.print("  ");
}
System.out.print("\t");
for(int j=1;j<=n;j++)
{
if(j==1 || i==1 || i==n)
System.out.print(" *");
else
System.out.print("  ");
}
System.out.print("\t");
for(int j=1;j<=n;j++)
{
if(j==1 || i==1 || i==n || j==n || i==n/2)
System.out.print(" *");
else
System.out.print("  ");
}
System.out.println();
}
}
}