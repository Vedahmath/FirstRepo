import java.util.*;
class PrimePymd
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number of rows: ");
int n=s.NextInt();
int num=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=20-i;j++)
System.out.print(" ");
int count=1;
for(int j=num;count<=i;j++)
{
boolean b=true;
for(int k=2;k<j;k++)
{
if(j%k==0)
b=false;
break;
}
}
num++;
if(b)
{
System.out.printf("%3d",j);
count++;
}
System.out.println();
}
}
}