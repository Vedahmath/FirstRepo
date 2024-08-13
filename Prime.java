import java.util.*;
class Prime
{
public static void main(String[] arg)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter number");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
boolean b=true;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
b=false;
break;
}
}
if(b)
System.out.println(i);
}
}
}