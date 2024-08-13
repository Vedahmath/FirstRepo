 import java.util.*;
class Switch
{
public static void main(String args[])
{
Scanner v=new Scanner(System.in);
System.out.println("Enter any number");
int n=v.nextInt();
for(int i=1;i<=n;i++)
{
switch(i)
{
case 1:System.out.println("one");
	break;
case 2:System.out.println("TwO");
	break;
case 3:System.out.println("THREE");
	break;
default:System.out.println("Greater than THREE");
}
}
}
}