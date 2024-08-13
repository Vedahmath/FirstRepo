import java.util.*;
class Number
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of rows");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int k=0;k<=n-i-1;k++)
System.out.print(" ");
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}
